package controle;

import java.util.ArrayList;

import dao.CanalDAO;
import entidades.Canal;

public class CanalController {

	private CanalDAO canalDao;
	
	public CanalController(){
		canalDao = new CanalDAO();
	}
	
	public ArrayList<Canal> selectAll(){
		return canalDao.select();
	}
	
	public Canal selectByCodigo(long codigo){
		return canalDao.select(codigo);
	}
	
	public ArrayList<Canal> selectByDescricao(String descricao){
		return canalDao.select(descricao);
	}
	
	public void insert(Canal canal){
		canalDao.insert(canal);
	}
	
	public void update(Canal canal){
		canalDao.update(canal);
	}
	
	public void delete(Canal canal){
		canalDao.delete(canal);
	}
	
}
