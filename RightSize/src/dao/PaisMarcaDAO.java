package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Continente;
import entidades.PaisMarca;
import entidades.Pais;
import entidades.Marca;

/**
  * @author daniel.s.oliveira
 */
public class PaisMarcaDAO extends AbstractDAO {

	private static String TABLE_NAME = "pais_marca";

    public ArrayList<PaisMarca> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<PaisMarca> listaPaisMarca = montarObjeto(rs);

            connection.close();
            return listaPaisMarca;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<PaisMarca> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<PaisMarca> listaPais = new ArrayList<PaisMarca>();
        while (rs.next()) {
            PaisMarca objeto = new PaisMarca();

            BigDecimal codigoMarca = rs.getBigDecimal("marca_codigo") ;
            BigDecimal codigoPais = rs.getBigDecimal("pais_codigo");
            
            MarcaDAO marcaDao = new MarcaDAO();
            Marca marca = marcaDao.selectById(codigoMarca);
            
            PaisDAO paisDao = new PaisDAO();
            Pais pais = paisDao.selectById(codigoPais);
            
            objeto.setMarca(marca);
            objeto.setPais(pais);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(PaisMarca paisMarca) {
            String sql = String.format("INSERT INTO %s (marca_codigo, pais_codigo) VALUES (?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(paisMarca.getMarca().getCodigo());
            params.add(paisMarca.getPais().getCodigo());
            
            operacaoEscrita(sql, params);
    }

    public void delete(PaisMarca paisMarca) {
            String sql = String.format("DELETE FROM %s WHERE marca_codigo = ? and pais_codigo = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(paisMarca.getMarca().getCodigo());
            params.add(paisMarca.getPais().getCodigo());
            operacaoEscrita(sql, params);
    }

}
