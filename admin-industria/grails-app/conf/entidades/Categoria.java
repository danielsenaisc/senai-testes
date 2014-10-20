package entidades;

import java.math.BigDecimal;


/**
 * Categoria generated by hbm2java
 */

public class Categoria{


    // Fields    

     private BigDecimal id;
     private Categoria categoria;
     private String icone;
     private String imagem;
     private String descricao;


    // Constructors

    /** default constructor */
    public Categoria() {
    }
    
    /** full constructor */
    public Categoria(BigDecimal id, Categoria categoria, String icone, String imagem, String descricao) {
        this.id = id;
        this.categoria = categoria;
        this.icone = icone;
        this.imagem = imagem;
        this.descricao = descricao;
    }
    
    public Categoria(Categoria categoria, String icone, String imagem, String descricao) {
        this.categoria = categoria;
        this.icone = icone;
        this.imagem = imagem;
        this.descricao = descricao;
    }
   
    // Property accessors

    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIcone() {
        return this.icone;
    }
    
    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getImagem() {
        return this.imagem;
    }
    
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", categoria=" + categoria + ", icone="
				+ icone + ", imagem=" + imagem + ", descricao=" + descricao
				+ "]";
	}


}
