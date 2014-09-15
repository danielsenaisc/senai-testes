package controle;

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
	
	public Marca selectByCodigo(long codigo){
		return marcaDao.select(codigo);
	}
	
	public ArrayList<Marca> selectByNome(String nome){
		return marcaDao.select(nome);
	}
	
	public void insert(Marca marca){
		marcaDao.insert(marca);
	}
	
	public void update(Marca marca){
		marcaDao.update(marca);
	}
	
	public void delete(Marca marca){
		marcaDao.delete(marca);
	}
	
}
