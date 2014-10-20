package entidades;

import java.math.BigDecimal;

import controle.CategoriaController;
import controle.MarcaController;
import controle.ModelagemController;

public class Main {

	public static void main(String[] args) {
//
//		MarcaController marcaController = new MarcaController();
//		System.out.println(marcaController.selectById(new BigDecimal(1)));
//
//		CategoriaController categoriaController = new CategoriaController();
//		System.out.println(categoriaController.selectAll());
		
		ModelagemController modelagemController = new ModelagemController();
		System.out.println(modelagemController.selectAll());
		
	}

}
