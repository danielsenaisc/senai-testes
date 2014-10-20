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

/**
  * @author daniel.s.oliveira
 */
public class CategoriaDAO extends AbstractDAO {

	private ArrayList<Categoria> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Categoria> listaPais = new ArrayList<Categoria>();
        
        while (rs.next()) {
        	
            Categoria objeto = new Categoria();

            BigDecimal id = rs.getBigDecimal(Columns.id) ;
            String icone = rs.getString(Columns.icone);
            String image = rs.getString(Columns.imagem);
            String descricao = rs.getString(Columns.descricao);
            BigDecimal categoriaId = rs.getBigDecimal(Columns.categoriaId);
            Categoria categoria = null;
            if(categoriaId != null)
            {
            	categoria = selectById(categoriaId);
            }
            
            objeto.setId(id);
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

            String sql = String.format("SELECT * FROM %s", Tables.categoria);
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

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.categoria, column);
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
    
    public Categoria selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<Categoria> selectByDescricao(String descricao) {
    	return select(Columns.descricao, descricao);
    }
    
    public void insert(Categoria categoria) {
            String sql = "INSERT INTO %s (%s, %s, %s, %s) VALUES (?, ?, ?, ?)";
            String sqlParam = String.format(sql, Tables.categoria, Columns.icone, Columns.imagem, Columns.descricao, Columns.categoriaId);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(categoria.getIcone());
            params.add(categoria.getImagem());
            params.add(categoria.getDescricao());
            BigDecimal categoriaId = categoria.getCategoria() != null ? categoria.getCategoria().getId() : null;
            params.add(categoriaId);
            
            operacaoEscrita(sqlParam, params);
    }
    
    public void update(Categoria categoria) {		
        String sql = "UPDATE %s SET %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?";
        String sqlParam = String.format(sql, Tables.categoria, Columns.icone, Columns.imagem, Columns.descricao, Columns.categoriaId, Columns.id);
        
        ArrayList<Object> params = new ArrayList<Object>();

        params.add(categoria.getIcone());
        params.add(categoria.getImagem());
        params.add(categoria.getDescricao());
        params.add(categoria.getCategoria().getId());
        
        operacaoEscrita(sqlParam, params);
}

    public void delete(Categoria categoria) {
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(categoria.getId());
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
