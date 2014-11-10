package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Continente;
import entidades.Pais;

/**
  * @author daniel.s.oliveira
 */
public class PaisDAO extends AbstractDAO {


    public ArrayList<Pais> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM pais";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Pais> listaPais = montarObjeto(rs);

            connection.close();
            return listaPais;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Pais select(long codigo) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM pais WHERE codigo like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigo);
            ResultSet rs = prest.executeQuery();

            ArrayList<Pais> listaPais = montarObjeto(rs);

            connection.close();
            
            return listaPais.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ArrayList<Pais> select(String nome) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM pais WHERE nome like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, nome);
            ResultSet rs = prest.executeQuery();

            ArrayList<Pais> listaPais = montarObjeto(rs);

            connection.close();
            
            return listaPais;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<Pais> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Pais> listaPais = new ArrayList<Pais>();
        while (rs.next()) {
            Pais objeto = new Pais();

            long codigo = rs.getLong("codigo") ;
            long codigoContinente = rs.getLong("Continente_codigo");
            String nome = rs.getString("nome");
            String sigla = rs.getString("sigla");
            String nacionalidade = rs.getString("nacionalidade");;

            ContinenteDAO continenteDao = new ContinenteDAO();
            Continente continente = continenteDao.select(codigoContinente);
            
            objeto.setCodigo(codigo);
            objeto.setContinente(continente);
            objeto.setNome(nome);
            objeto.setSigla(sigla);
            objeto.setNacionalidade(nacionalidade);
            
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(Pais pais) {
            String sql = "INSERT INTO pais (nome, sigla, Continente_codigo, nacionalidade) VALUES (?, ?, ?, ?);";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(pais.getNome());
            params.add(pais.getSigla());
            params.add(pais.getContinente().getCodigo());
            params.add(pais.getNacionalidade());
            
            operacaoEscrita(sql, params);
    }

    public void update(Pais pais) {

            String sql = "UPDATE pais SET nome = ?, sigla = ?, Continente_codigo = ?, nacionalidade = ? WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(pais.getNome());
            params.add(pais.getSigla());
            params.add(pais.getContinente().getCodigo());
            params.add(pais.getNacionalidade());
            params.add(pais.getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(Pais pais) {
            String sql = "DELETE FROM pais WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(pais.getCodigo());
            operacaoEscrita(sql, params);
    }

}
