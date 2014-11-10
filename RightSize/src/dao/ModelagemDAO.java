package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Modelagem;

/**
  * @author daniel.s.oliveira
 */
public class ModelagemDAO extends AbstractDAO {


    public ArrayList<Modelagem> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM modelagem";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Modelagem> listaModelagem = montarObjeto(rs);

            connection.close();
            return listaModelagem;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Modelagem select(BigDecimal codigo) {
    	Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM modelagem WHERE codigo like ?";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigo);
            ResultSet rs = prest.executeQuery();

            ArrayList<Modelagem> listaModelagem = montarObjeto(rs);

            connection.close();
            
            return listaModelagem.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public ArrayList<Modelagem> select(String nome) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM modelagem WHERE nome like ?";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, nome);
            ResultSet rs = prest.executeQuery();

            ArrayList<Modelagem> listaModelagem = montarObjeto(rs);

            connection.close();
            
            return listaModelagem;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<Modelagem> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Modelagem> listaModelagem = new ArrayList<Modelagem>();
        while (rs.next()) {
            Modelagem objeto = new Modelagem();

            BigDecimal codigo = BigDecimal.valueOf( rs.getLong("codigo") );
            String nome = rs.getString("nome");
            char status = rs.getString("status").charAt(0);
            Character genero = rs.getString("genero").charAt(0);
            String descricao = rs.getString("descricao");
            String codigoInternoIndustria = rs.getString("codigo_interno_industria");
            
            objeto.setCodigo(codigo);
            objeto.setNome(nome);
            objeto.setStatus(status);
            objeto.setGenero(genero);
            objeto.setDescricao(descricao);
            objeto.setCodigoInternoIndustria(codigoInternoIndustria);
            
            listaModelagem.add(objeto);
        }
        return listaModelagem;
    }

    public void insert(Modelagem modelagem) {
            String sql = "INSERT INTO modelagem (codigo, nome, status, genero, descricao, codigo_interno_industria) VALUES (modelagem_codigo_seq.Nextval, ?, ?, ?, ?, ?)";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagem.getNome());
            params.add(modelagem.getStatus());
            params.add(modelagem.getGenero());
            params.add(modelagem.getDescricao());
            params.add(modelagem.getCodigoInternoIndustria());
            
            operacaoEscrita(sql, params);
    }

    public void update(Modelagem modelagem) {

            String sql = "UPDATE modelagem SET nome = ?, status = ?, genero = ?, descricao = ?, codigo_interno_industria = ? WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagem.getNome());
            params.add(modelagem.getStatus());
            params.add(modelagem.getGenero());
            params.add(modelagem.getDescricao());
            params.add(modelagem.getCodigoInternoIndustria());
            params.add(modelagem.getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(Modelagem modelagem) {
            String sql = "DELETE FROM modelagem WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagem.getCodigo());
            operacaoEscrita(sql, params);
    }


}
