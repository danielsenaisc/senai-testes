package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comum.Columns;
import comum.Tables;
import entidades.Modelagem;
import entidades.ModelagemDadosTamanho;
import entidades.TamanhoTipoGrade;
import entidades.TipoMedida;

/**
  * @author daniel.s.oliveira
 */
public class ModelagemDadosTamanhoDAO extends AbstractDAO {

	private static String TABLE_NAME = "modelagem_dados_tamanho";

    public ArrayList<ModelagemDadosTamanho> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = String.format("SELECT * FROM %s", TABLE_NAME);
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<ModelagemDadosTamanho> listaModelagemDadosTamanho = montarObjeto(rs);

            connection.close();
            return listaModelagemDadosTamanho;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ArrayList<ModelagemDadosTamanho> select(String column, Object param) {
        Connection connection = Conexao.getConexao();
        try {

        	String sql = String.format("SELECT * FROM %s WHERE %s like ?", Tables.marca, column);
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, param);
            ResultSet rs = prest.executeQuery();

            ArrayList<ModelagemDadosTamanho> listaModelagemDadosTamanho = montarObjeto(rs);

            connection.close();
            return listaModelagemDadosTamanho;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
    
    public ModelagemDadosTamanho selectById(BigDecimal id) {
    	return select(Columns.id, id).get(0);
    }

    public ArrayList<ModelagemDadosTamanho> selectByNome(String nome) {
    	return select(Columns.nome, nome);
    }
        
    
    private ArrayList<ModelagemDadosTamanho> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<ModelagemDadosTamanho> listaPais = new ArrayList<ModelagemDadosTamanho>();
        while (rs.next()) {
            ModelagemDadosTamanho objeto = new ModelagemDadosTamanho();

            double valorMedidaInicial = rs.getDouble("valor_medida_inicial");
            
            ModelagemDAO modelagemDAO = new ModelagemDAO();            
            Modelagem modelagem = modelagemDAO.selectById(rs.getBigDecimal("modelagem_id"));
            
            TamanhoTipoGradeDAO tamanhoTipoGradeDAO = new TamanhoTipoGradeDAO();
            TamanhoTipoGrade tamanhoTipoGrade = tamanhoTipoGradeDAO.selectById(rs.getBigDecimal("tamanho_tipo_grade_id"));
            
            BigDecimal padraoMedidaId = rs.getBigDecimal("padrao_medida_id");
            
            TipoMedidaDAO tipoMedidaDAO = new TipoMedidaDAO();
            TipoMedida tipoMedida = tipoMedidaDAO.select(rs.getBigDecimal("tipo_medida_id"));
            Double valorMedidaFinal = rs.getDouble("valor_medida_final");
            
            objeto.setValorMedidaInicial(valorMedidaInicial);
            objeto.setModelagem(modelagem);
            objeto.setTamanhoTipoGrade(tamanhoTipoGrade);
            objeto.setPadraoMedidaId(padraoMedidaId);
            objeto.setTipoMedida(tipoMedida);
            objeto.setValorMedidaFinal(valorMedidaFinal);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(ModelagemDadosTamanho modelagemDadosTamanho) {
            String sql = String.format("INSERT INTO %s (valor_medida_inicial, modelagem_id, tamanho_tipo_grade_id, padrao_medida_id, tipo_medida_id, valor_medida_final) "
            		+ "VALUES (?, ?, ?, ?, ?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagemDadosTamanho.getValorMedidaInicial());
            params.add(modelagemDadosTamanho.getModelagem().getId());
            params.add(modelagemDadosTamanho.getTamanhoTipoGrade().getId());
            params.add(modelagemDadosTamanho.getPadraoMedidaId());
            params.add(modelagemDadosTamanho.getTipoMedida());
            params.add(modelagemDadosTamanho.getValorMedidaFinal());
            
            operacaoEscrita(sql, params);
    }

    public void delete(ModelagemDadosTamanho modelagemDadosTamanho) {
            String sql = String.format("DELETE FROM %s WHERE modelagem_id = ? and tamanho_tipo_grade_id = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagemDadosTamanho.getModelagem().getId());
            params.add(modelagemDadosTamanho.getTamanhoTipoGrade().getId());
            operacaoEscrita(sql, params);
    }

}
