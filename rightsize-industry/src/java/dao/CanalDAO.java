package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Canal;

/**
  * @author daniel.s.oliveira
 */
public class CanalDAO extends AbstractDAO {


    public ArrayList<Canal> select() {
        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM canal";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Canal> listaCanal = montarObjeto(rs);

            connection.close();
            return listaCanal;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Canal select(long codigoCanal) {
    	Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM canal WHERE codigo like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigoCanal);
            ResultSet rs = prest.executeQuery();

            ArrayList<Canal> listaCanal = montarObjeto(rs);

            connection.close();
            
            return listaCanal.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public ArrayList<Canal> select(String descricao) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM canal WHERE descricao like ?;"; //TODO CONSERTAR NOME DO CAMPO NO BD
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, descricao);
            ResultSet rs = prest.executeQuery();

            ArrayList<Canal> listaCanal = montarObjeto(rs);

            connection.close();
            
            return listaCanal;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<Canal> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Canal> listaCanal = new ArrayList<Canal>();
        while (rs.next()) {
            Canal objeto = new Canal();

            long codigo = rs.getLong("codigo") ;
            String descricao =  rs.getString("descricao"); //TODO CONSERTAR NOME DO CAMPO NO BD
            
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            
            listaCanal.add(objeto);
        }
        return listaCanal;
    }
    
    public void insert(Canal canal) {
            String sql = "INSERT INTO canal (descricao) VALUES (?);";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(canal.getDescricao());
            
            operacaoEscrita(sql, params);
    }

    public void update(Canal canal) {
            String sql = "UPDATE canal SET descricao = ? WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(canal.getDescricao());
            params.add(canal.getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(Canal canal) {
            String sql = "DELETE FROM canal WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(canal.getCodigo());
            operacaoEscrita(sql, params);
    }


}
