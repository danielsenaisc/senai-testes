package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Continente;
import entidades.TipoGrade;
import entidades.Pais;
import entidades.Marca;

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
    
    public TipoGrade select(BigDecimal codigo) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s where codigo like ?", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigo);
            ResultSet rs = prest.executeQuery();

            ArrayList<TipoGrade> listaTipoGrade = montarObjeto(rs);

            connection.close();
            return listaTipoGrade.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<TipoGrade> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<TipoGrade> listaPais = new ArrayList<TipoGrade>();
        while (rs.next()) {
            TipoGrade objeto = new TipoGrade();

            BigDecimal codigo = rs.getBigDecimal("codigo") ;
            String descricao = rs.getString("descricao");
            
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(TipoGrade TipoGrade) {
            String sql = String.format("INSERT INTO %s (codigo, descricao) VALUES (tipo_grade_codigo_seq.Nextval, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(TipoGrade.getDescricao());
            
            operacaoEscrita(sql, params);
    }
    
    public void update(TipoGrade TipoGrade) {

        String sql = String.format("UPDATE %s SET descricao = ? WHERE codigo = ?", TABLE_NAME);

        ArrayList<Object> params = new ArrayList<Object>();
        
        params.add(TipoGrade.getDescricao());
        params.add(TipoGrade.getCodigo());
        
        operacaoEscrita(sql, params);
}

    public void delete(TipoGrade TipoGrade) {
            String sql = String.format("DELETE FROM %s WHERE codigo = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(TipoGrade.getCodigo());
            operacaoEscrita(sql, params);
    }

}
