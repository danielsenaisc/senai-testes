package entidades;

public class MarcaLinksDetails {

	private String marcaNome;
	private String marcaStatus;
	private int quantidadeColecao;
	private int quantidadeProdutos;
	
	public MarcaLinksDetails() {
	}
	
	public MarcaLinksDetails(String marcaNome, int quantidadeColecao) {
		super();
		this.marcaNome = marcaNome;
		this.quantidadeColecao = quantidadeColecao;
	}

	public String getMarcaNome() {
		return marcaNome;
	}

	public void setMarcaNome(String marcaNome) {
		this.marcaNome = marcaNome;
	}
	
	public String getMarcaStatus() {
		return marcaStatus;
	}

	public void setMarcaStatus(String marcaStatus) {
		this.marcaStatus = marcaStatus;
	}

	public int getQuantidadeColecao() {
		return quantidadeColecao;
	}

	public void setQuantidadeColecao(int quantidadeColecao) {
		this.quantidadeColecao = quantidadeColecao;
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}
	
	
}
