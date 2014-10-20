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
import entidades.MarcaLinksDetails;

public class MarcaLinksDetailsDAO extends AbstractViewDAO{

	private ArrayList<Object> montarObjeto(ResultSet rs) throws SQLException {
		 ArrayList<Object> listaCanal = new ArrayList<Object>();
	        while (rs.next()) {
	        	MarcaLinksDetails objeto = new MarcaLinksDetails();

	            String marcaNome = rs.getString("marca_nome") ;
	            String marcaStatus = rs.getString("marca_status") ;
	            int quantidadeColecao = rs.getInt("quantidade_colecao");
	            objeto.setMarcaNome(marcaNome);
	            objeto.setMarcaStatus(marcaStatus);
	            objeto.setQuantidadeColecao(quantidadeColecao);
	            listaCanal.add(objeto);
	        }
	        return listaCanal;
    }
	
	
	public ArrayList<MarcaLinksDetails> selectMarcaLinksDetails(String viewName) {
		ArrayList<MarcaLinksDetails> mlds = new ArrayList(super.select(viewName));
		return mlds;
    }
	
	
}
