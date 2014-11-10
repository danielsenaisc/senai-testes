/**
 * 
 */
package controle;

import java.math.BigDecimal;
import java.util.ArrayList;

import dao.CategoriaDAO;
import entidades.Categoria;

/**
 * @author Gustavo Calandrini
 *
 */
public class CategoriaController {


		private CategoriaDAO categoriaDao;
		
		public CategoriaController(){
			categoriaDao = new CategoriaDAO();
		}
		
		public ArrayList<Categoria> selectAll(){
			return categoriaDao.select();
		}
		
		public Categoria selectById(BigDecimal id){
			return categoriaDao.selectById(id);
		}
		
//		public ArrayList<Categoria> selectByNome(String nome){
//			return categoriaDao.selectByName(nome);
//		}
		
		public void insert(Categoria categoria){
			categoriaDao.insert(categoria);
		}
		
		public void update(Categoria categoria){
			categoriaDao.update(categoria);
		}
		
		public void delete(BigDecimal id){
			categoriaDao.deleteById(id);
		}	
	
}
