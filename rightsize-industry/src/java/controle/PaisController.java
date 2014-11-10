package controle;

import java.util.ArrayList;

import dao.PaisDAO;
import entidades.Pais;

public class PaisController {

	private PaisDAO paisDao;
	
	public PaisController(){
		paisDao = new PaisDAO();
	}
	
	public ArrayList<Pais> selectAll(){
		return paisDao.select();
	}
	
	public Pais selectByCodigo(long codigo){
		return paisDao.select(codigo);
	}
	
	public ArrayList<Pais> selectByNome(String nome){
		return paisDao.select(nome);
	}
	
	public void insert(Pais pais){
		paisDao.insert(pais);
	}
	
	public void update(Pais pais){
		paisDao.update(pais);
	}
	
	public void delete(Pais pais){
		paisDao.delete(pais);
	}
	
}
