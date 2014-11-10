package controle;

import java.math.BigDecimal;
import java.util.ArrayList;

import dao.MarcaDAO;
import entidades.Marca;

public class MarcaController {

	private MarcaDAO marcaDao;
	
	public MarcaController(){
		marcaDao = new MarcaDAO();
	}
	
	public ArrayList<Marca> selectAll(){
		return marcaDao.select();
	}
	
	public Marca selectById(BigDecimal id){
		return marcaDao.selectById(id);
	}
	
	public ArrayList<Marca> selectByName(String nome){
		return marcaDao.selectByName(nome);
	}
	
	public void insert(Marca marca){
		marcaDao.insert(marca);
	}
	
	public void update(Marca marca){
		marcaDao.update(marca);
	}
	
	public void deleteById(BigDecimal id){
		marcaDao.deleteById(id);
	}
	public void deleteByName(String nome){
		marcaDao.deleteByName(nome);
	}
	
}
