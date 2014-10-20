package controle;
//TODO PRONTO
import java.math.BigDecimal;
import java.util.ArrayList;

import dao.PadraoMedidaDAO;
import entidades.PadraoMedida;

public class PadraoMedidaController {

	private PadraoMedidaDAO padraoMedidaDao;

	public PadraoMedidaController(){
		padraoMedidaDao = new PadraoMedidaDAO();
	}

	public ArrayList<PadraoMedida> selectAll(){
		return padraoMedidaDao.select();
	}

	public PadraoMedida selectById(BigDecimal id){
		return padraoMedidaDao.selectById(id);
	}

	public ArrayList<PadraoMedida> selectByNome(String descricao){
		return padraoMedidaDao.selectByDescricao(descricao);
	}

	public void insert(PadraoMedida padraoMedida){
		padraoMedidaDao.insert(padraoMedida);
	}

	public void update(PadraoMedida padraoMedida){
		padraoMedidaDao.update(padraoMedida);
	}

	public void delete(PadraoMedida padraoMedida){
		padraoMedidaDao.delete(padraoMedida);
	}
	public void deleteByName(String nome){
		padraoMedidaDao.deleteByNome(nome);
	}

	public void deleteById(BigDecimal id){
		padraoMedidaDao.deleteById(id);
	}

}
