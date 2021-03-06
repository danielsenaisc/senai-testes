package entidades;

/**
 * ModelagemCategoriaId generated by hbm2java
 */

public class ModelagemCategoria  implements java.io.Serializable {


    // Fields    

     private Modelagem modelagem;
     private Categoria categoria;


    // Constructors

    /** default constructor */
    public ModelagemCategoria() {
    }

    
    /** full constructor */
    public ModelagemCategoria(Modelagem modelagem, Categoria categoria) {
        this.modelagem = modelagem;
        this.categoria = categoria;
    }
    

   
    // Property accessors

    public Modelagem getModelagem() {
        return this.modelagem;
    }
    
    public void setModelagem(Modelagem modelagem) {
        this.modelagem = modelagem;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelagemCategoria) ) return false;
		 ModelagemCategoria castOther = ( ModelagemCategoria ) other; 
         
		 return ( (this.getModelagem()==castOther.getModelagem()) || ( this.getModelagem()!=null && castOther.getModelagem()!=null && this.getModelagem().equals(castOther.getModelagem()) ) )
 && ( (this.getCategoria()==castOther.getCategoria()) || ( this.getCategoria()!=null && castOther.getCategoria()!=null && this.getCategoria().equals(castOther.getCategoria()) ) );
   }
   

}
