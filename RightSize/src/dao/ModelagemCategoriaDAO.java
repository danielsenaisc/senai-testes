package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

            BigDecimal codigoModelagem = rs.getBigDecimal("modelagem_codigo") ;
            BigDecimal codigoCategoria = rs.getBigDecimal("categoria_codigo");
            
            ModelagemDAO modelagemDao = new ModelagemDAO();
            Modelagem modelagem = modelagemDao.select(codigoModelagem);
            
            CategoriaDAO categoriaDAO = new CategoriaDAO();
            Categoria categoria = categoriaDAO.selectById(codigoCategoria);
            
            objeto.setModelagem(modelagem);
            objeto.setCategoria(categoria);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(ModelagemCategoria modelagemCategoria) {
            String sql = String.format("INSERT INTO %s (modelagem_codigo, categoria_codigo) VALUES (?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagemCategoria.getModelagem().getCodigo());
            params.add(modelagemCategoria.getCategoria().getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(ModelagemCategoria modelagemCategoria) {
            String sql = String.format("DELETE FROM %s WHERE modelagem_codigo = ? and categoria_codigo = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagemCategoria.getModelagem().getCodigo());
            params.add(modelagemCategoria.getCategoria().getCodigo());
            operacaoEscrita(sql, params);
    }

}
