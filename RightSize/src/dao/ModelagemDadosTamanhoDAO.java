package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    private ArrayList<ModelagemDadosTamanho> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<ModelagemDadosTamanho> listaPais = new ArrayList<ModelagemDadosTamanho>();
        while (rs.next()) {
            ModelagemDadosTamanho objeto = new ModelagemDadosTamanho();

            double valorMedidaInicial = rs.getDouble("valor_medida_inicial");
            
            ModelagemDAO modelagemDAO = new ModelagemDAO();            
            Modelagem modelagem = modelagemDAO.select(rs.getBigDecimal("modelagem_codigo"));
            
            TamanhoTipoGradeDAO tamanhoTipoGradeDAO = new TamanhoTipoGradeDAO();
            TamanhoTipoGrade tamanhoTipoGrade = tamanhoTipoGradeDAO.select(rs.getBigDecimal("tamanho_tipo_grade_codigo"));
            
            BigDecimal padraoMedidaCodigo = rs.getBigDecimal("padrao_medida_codigo");
            
            TipoMedidaDAO tipoMedidaDAO = new TipoMedidaDAO();
            TipoMedida tipoMedida = tipoMedidaDAO.select(rs.getBigDecimal("tipo_medida_codigo"));
            Double valorMedidaFinal = rs.getDouble("valor_medida_final");
            
            objeto.setValorMedidaInicial(valorMedidaInicial);
            objeto.setModelagem(modelagem);
            objeto.setTamanhoTipoGrade(tamanhoTipoGrade);
            objeto.setPadraoMedidaCodigo(padraoMedidaCodigo);
            objeto.setTipoMedida(tipoMedida);
            objeto.setValorMedidaFinal(valorMedidaFinal);
            listaPais.add(objeto);
        }
        return listaPais;
    }

    
    public void insert(ModelagemDadosTamanho modelagemDadosTamanho) {
            String sql = String.format("INSERT INTO %s (valor_medida_inicial, modelagem_codigo, tamanho_tipo_grade_codigo, padrao_medida_codigo, tipo_medida_codigo, valor_medida_final) "
            		+ "VALUES (?, ?, ?, ?, ?, ?)", TABLE_NAME);
          
            ArrayList<Object> params = new ArrayList<Object>();
            
            params.add(modelagemDadosTamanho.getValorMedidaInicial());
            params.add(modelagemDadosTamanho.getModelagem().getCodigo());
            params.add(modelagemDadosTamanho.getTamanhoTipoGrade().getCodigo());
            params.add(modelagemDadosTamanho.getPadraoMedidaCodigo());
            params.add(modelagemDadosTamanho.getTipoMedida());
            params.add(modelagemDadosTamanho.getValorMedidaFinal());
            
            operacaoEscrita(sql, params);
    }

    public void delete(ModelagemDadosTamanho modelagemDadosTamanho) {
            String sql = String.format("DELETE FROM %s WHERE modelagem_codigo = ? and tamanho_tipo_grade_codigo = ?",TABLE_NAME);

            ArrayList<Object> params = new ArrayList<Object>();
            params.add(modelagemDadosTamanho.getModelagem().getCodigo());
            params.add(modelagemDadosTamanho.getTamanhoTipoGrade().getCodigo());
            operacaoEscrita(sql, params);
    }

}
