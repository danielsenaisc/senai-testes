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
import entidades.PadraoMedida;

/**
  * @author daniel.s.oliveira
 */
public class PadraoMedidaDAO extends AbstractDAO {


    public ArrayList<PadraoMedida> select() {
        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM padrao_medida";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<PadraoMedida> listaPadraoMedida = montarObjeto(rs);

            connection.close();
            return listaPadraoMedida;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ArrayList<PadraoMedida> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.padraoMedida, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<PadraoMedida> listaPadraoMedida = montarObjeto(rs);

            connection.close();
            return listaPadraoMedida;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    
    public PadraoMedida selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<PadraoMedida> selectByDescricao(String descricao) {
    	return select(Columns.nome, descricao);
    }
    
    private ArrayList<PadraoMedida> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<PadraoMedida> listaPadraoMedida = new ArrayList<PadraoMedida>();
        while (rs.next()) {
            PadraoMedida objeto = new PadraoMedida();

            BigDecimal id = rs.getBigDecimal("id") ;
            String descricao =  rs.getString("descricao");
            
            objeto.setId(id);
            objeto.setDescricao(descricao);
            
            listaPadraoMedida.add(objeto);
        }
        return listaPadraoMedida;
    }

    
    public void insert(PadraoMedida padraoMedida) {
            String sql = "insert into padrao_medida (id, descricao) values (padraoMedida_id_seq.Nextval, ?)";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(padraoMedida.getDescricao());
            
            operacaoEscrita(sql, params);
    }

    public void update(PadraoMedida padraoMedida) {
            String sql = "UPDATE padrao_medida SET descricao = ? WHERE id = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(padraoMedida.getDescricao());
            params.add(padraoMedida.getId());
            
            operacaoEscrita(sql, params);
    }

    public void delete(PadraoMedida padraoMedida) {
            String sql = "DELETE FROM padrao_medida WHERE id = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(padraoMedida.getId());
            operacaoEscrita(sql, params);
    }

    public void deleteById(BigDecimal id) {
	    ArrayList<Object> params = new ArrayList<Object>();
	    params.add(id);
	    delete(Tables.marca, Columns.id, params);
	}
	
	public void deleteByNome(String descricao) {
		ArrayList<Object> params = new ArrayList<Object>();
	    params.add(descricao);
	    delete(Tables.marca, Columns.descricao, params);
	}

}
