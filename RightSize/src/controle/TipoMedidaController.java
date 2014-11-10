package controle;

import java.math.BigDecimal;
import java.util.ArrayList;

import dao.TipoMedidaDAO;
import entidades.TipoMedida;

public class TipoMedidaController {

	private TipoMedidaDAO tipoMedidaDao;

	public TipoMedidaController(){
		tipoMedidaDao = new TipoMedidaDAO();
	}

	public ArrayList<TipoMedida> selectAll(){
		return tipoMedidaDao.select();
	}

	public TipoMedida selectById(BigDecimal id){
		return tipoMedidaDao.select(id);
	}

	public ArrayList<TipoMedida> selectByDescricao(String descricao){
		return tipoMedidaDao.select();
	}

	public void insert(TipoMedida tipoMedida){
		tipoMedidaDao.insert(tipoMedida);
	}

	public void update(TipoMedida tipoMedida){
		tipoMedidaDao.update(tipoMedida);
	}

	public void delete(TipoMedida tipoMedida){
		tipoMedidaDao.delete(tipoMedida);
	}
	
	
}
