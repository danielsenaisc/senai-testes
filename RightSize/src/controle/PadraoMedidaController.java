package controle;

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

	public ArrayList<PadraoMedida> selectByNome(String nome){
		return padraoMedidaDao.select(nome);
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
	public void deleteByName(String name){
		padraoMedidaDao.deleteByName(name);
	}

	public void deleteById(BigDecimal id){
		padraoMedidaDao.deleteById(id);
	}

}
