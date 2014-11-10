package entidades;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * TamanhoTipoGrade generated by hbm2java
 */

public class TamanhoTipoGrade  implements java.io.Serializable {


    // Fields    

     private BigDecimal codigo;
     private TipoGrade tipoGrade;
     private String descricao;


    // Constructors

    /** default constructor */
    public TamanhoTipoGrade() {
    }

	/** minimal constructor */
    public TamanhoTipoGrade(BigDecimal codigo, TipoGrade tipoGrade, String descricao) {
        this.codigo = codigo;
        this.tipoGrade = tipoGrade;
        this.descricao = descricao;
    }
    

   
    // Property accessors

    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public TipoGrade getTipoGrade() {
        return this.tipoGrade;
    }
    
    public void setTipoGrade(TipoGrade tipoGrade) {
        this.tipoGrade = tipoGrade;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}