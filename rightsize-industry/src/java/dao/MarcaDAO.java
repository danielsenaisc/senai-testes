package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import entidades.Marca;

/**
  * @author daniel.s.oliveira
 */
public class MarcaDAO extends AbstractDAO {


    public ArrayList<Marca> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM marca";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Marca> listaMarca = montarObjeto(rs);

            connection.close();
            return listaMarca;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Marca select(long codigo) {
    	Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM marca WHERE codigo like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigo);
            ResultSet rs = prest.executeQuery();

            ArrayList<Marca> listaMarca = montarObjeto(rs);

            connection.close();
            
            return listaMarca.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public ArrayList<Marca> select(String nome) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM marca WHERE nome like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, nome);
            ResultSet rs = prest.executeQuery();

            ArrayList<Marca> listaMarca = montarObjeto(rs);

            connection.close();
            
            return listaMarca;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<Marca> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Marca> listaMarca = new ArrayList<Marca>();
        while (rs.next()) {
            Marca objeto = new Marca();

            long codigo = rs.getLong("codigo") ;
            String nome = rs.getString("nome");
            String descricao = rs.getString("descricao");
            String logomarca = rs.getString("logomarca");
            Date dataCriacao = rs.getDate("data_criacao");
            char genero = rs.getString("genero").charAt(0);
            short idadeInicial = rs.getShort("idade_inicial");
            short idadeFinal = rs.getShort("idade_final");
            char status = rs.getString("status").charAt(0);
            
            objeto.setCodigo(codigo);
            objeto.setNome(nome);
            objeto.setDescricao(descricao);
            objeto.setLogomarca(logomarca);
            objeto.setDataCriacao(dataCriacao);
            objeto.setGenero(genero);
            objeto.setIdadeInicial(idadeInicial);
            objeto.setIdadeFinal(idadeFinal);
            objeto.setStatus(status);
            
            listaMarca.add(objeto);
        }
        return listaMarca;
    }

    
    public void insert(Marca marca) {
            String sql = "INSERT INTO marca (nome, descricao, logomarca, data_criacao, genero, idade_inicial, idade_final, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(marca.getNome());
            params.add(marca.getDescricao());
            params.add(marca.getLogomarca());
            params.add(marca.getDataCriacao());
            params.add(marca.getGenero());
            params.add(marca.getIdadeInicial());
            params.add(marca.getIdadeFinal());
            params.add(marca.getStatus());
            
            operacaoEscrita(sql, params);
    }

    public void update(Marca marca) {

            String sql = "UPDATE marca SET nome = ?, descricao = ?, logomarca = ?, data_criacao = ?, genero = ?, idade_inicial = ?, idade_final = ?, status = ? WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(marca.getNome());
            params.add(marca.getDescricao());
            params.add(marca.getLogomarca());
            params.add(marca.getDataCriacao());
            params.add(marca.getGenero());
            params.add(marca.getIdadeInicial());
            params.add(marca.getIdadeFinal());
            params.add(marca.getStatus());
            params.add(marca.getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(Marca marca) {
            String sql = "DELETE FROM marca WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(marca.getCodigo());
            operacaoEscrita(sql, params);
    }


}
