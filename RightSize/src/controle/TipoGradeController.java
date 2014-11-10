package controle;

import java.math.BigDecimal;
import java.util.ArrayList;

import dao.TipoGradeDAO;
import entidades.TipoGrade;

public class TipoGradeController {

	private TipoGradeDAO tipoGradeDao;

	public TipoGradeController(){
		tipoGradeDao = new TipoGradeDAO();
	}

	public ArrayList<TipoGrade> selectAll(){
		return tipoGradeDao.select();
	}

	public TipoGrade selectById(BigDecimal id){
		return tipoGradeDao.selectById(id);
	}

	public ArrayList<TipoGrade> selectByDescricao(String descricao){
		return tipoGradeDao.selectByDescricao(descricao);
	}

	public void insert(TipoGrade tipoGrade){
		tipoGradeDao.insert(tipoGrade);
	}

	public void update(TipoGrade tipoGrade){
		tipoGradeDao.update(tipoGrade);
	}

	public void delete(TipoGrade tipoGrade){
		tipoGradeDao.delete(tipoGrade);
	}
	
}
