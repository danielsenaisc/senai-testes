package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Continente;
import entidades.TamanhoTipoGrade;
import entidades.Pais;
import entidades.Marca;
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
    
    public TamanhoTipoGrade select(BigDecimal codigo) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s where codigo like ?", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigo);
            ResultSet rs = prest.executeQuery();

            ArrayList<TamanhoTipoGrade> listaTamanhoTipoGrade = montarObjeto(rs);

            connection.close();
            return listaTamanhoTipoGrade.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<TamanhoTipoGrade> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<TamanhoTipoGrade> listaPais = new ArrayList<TamanhoTipoGrade>();
        while (rs.next()) {
            TamanhoTipoGrade objeto = new TamanhoTipoGrade();

            BigDecimal codigo = rs.getBigDecimal("codigo") ;
            String descricao = rs.getString("descricao");
            BigDecimal tipoGradeCodigo = rs.getBigDecimal("tipo_grade_codigo");
            
            TipoGradeDAO tipoGradeDAO = new TipoGradeDAO();
            TipoGrade tipoGrade = tipoGradeDAO.select(tipoGradeCodigo);
            
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            objeto.setTipoGrade(tipoGrade);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(TamanhoTipoGrade tamanhoTipoGrade) {
            String sql = String.format("INSERT INTO %s (codigo, descricao, tipo_grade_codigo) VALUES (tamanho_tipo_grade_seq.Nextval, ?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(tamanhoTipoGrade.getCodigo());
            params.add(tamanhoTipoGrade.getDescricao());
            params.add(tamanhoTipoGrade.getTipoGrade().getCodigo());
            
            operacaoEscrita(sql, params);
    }
    
    public void update(TamanhoTipoGrade tamanhoTipoGrade) {

        String sql = String.format("UPDATE %s SET descricao = ?, tipo_grade_codigo = ? WHERE codigo = ?", TABLE_NAME);

        ArrayList<Object> params = new ArrayList<Object>();

        params.add(tamanhoTipoGrade.getDescricao());
        params.add(tamanhoTipoGrade.getTipoGrade().getCodigo());
        params.add(tamanhoTipoGrade.getCodigo());
        operacaoEscrita(sql, params);
}

    public void delete(TamanhoTipoGrade tamanhoTipoGrade) {
            String sql = String.format("DELETE FROM %s WHERE codigo = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(tamanhoTipoGrade.getCodigo());
            operacaoEscrita(sql, params);
    }

}
