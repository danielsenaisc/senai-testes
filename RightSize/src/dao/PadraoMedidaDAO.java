package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.PadraoMedida;

/**
  * @author daniel.s.oliveira
 */
public class PadraoMedidaDAO extends AbstractDAO {


    public ArrayList<PadraoMedida> select() {
        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM padraoMedida";
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
    
    public PadraoMedida select(long codigoPadraoMedida) {
    	Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM padrao_medida WHERE codigo like ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, codigoPadraoMedida);
            ResultSet rs = prest.executeQuery();

            ArrayList<PadraoMedida> listaPadraoMedida = montarObjeto(rs);

            connection.close();
            
            return listaPadraoMedida.get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public ArrayList<PadraoMedida> select(String descricao) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM padrao_medida WHERE descriao like ?"; //TODO CONSERTAR NOME DO CAMPO NO BD
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, descricao);
            ResultSet rs = prest.executeQuery();

            ArrayList<PadraoMedida> listaPadraoMedida = montarObjeto(rs);

            connection.close();
            
            return listaPadraoMedida;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<PadraoMedida> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<PadraoMedida> listaPadraoMedida = new ArrayList<PadraoMedida>();
        while (rs.next()) {
            PadraoMedida objeto = new PadraoMedida();

            BigDecimal codigo = rs.getBigDecimal("codigo") ;
            String descricao =  rs.getString("descriao"); //TODO CONSERTAR NOME DO CAMPO NO BD
            
            objeto.setCodigo(codigo);
            objeto.setDescricao(descricao);
            
            listaPadraoMedida.add(objeto);
        }
        return listaPadraoMedida;
    }

    
    public void insert(PadraoMedida padraoMedida) {
            String sql = "insert into padrao_medida (codigo, descriao) values (padraoMedida_codigo_seq.Nextval, ?)";
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(padraoMedida.getDescricao());
            
            operacaoEscrita(sql, params);
    }

    public void update(PadraoMedida padraoMedida) {
            String sql = "UPDATE padrao_medida SET descriao = ? WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(padraoMedida.getDescricao());
            params.add(padraoMedida.getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(PadraoMedida padraoMedida) {
            String sql = "DELETE FROM padrao_medida WHERE codigo = ?";

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(padraoMedida.getCodigo());
            operacaoEscrita(sql, params);
    }


}
