package entidades;
import java.util.HashSet;
import java.util.Set;


/**
 * Continente generated by hbm2java
 */

public class Continente{


    // Fields    

     private long codigo;
     private String nome;
     private String sigla;


    // Constructors

    /** default constructor */
    public Continente() {
    }
    
    /** full constructor */
    public Continente(long codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }
    

    
    @Override
    public String toString() {
    	return "Continente [codigo=" + codigo + ", nome=" + nome + ", sigla="
    			+ sigla + "]";
    }
   
    // Property accessors


	public long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    public void insert()
	{
		
	}
	
	public void delete()
	{
		
	}
	
	public void update()
	{
		
	}

}