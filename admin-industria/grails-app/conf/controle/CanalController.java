package controle;

import java.math.BigDecimal;
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
	
	public Canal selectById(BigDecimal id){
		return canalDao.selectById(id);
	}
	
	public ArrayList<Canal> selectByDescricao(String descricao){
		return canalDao.selectByDescricao(descricao);
	}
	
	public void insert(Canal canal){
		canalDao.insert(canal);
	}
	
	public void update(Canal canal){
		canalDao.update(canal);
	}
	
	public void deleteById(BigDecimal id){
		canalDao.deleteById(id);
	}
	public void deleteByDescricao(String descricao){
		canalDao.deleteByDescricao(descricao);
	}
	
}
