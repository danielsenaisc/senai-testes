package controle;
//TODO PRONTO
import java.math.BigDecimal;
import java.util.ArrayList;

import dao.ModelagemDAO;
import entidades.Modelagem;

public class ModelagemController {

	private ModelagemDAO modelagemDao;
	
	public ModelagemController(){
		modelagemDao = new ModelagemDAO();
	}
	
	public ArrayList<Modelagem> selectAll(){
		return modelagemDao.select();
	}
	
	public Modelagem selectById(BigDecimal id){
		return modelagemDao.selectById(id);
	}
	
	public ArrayList<Modelagem> selectByNome(String nome){
		return modelagemDao.selectByNome(nome);
	}
	
	public void insert(Modelagem modelagem){
		modelagemDao.insert(modelagem);
	}
	
	public void update(Modelagem modelagem){
		modelagemDao.update(modelagem);
	}
	
	public void delete(Modelagem modelagem){
		modelagemDao.delete(modelagem);
	}
	
}
