package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
import entidades.Categoria;
import entidades.Modelagem;
import entidades.ModelagemCategoria;

/**
  * @author daniel.s.oliveira
 */
public class ModelagemCategoriaDAO extends AbstractDAO {

	private static String TABLE_NAME = "modelagem_categoria";

    public ArrayList<ModelagemCategoria> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<ModelagemCategoria> listaModelagemCategoria = montarObjeto(rs);

            connection.close();
            return listaModelagemCategoria;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    private ArrayList<ModelagemCategoria> montarObjeto(ResultSet rs) throws SQLException {
    	ArrayList<ModelagemCategoria> listaPais = new ArrayList<ModelagemCategoria>();
    	while (rs.next()) {
    		ModelagemCategoria objeto = new ModelagemCategoria();
    		
    		BigDecimal idModelagem = rs.getBigDecimal("modelagem_id") ;
    		BigDecimal idCategoria = rs.getBigDecimal("categoria_id");
    		
    		ModelagemDAO modelagemDao = new ModelagemDAO();
    		Modelagem modelagem = modelagemDao.selectById(idModelagem);
    		
    		CategoriaDAO categoriaDAO = new CategoriaDAO();
    		Categoria categoria = categoriaDAO.selectById(idCategoria);
    		
    		objeto.setModelagem(modelagem);
    		objeto.setCategoria(categoria);
    		listaPais.add(objeto);
    	}
    	return listaPais;
    }
    
    public ArrayList<ModelagemCategoria> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.marca, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<ModelagemCategoria> listaModelagemCategoria = montarObjeto(rs);

            connection.close();
            return listaModelagemCategoria;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ModelagemCategoria selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<ModelagemCategoria> selectByNome(String nome) {
    	return select(Columns.nome, nome);
    }
        
    

    
    public void insert(ModelagemCategoria modelagemCategoria) {
            String sql = String.format("INSERT INTO %s (modelagem_id, categoria_id) VALUES (?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagemCategoria.getModelagem().getId());
            params.add(modelagemCategoria.getCategoria().getId());
            
            operacaoEscrita(sql, params);
    }

    public void delete(ModelagemCategoria modelagemCategoria) {
            String sql = String.format("DELETE FROM %s WHERE modelagem_id = ? and categoria_id = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagemCategoria.getModelagem().getId());
            params.add(modelagemCategoria.getCategoria().getId());
            operacaoEscrita(sql, params);
    }

}
