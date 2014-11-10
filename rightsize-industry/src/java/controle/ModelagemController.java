package controle;

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
	
	public Modelagem selectByCodigo(long codigo){
		return modelagemDao.select(codigo);
	}
	
	public ArrayList<Modelagem> selectByNome(String nome){
		return modelagemDao.select(nome);
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
