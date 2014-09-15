package controle;

import java.util.ArrayList;

import dao.ContinenteDAO;
import entidades.Continente;

public class ContinenteController {

	private ContinenteDAO continenteDao;
	
	public ContinenteController(){
		continenteDao = new ContinenteDAO();
	}
	
	public ArrayList<Continente> selectAll(){
		return continenteDao.select();
	}
	
	public Continente selectByCodigo(long codigo){
		return continenteDao.select(codigo);
	}
	
	public ArrayList<Continente> selectByNome(String nome){
		return continenteDao.select(nome);
	}
	
	public void insert(Continente continente){
		continenteDao.insert(continente);
	}
	
	public void update(Continente continente){
		continenteDao.update(continente);
	}
	
	public void delete(Continente continente){
		continenteDao.delete(continente);
	}
	
}
