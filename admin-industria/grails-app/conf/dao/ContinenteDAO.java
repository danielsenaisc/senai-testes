/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import entidades.Continente;

/**
  * @author daniel.s.oliveira
 */
public class ContinenteDAO extends AbstractDAO {

	private ArrayList<Continente> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Continente> listaContinente = new ArrayList<Continente>();
        while (rs.next()) {
            Continente objeto = new Continente();

            BigDecimal id = rs.getBigDecimal(Columns.id) ;
            String nome = rs.getString(Columns.nome);
            String sigla = rs.getString(Columns.sigla);

            objeto.setId(id);
            objeto.setNome(nome);
            objeto.setSigla(sigla);
            
            listaContinente.add(objeto);
        }
        return listaContinente;
    }
	
    public ArrayList<Continente> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", Tables.continente);
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
    
    public ArrayList<Continente> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.continente, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<Continente> listaContinente = montarObjeto(rs);

            connection.close();
            return listaContinente;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Continente selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<Continente> selectByNome(String nome) {
    	return select(Columns.nome, nome);
    }
    
    public void insert(Continente continente) {
            String sql = String.format("INSERT INTO %s (%s, %s) VALUES (?, ?)", Tables.continente, Columns.nome, Columns.sigla);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(continente.getNome());
            params.add(continente.getSigla());
            
            operacaoEscrita(sql, params);
    }

    public void update(Continente continente) {
            String sql = String.format("UPDATE %s SET %s = ?, %s = ? WHERE %s = ?", Tables.continente, Columns.nome, Columns.sigla, Columns.id);

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(continente.getNome());
            params.add(continente.getSigla());
            params.add(continente.getId());
            
            operacaoEscrita(sql, params);
    }
    
    public void delete(Continente continente) {
            ArrayList<Object> params = new ArrayList<Object>();
            params.add(continente.getId());
            delete(Tables.continente, Columns.id, params);
    }
    
    public void deleteById(BigDecimal id) {
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(id);
        delete(Tables.continente, Columns.id, params);
	}
	
	public void deleteByNome(String nome) {
		ArrayList<Object> params = new ArrayList<Object>();
        params.add(nome);
        delete(Tables.continente, Columns.nome, params);
	}
}
