package entidades;

/**
 * Canal generated by hbm2java
 */

public class Canal{


    // Fields    

     private long codigo;
     private String descriao;

    // Constructors

    /** default constructor */
    public Canal() {
    }

    public Canal(long codigo, String descriao) {
        this.codigo = codigo;
        this.descriao = descriao;
    }
    
    // Property accessors

    public long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescriao() {
        return this.descriao;
    }
    
    public void setDescriao(String descriao) {
        this.descriao = descriao;
    }

    
    //TODO GAMBIARRAS
	public Object getDescricao() {
		return getDescriao();
	}
	public void setDescricao(String descricao) {
		setDescriao(descricao);
	}


}
