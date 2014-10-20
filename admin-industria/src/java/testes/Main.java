package testes;

import java.util.ArrayList;

import domain.Colecao;
import domain.ColecaoStatus;
import domain.Marca;

public class Main {

	public static void main(String[] args) {
		Marca marca = new Marca();
		ColecaoStatus colecaoStatus = new ColecaoStatus();
		
		ArrayList<Marca> marcas = new ArrayList(marca.list());
		Colecao colecao = new Colecao("Teste", marcas.get(0),colecaoStatus.listaColecaoStatus().get(0));
		colecao.add();
		
	}

}
