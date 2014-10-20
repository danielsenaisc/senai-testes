package dao;
//TODO PRONTO
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import comum.Columns;
import comum.Tables;
import entidades.Marca;

/**
  * @author daniel.s.oliveira
 */
public class MarcaDAO extends AbstractDAO {

	private ArrayList<Marca> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Marca> listaMarca = new ArrayList<Marca>();
        while (rs.next()) {
            Marca objeto = new Marca();

            BigDecimal id = rs.getBigDecimal(Columns.id) ;
            String nome = rs.getString(Columns.nome);
            String descricao = rs.getString(Columns.descricao);
            String logomarca = rs.getString(Columns.logomarca);
            Date dataCriacao = rs.getDate(Columns.dataCriacao);
            String genero = rs.getString(Columns.genero);
            short idadeInicial = rs.getShort(Columns.idadeInicial);
            short idadeFinal = rs.getShort(Columns.idadeFinal);
            String status = rs.getString(Columns.status);
            
            objeto.setId(id);
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
	
    public ArrayList<Marca> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", Tables.marca);
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
    
    public ArrayList<Marca> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.marca, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<Marca> listaMarca = montarObjeto(rs);

            connection.close();
            return listaMarca;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public Marca selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<Marca> selectByNome(String nome) {
    	return select(Columns.nome, nome);
    }
        
    public void insert(Marca marca) {
            String sql = "INSERT INTO %s (%s, %s, %s, %s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            String sqlParam = String.format(sql, Tables.marca, Columns.nome, Columns.descricao, Columns.logomarca, Columns.dataCriacao, 
            		Columns.genero, Columns.idadeInicial, Columns.idadeFinal, Columns.status);
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(marca.getNome());
            params.add(marca.getDescricao());
            params.add(marca.getLogomarca());
            params.add(marca.getDataCriacao());
            params.add(marca.getGenero());
            params.add(marca.getIdadeInicial());
            params.add(marca.getIdadeFinal());
            params.add(marca.getStatus());
            
            operacaoEscrita(sqlParam, params);
    }

    public void update(Marca marca) {

            String sql = "UPDATE %s SET %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?";
            String sqlParam = String.format(sql, Tables.marca, Columns.nome, Columns.descricao, Columns.logomarca, Columns.dataCriacao, 
            		Columns.genero, Columns.idadeInicial, Columns.idadeFinal, Columns.status, Columns.id);
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(marca.getNome());
            params.add(marca.getDescricao());
            params.add(marca.getLogomarca());
            params.add(marca.getDataCriacao());
            params.add(marca.getGenero());
            params.add(marca.getIdadeInicial());
            params.add(marca.getIdadeFinal());
            params.add(marca.getStatus());
            params.add(marca.getId());
            
            operacaoEscrita(sqlParam, params);
    }

    public void delete(Marca marca) {
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(marca.getId());
        delete(Tables.marca, Columns.id, params);
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
