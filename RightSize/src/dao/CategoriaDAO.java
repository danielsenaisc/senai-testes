package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Bidi;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
import entidades.Canal;
import entidades.Continente;
import entidades.Categoria;
import entidades.Pais;
import entidades.Marca;


public class CategoriaDAO extends AbstractDAO {

	private ArrayList<Categoria> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Categoria> listaPais = new ArrayList<Categoria>();
        while (rs.next()) {
            Categoria objeto = new Categoria();

            BigDecimal codigo = rs.getBigDecimal(Columns.id) ;
            String descricao = rs.getString(Columns.descricao);
            String icone = rs.getString(Columns.icone);
            String image = rs.getString(Columns.imagem);
            BigDecimal categoriaCodigo = rs.getBigDecimal(Columns.categoriaCodigo);
            Categoria categoria = null;
            if(categoriaCodigo != null)
            {
            	categoria = selectById(categoriaCodigo);
            }
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            objeto.setIcone(icone);
            objeto.setImagem(image);
            objeto.setCategoria(categoria);
            listaPais.add(objeto);
        }
        return listaPais;
    }
	
    public ArrayList<Categoria> select() {

        Connection connection = Conexao.getConexao();
        try {
        	String sql = "SELECT LEVEL, LPAD (' ', 2 * (LEVEL - 1)) || id \"ID\", icone, imagem, descricao, categoria_id "+
        					"FROM %s START WITH categoria_id is null" +
        					"CONNECT BY PRIOR id = categoria_id";
            String sqlParam = String.format(sql, Tables.categoria);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Categoria> listaCategoria = montarObjeto(rs);

            connection.close();
            return listaCategoria;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ArrayList<Categoria> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = "SELECT LEVEL, LPAD (' ', 2 * (LEVEL - 1)) || id \"ID\", icone, imagem, descricao, categoria_id "+
					"FROM %s START WITH %s like ?" +
					"CONNECT BY PRIOR id = categoria_id";
        	String sqlParam = String.format(sql, Tables.categoria,column);
            
        	PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<Categoria> listaCategoria = montarObjeto(rs);

            connection.close();
            return listaCategoria;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Categoria selectById(BigDecimal codigoCategoria) {
    	return select(Columns.id, codigoCategoria).get(0);
    }

    public ArrayList<Categoria> selectByDescricao(String descricao) {
    	return select(Columns.descricao, descricao);
    }
    
    //não dá pra usar a operacaEscrita
    public void insert(Categoria categoria) {
            String sql = "INSERT INTO %s (%s, %s, %s, %s) VALUES (?, ?, ?, ?)";
            String sqlParam = String.format(sql, Tables.categoria, Columns.icone, Columns.imagem, Columns.descricao, Columns.categoriaCodigo);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(categoria.getIcone());
            params.add(categoria.getImagem());
            params.add(categoria.getDescricao());
            BigDecimal categoriaId = categoria.getCategoria() != null ? categoria.getCategoria().getCodigo() : null;
            params.add(categoriaId);
            
            operacaoEscrita(sqlParam, params);
    }
    
    public void update(Categoria categoria) {		
        String sql = "UPDATE %s SET %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?";
        String sqlParam = String.format(sql, Tables.categoria, Columns.icone, Columns.imagem, Columns.descricao, Columns.categoriaCodigo, Columns.id);
        
        ArrayList<Object> params = new ArrayList<Object>();

        params.add(categoria.getIcone());
        params.add(categoria.getImagem());
        params.add(categoria.getDescricao());
        //params.add(categoria.getCategoria().getCodigo());
        
        operacaoEscrita(sqlParam, params);
}

    public void delete(Categoria categoria) {
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(categoria.getCodigo());
        delete(Tables.categoria, Columns.id, params);
	}
	
	public void deleteById(BigDecimal id) {
	    ArrayList<Object> params = new ArrayList<Object>();
	    params.add(id);
	    delete(Tables.categoria, Columns.id, params);
	}
	
	public void deleteByDescricao(String descricao) {
		ArrayList<Object> params = new ArrayList<Object>();
	    params.add(descricao);
	    delete(Tables.categoria, Columns.descricao, params);
	}

}
