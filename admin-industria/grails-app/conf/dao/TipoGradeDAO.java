package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
import entidades.TipoGrade;

/**
  * @author daniel.s.oliveira
 */
public class TipoGradeDAO extends AbstractDAO {

	private static String TABLE_NAME = "tipo_grade";

    public ArrayList<TipoGrade> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<TipoGrade> listaTipoGrade = montarObjeto(rs);

            connection.close();
            return listaTipoGrade;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ArrayList<TipoGrade> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.marca, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<TipoGrade> listaTipoGrade = montarObjeto(rs);

            connection.close();
            return listaTipoGrade;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public TipoGrade selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<TipoGrade> selectByDescricao(String descricao) {
    	return select(Columns.descricao, descricao);
    }    
    
    
    
    private ArrayList<TipoGrade> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<TipoGrade> listaPais = new ArrayList<TipoGrade>();
        while (rs.next()) {
            TipoGrade objeto = new TipoGrade();

            BigDecimal id = rs.getBigDecimal("id") ;
            String descricao = rs.getString("descricao");
            
            objeto.setId(id);
            objeto.setDescricao(descricao);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(TipoGrade TipoGrade) {
            String sql = String.format("INSERT INTO %s (id, descricao) VALUES (tipo_grade_id_seq.Nextval, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(TipoGrade.getDescricao());
            
            operacaoEscrita(sql, params);
    }
    
    public void update(TipoGrade TipoGrade) {

        String sql = String.format("UPDATE %s SET descricao = ? WHERE id = ?", TABLE_NAME);

        ArrayList<Object> params = new ArrayList<Object>();
        
        params.add(TipoGrade.getDescricao());
        params.add(TipoGrade.getId());
        
        operacaoEscrita(sql, params);
}

    public void delete(TipoGrade TipoGrade) {
            String sql = String.format("DELETE FROM %s WHERE id = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(TipoGrade.getId());
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
