/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Continente;

/**
  * @author daniel.s.oliveira
 */
public class ContinenteDAO extends AbstractDAO {


    public ArrayList<Continente> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM continente";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Continente> listaContinente = montarObjeto(rs);

            connection.close();
            return listaContinente;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Continente select(long codigoContinente) {
    	Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM continente WHERE codigo like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigoContinente);
            ResultSet rs = prest.executeQuery();

            ArrayList<Continente> listaContinente = montarObjeto(rs);

            connection.close();
            
            return listaContinente.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public ArrayList<Continente> select(String nome) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM continente WHERE nome like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, nome);
            ResultSet rs = prest.executeQuery();

            ArrayList<Continente> listaContinente = montarObjeto(rs);

            connection.close();
            
            return listaContinente;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<Continente> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Continente> listaContinente = new ArrayList<Continente>();
        while (rs.next()) {
            Continente objeto = new Continente();

            long codigo = rs.getLong("codigo") ;
            String nome = rs.getString("nome");
            String sigla = rs.getString("sigla");

            objeto.setCodigo(codigo);
            objeto.setNome(nome);
            objeto.setSigla(sigla);
            
            listaContinente.add(objeto);
        }
        return listaContinente;
    }

    
    public void insert(Continente continente) {
            String sql = "INSERT INTO continente (nome, sigla) VALUES (?, ?);";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(continente.getNome());
            params.add(continente.getSigla());
            
            operacaoEscrita(sql, params);
    }

    public void update(Continente continente) {

            String sql = "UPDATE continente SET nome = ?, sigla = ? WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(continente.getNome());
            params.add(continente.getSigla());
            params.add(continente.getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(Continente continente) {
            String sql = "DELETE FROM continente WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(continente.getCodigo());
            operacaoEscrita(sql, params);
    }


}
