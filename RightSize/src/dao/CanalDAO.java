package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Canal;
import comum.*;

/**
  * @author daniel.s.oliveira
 */
public class CanalDAO extends AbstractDAO {


    private ArrayList<Canal> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Canal> listaCanal = new ArrayList<Canal>();
        while (rs.next()) {
            Canal objeto = new Canal();

            long codigo = rs.getLong(Columns.id) ;
            String descricao =  rs.getString(Columns.descricao); //TODO CONSERTAR NOME DO CAMPO NO BD
            
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            
            listaCanal.add(objeto);
        }
        return listaCanal;
    }
    
    public ArrayList<Canal> select() {
        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s",Tables.canal);
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
    
    public ArrayList<Canal> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.canal, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<Canal> listaCanal = montarObjeto(rs);

            connection.close();
            return listaCanal;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Canal selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<Canal> selectByDescricao(String descricao) {
    	return select(Columns.descricao, descricao);
    }
    
    public void insert(Canal canal) {
        String sql = String.format("insert into %s (%s) values (?)", Tables.canal, Columns.descricao);
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(canal.getDescricao());            
        operacaoEscrita(sql, params);
    }

    public void update(Canal canal) {
        	String sql = String.format("UPDATE %s SET %s = ? WHERE %s = ?", Tables.canal, Columns.descricao, Columns.id);

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(canal.getDescricao());
            params.add(canal.getCodigo());
            
            operacaoEscrita(sql, params);
    }
    
    public void delete(Canal canal) {
            ArrayList<Object> params = new ArrayList<Object>();
            params.add(canal.getCodigo());
            delete(Tables.canal, Columns.id, params);
    }
    
    public void deleteById(BigDecimal id) {
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(id);
        delete(Tables.canal, Columns.id, params);
	}
	
	public void deleteByDescricao(String descricao) {
		ArrayList<Object> params = new ArrayList<Object>();
        params.add(descricao);
        delete(Tables.canal, Columns.descricao, params);
	}
}
