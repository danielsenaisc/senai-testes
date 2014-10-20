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
import entidades.Pais;

/**
  * @author daniel.s.oliveira
 */
public class PaisDAO extends AbstractDAO {

    private ArrayList<Pais> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Pais> listaPais = new ArrayList<Pais>();
        while (rs.next()) {
            Pais objeto = new Pais();

            BigDecimal id = rs.getBigDecimal(Columns.id) ;
            BigDecimal idContinente = rs.getBigDecimal(Columns.continenteId);
            String nome = rs.getString(Columns.nome);
            String sigla = rs.getString(Columns.sigla);
            String nacionalidade = rs.getString(Columns.nacionalidade);;

            ContinenteDAO continenteDao = new ContinenteDAO();
            Continente continente = continenteDao.selectById(idContinente);
            
            objeto.setId(id);
            objeto.setContinente(continente);
            objeto.setNome(nome);
            objeto.setSigla(sigla);
            objeto.setNacionalidade(nacionalidade);
            
            listaPais.add(objeto);
        }
        return listaPais;
    }
	
    public ArrayList<Pais> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s",Tables.pais);
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
    
    public ArrayList<Pais> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.pais, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<Pais> listaPais = montarObjeto(rs);

            connection.close();
            return listaPais;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Pais selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }
    
    public ArrayList<Pais> selectByNome(String nome) {
    	return select(Columns.nome, nome);
    }
        
    public void insert(Pais pais) {
            String sql = "INSERT INTO %s (%s, %s, %s, %s) VALUES (?, ?, ?, ?)";
            String sqlParam = String.format(sql, Tables.pais, Columns.nome, Columns.sigla, Columns.continenteId, Columns.nacionalidade);
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(pais.getNome());
            params.add(pais.getSigla());
            params.add(pais.getContinente().getId());
            params.add(pais.getNacionalidade());
            
            operacaoEscrita(sqlParam, params);
    }

    public void update(Pais pais) {

            String sql = "UPDATE %s SET %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?";
            String sqlParam = String.format(sql, Tables.pais, Columns.nome, Columns.sigla, Columns.continenteId, Columns.nacionalidade, Columns.id);

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(pais.getNome());
            params.add(pais.getSigla());
            params.add(pais.getContinente().getId());
            params.add(pais.getNacionalidade());
            params.add(pais.getId());
            
            operacaoEscrita(sqlParam, params);
    }
    
    public void delete(Pais pais) {
            ArrayList<Object> params = new ArrayList<Object>();
            params.add(pais.getId());
            delete(Tables.pais, Columns.id, params);
    }
    
    public void deleteById(BigDecimal id) {
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(id);
        delete(Tables.pais, Columns.id, params);
	}
	
	public void deleteByNome(String nome) {
		ArrayList<Object> params = new ArrayList<Object>();
        params.add(nome);
        delete(Tables.pais, Columns.nome, params);
	}

}
