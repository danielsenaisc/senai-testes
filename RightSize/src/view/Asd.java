package view;

import java.util.List;

import dao.ContinenteDAO;
import entidades.Continente;

public class Asd {

	public static void main(String[] args) {
		ContinenteDAO continenteDao = new ContinenteDAO();
		List<Continente> lista = continenteDao.select();
		for (Continente continente : lista) {
			System.out.println(continente);
		}

	}

}
