package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Marca;
import entidades.Modelagem;
import entidades.ModelagemMarca;

/**
  * @author daniel.s.oliveira
 */
public class ModelagemMarcaDAO extends AbstractDAO {

	private static String TABLE_NAME = "modelagem_marca";

    public ArrayList<ModelagemMarca> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<ModelagemMarca> listaModelagemMarca = montarObjeto(rs);

            connection.close();
            return listaModelagemMarca;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<ModelagemMarca> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<ModelagemMarca> listaPais = new ArrayList<ModelagemMarca>();
        while (rs.next()) {
            ModelagemMarca objeto = new ModelagemMarca();

            BigDecimal idMarca = rs.getBigDecimal("marca_id") ;
            BigDecimal idModelagem = rs.getBigDecimal("modelagem_id");
            
            MarcaDAO marcaDao = new MarcaDAO();
            Marca marca = marcaDao.selectById(idMarca);
            
            ModelagemDAO modelagemDAO = new ModelagemDAO();
            Modelagem modelagem = modelagemDAO.selectById(idModelagem);
            
            objeto.setMarca(marca);
            objeto.setModelagem(modelagem);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(ModelagemMarca modelagemMarca) {
            String sql = String.format("INSERT INTO %s (modelagem_id, marca_id) VALUES (?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagemMarca.getModelagem().getId());
            params.add(modelagemMarca.getMarca().getId());
            
            operacaoEscrita(sql, params);
    }

    public void delete(ModelagemMarca modelagemMarca) {
            String sql = String.format("DELETE FROM %s WHERE marca_id = ? and modelagem_id = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagemMarca.getMarca().getId());
            params.add(modelagemMarca.getModelagem().getId());
            operacaoEscrita(sql, params);
    }

}
