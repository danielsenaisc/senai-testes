package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Continente;
import entidades.TipoMedida;
import entidades.Pais;
import entidades.Marca;

/**
  * @author daniel.s.oliveira
 */
public class TipoMedidaDAO extends AbstractDAO {

	private static String TABLE_NAME = "tipo_medida";

    public ArrayList<TipoMedida> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<TipoMedida> listaTipoMedida = montarObjeto(rs);

            connection.close();
            return listaTipoMedida;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public TipoMedida select(BigDecimal codigo) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s where codigo like ?", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigo);
            ResultSet rs = prest.executeQuery();

            ArrayList<TipoMedida> listaTipoMedida = montarObjeto(rs);

            connection.close();
            return listaTipoMedida.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<TipoMedida> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<TipoMedida> listaPais = new ArrayList<TipoMedida>();
        while (rs.next()) {
            TipoMedida objeto = new TipoMedida();

            BigDecimal codigo = rs.getBigDecimal("codigo") ;
            String descricao = rs.getString("descricao");
            String abreviacao = rs.getString("abreviacao");
            String nome = rs.getString("nome");
            String figuraFormaMedida = rs.getString("figura_forma_medida");
            
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            objeto.setAbreviacao(abreviacao);
            objeto.setFiguraFormaMedida(figuraFormaMedida);
            objeto.setNome(nome);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(TipoMedida tipoMedida) {
            String sql = String.format("INSERT INTO %s (codigo, descricao, abreviacao, nome, figura_forma_medida) VALUES (tipo_medida_codigo_seq.Nextval, ?, ?, ?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(tipoMedida.getDescricao());
            params.add(tipoMedida.getAbreviacao());
            params.add(tipoMedida.getNome());
            params.add(tipoMedida.getFiguraFormaMedida());
            
            operacaoEscrita(sql, params);
    }
    
    public void update(TipoMedida tipoMedida) {

        String sql = String.format("UPDATE %s SET descricao = ?, abreviacao = ?, nome = ?, figura_forma_medida = ? WHERE codigo = ?", TABLE_NAME);

        ArrayList<Object> params = new ArrayList<Object>();
        
        params.add(tipoMedida.getDescricao());
        params.add(tipoMedida.getAbreviacao());
        params.add(tipoMedida.getNome());
        params.add(tipoMedida.getFiguraFormaMedida());
        params.add(tipoMedida.getCodigo());
        
        operacaoEscrita(sql, params);
}

    public void delete(TipoMedida tipoMedida) {
            String sql = String.format("DELETE FROM %s WHERE codigo = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(tipoMedida.getCodigo());
            operacaoEscrita(sql, params);
    }

}
