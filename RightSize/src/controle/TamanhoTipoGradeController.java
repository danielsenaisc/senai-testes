package controle;

import java.math.BigDecimal;
import java.util.ArrayList;

import dao.TamanhoTipoGradeDAO;
import entidades.TamanhoTipoGrade;

public class TamanhoTipoGradeController {

	private TamanhoTipoGradeDAO tamanhoTipoGradeDao;

	public TamanhoTipoGradeController(){
		tamanhoTipoGradeDao = new TamanhoTipoGradeDAO();
	}

	public ArrayList<TamanhoTipoGrade> selectAll(){
		return tamanhoTipoGradeDao.select();
	}

	public TamanhoTipoGrade selectById(BigDecimal id){
		return tamanhoTipoGradeDao.selectById(id);
	}

	public ArrayList<TamanhoTipoGrade> selectByNome(String descricao){
		return tamanhoTipoGradeDao.selectByDescricao(descricao);
	}

	public void insert(TamanhoTipoGrade tamanhoTipoGrade){
		tamanhoTipoGradeDao.insert(tamanhoTipoGrade);
	}

	public void update(TamanhoTipoGrade tamanhoTipoGrade){
		tamanhoTipoGradeDao.update(tamanhoTipoGrade);
	}

	public void delete(TamanhoTipoGrade tamanhoTipoGrade){
		tamanhoTipoGradeDao.delete(tamanhoTipoGrade);
	}
	public void deleteByName(String descricao){
		tamanhoTipoGradeDao.deleteByDescricao(descricao);
	}

	public void deleteById(BigDecimal id){
		tamanhoTipoGradeDao.deleteById(id);
	}
	
}
