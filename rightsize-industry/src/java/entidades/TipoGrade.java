package entidades;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * TipoGrade generated by hbm2java
 */

public class TipoGrade  implements java.io.Serializable {


    // Fields    

     private BigDecimal codigo;
     private String descricao;


    // Constructors

    /** default constructor */
    public TipoGrade() {
    }
    
    /** full constructor */
    public TipoGrade(BigDecimal codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    

   
    // Property accessors

    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}