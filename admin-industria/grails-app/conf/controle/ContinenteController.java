package controle;
//TODO PRONTO
import java.math.BigDecimal;
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
	
	public Continente selectById(BigDecimal id){
		return continenteDao.selectById(id);
	}
	
	public ArrayList<Continente> selectByNome(String nome){
		return continenteDao.selectByNome(nome);
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
	public void deleteByName(String nome){
		continenteDao.deleteByNome(nome);
	}
	
	public void deleteById(BigDecimal id){
		continenteDao.deleteById(id);
	}
	
}
