package dao;
//TODO PRONTO
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
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
    
    public ArrayList<Modelagem> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.modelagem, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<Modelagem> listaModelagem = montarObjeto(rs);

            connection.close();
            return listaModelagem;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    
    public Modelagem selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<Modelagem> selectByNome(String nome) {
    	return select(Columns.nome, nome);
    }
    
    private ArrayList<Modelagem> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Modelagem> listaModelagem = new ArrayList<Modelagem>();
        while (rs.next()) {
            Modelagem objeto = new Modelagem();

            BigDecimal id = BigDecimal.valueOf( rs.getLong("id") );
            String nome = rs.getString("nome");
            String status = rs.getString("status");
            String genero = rs.getString("genero");
            String descricao = rs.getString("descricao");
            String idInternoIndustria = rs.getString("id_interno_industria");
            
            objeto.setId(id);
            objeto.setNome(nome);
            objeto.setStatus(status);
            objeto.setGenero(genero);
            objeto.setDescricao(descricao);
            objeto.setCodigoInternoIndustria(idInternoIndustria);
            
            listaModelagem.add(objeto);
        }
        return listaModelagem;
    }

    public void insert(Modelagem modelagem) {
            String sql = "INSERT INTO modelagem (id, nome, status, genero, descricao, id_interno_industria) VALUES (modelagem_id_seq.Nextval, ?, ?, ?, ?, ?)";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagem.getNome());
            params.add(modelagem.getStatus());
            params.add(modelagem.getGenero());
            params.add(modelagem.getDescricao());
            params.add(modelagem.getCodigoInternoIndustria());
            
            operacaoEscrita(sql, params);
    }

    public void update(Modelagem modelagem) {

            String sql = "UPDATE modelagem SET nome = ?, status = ?, genero = ?, descricao = ?, id_interno_industria = ? WHERE id = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagem.getNome());
            params.add(modelagem.getStatus());
            params.add(modelagem.getGenero());
            params.add(modelagem.getDescricao());
            params.add(modelagem.getCodigoInternoIndustria());
            params.add(modelagem.getId());
            
            operacaoEscrita(sql, params);
    }

    public void delete(Modelagem modelagem) {
            String sql = "DELETE FROM modelagem WHERE id = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagem.getId());
            operacaoEscrita(sql, params);
    }

    public void deleteById(BigDecimal id) {
	    ArrayList<Object> params = new ArrayList<Object>();
	    params.add(id);
	    delete(Tables.marca, Columns.id, params);
	}
	
	public void deleteByNome(String nome) {
		ArrayList<Object> params = new ArrayList<Object>();
	    params.add(nome);
	    delete(Tables.marca, Columns.nome, params);
	}

}
