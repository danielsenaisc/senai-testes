package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
import entidades.Canal;
import entidades.Colecao;

public abstract class AbstractViewDAO {
	
	
	private ArrayList<Object> montarObjeto(ResultSet rs) throws SQLException {
        return null;
    }
    
    public ArrayList<Object> select(String viewName) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s", viewName);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Object> listaColecao = montarObjeto(rs);

            connection.close();
            return listaColecao;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
}
