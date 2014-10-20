package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
import entidades.TamanhoTipoGrade;
import entidades.TipoGrade;

/**
  * @author daniel.s.oliveira
 */
public class TamanhoTipoGradeDAO extends AbstractDAO {

	private static String TABLE_NAME = "tamanho_tipo_grade";

    public ArrayList<TamanhoTipoGrade> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<TamanhoTipoGrade> listaTamanhoTipoGrade = montarObjeto(rs);

            connection.close();
            return listaTamanhoTipoGrade;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ArrayList<TamanhoTipoGrade> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.marca, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<TamanhoTipoGrade> listaTamanhoTipoGrade = montarObjeto(rs);

            connection.close();
            return listaTamanhoTipoGrade;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public TamanhoTipoGrade selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<TamanhoTipoGrade> selectByDescricao(String descricao) {
    	return select(Columns.descricao, descricao);
    }    
    
    private ArrayList<TamanhoTipoGrade> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<TamanhoTipoGrade> listaPais = new ArrayList<TamanhoTipoGrade>();
        while (rs.next()) {
            TamanhoTipoGrade objeto = new TamanhoTipoGrade();

            BigDecimal id = rs.getBigDecimal("id") ;
            String descricao = rs.getString("descricao");
            BigDecimal tipoGradeId = rs.getBigDecimal("tipo_grade_id");
            
            TipoGradeDAO tipoGradeDAO = new TipoGradeDAO();
            TipoGrade tipoGrade = tipoGradeDAO.selectById(tipoGradeId);
            
            objeto.setId(id);
            objeto.setDescricao(descricao);
            objeto.setTipoGrade(tipoGrade);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(TamanhoTipoGrade tamanhoTipoGrade) {
            String sql = String.format("INSERT INTO %s (id, descricao, tipo_grade_id) VALUES (tamanho_tipo_grade_seq.Nextval, ?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(tamanhoTipoGrade.getId());
            params.add(tamanhoTipoGrade.getDescricao());
            params.add(tamanhoTipoGrade.getTipoGrade().getId());
            
            operacaoEscrita(sql, params);
    }
    
    public void update(TamanhoTipoGrade tamanhoTipoGrade) {

        String sql = String.format("UPDATE %s SET descricao = ?, tipo_grade_id = ? WHERE id = ?", TABLE_NAME);

        ArrayList<Object> params = new ArrayList<Object>();

        params.add(tamanhoTipoGrade.getDescricao());
        params.add(tamanhoTipoGrade.getTipoGrade().getId());
        params.add(tamanhoTipoGrade.getId());
        operacaoEscrita(sql, params);
}

    public void delete(TamanhoTipoGrade tamanhoTipoGrade) {
            String sql = String.format("DELETE FROM %s WHERE id = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(tamanhoTipoGrade.getId());
            operacaoEscrita(sql, params);
    }

    public void deleteById(BigDecimal id) {
	    ArrayList<Object> params = new ArrayList<Object>();
	    params.add(id);
	    delete(Tables.marca, Columns.id, params);
	}
	
	public void deleteByDescricao(String descricao) {
		ArrayList<Object> params = new ArrayList<Object>();
	    params.add(descricao);
	    delete(Tables.marca, Columns.descricao, params);
	}
}
