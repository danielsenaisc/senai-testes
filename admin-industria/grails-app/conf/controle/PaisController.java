package controle;
//TODO PRONTO
import java.math.BigDecimal;
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
	
	public Pais selectByid(BigDecimal id){
		return paisDao.selectById(id);
	}
	
	public ArrayList<Pais> selectByName(String name){
		return paisDao.selectByNome(name);
	}
	
	public void insert(Pais pais){
		paisDao.insert(pais);
	}
	
	public void update(Pais pais){
		paisDao.update(pais);
	}
	
	public void deleteById(BigDecimal id){
		paisDao.deleteById(id);
	}
	public void deleteByName(String name){
		paisDao.deleteByNome(name);
	}
	
}
