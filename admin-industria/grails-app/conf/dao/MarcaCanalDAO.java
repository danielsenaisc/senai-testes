package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidades.Canal;
import entidades.Marca;
import entidades.MarcaCanal;

/**
  * @author daniel.s.oliveira
 */
public class MarcaCanalDAO extends AbstractDAO {

	private static String TABLE_NAME = "marca_canal";

    public ArrayList<MarcaCanal> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<MarcaCanal> listaMarcaCanal = montarObjeto(rs);

            connection.close();
            return listaMarcaCanal;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    private ArrayList<MarcaCanal> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<MarcaCanal> listaPais = new ArrayList<MarcaCanal>();
        while (rs.next()) {
            MarcaCanal objeto = new MarcaCanal();

            BigDecimal idMarca = rs.getBigDecimal("marca_id") ;
            BigDecimal idCanal = rs.getBigDecimal("canal_id");
            
            MarcaDAO marcaDao = new MarcaDAO();
            Marca marca = marcaDao.selectById(idMarca);
            
            CanalDAO canalDao = new CanalDAO();
            Canal canal = canalDao.selectById(idCanal);
            
            objeto.setMarca(marca);
            objeto.setCanal(canal);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(MarcaCanal MarcaCanal) {
            String sql = String.format("INSERT INTO %s (forma_acesso, observacoes, marca_id, canal_id, abrangencia) VALUES (?, ?, ?, ?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(MarcaCanal.getFormaAcesso());
            params.add(MarcaCanal.getObservacoes());
            params.add(MarcaCanal.getMarca().getId());
            params.add(MarcaCanal.getCanal().getId());
            params.add(MarcaCanal.getAbrangencia());
            
            operacaoEscrita(sql, params);
    }

    public void delete(MarcaCanal MarcaCanal) {
            String sql = String.format("DELETE FROM %s WHERE marca_id = ? and canal_id = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(MarcaCanal.getMarca().getId());
            params.add(MarcaCanal.getCanal().getId());
            operacaoEscrita(sql, params);
    }

}
