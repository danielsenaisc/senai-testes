package utils;

public enum Genero {
	
	MASCULINO('M'),
	FEMININO('F'),
	UNISSEX('U');
	
	Character descricao;
	
	private Genero(Character descricao) {
		this.descricao = descricao;
	}

	public Character getDescricao() {
		return descricao;
	}
	
}
