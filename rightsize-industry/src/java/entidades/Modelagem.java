package entidades;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * Modelagem generated by hbm2java
 */

public class Modelagem  implements java.io.Serializable {


    // Fields    

     private BigDecimal codigo;
     private String nome;
     private char status;
     private Character genero;
     private String descricao;
     private String codigoInternoIndustria;


    // Constructors

    /** default constructor */
    public Modelagem() {
    }
    
    /** full constructor */
    public Modelagem(BigDecimal codigo, String nome, char status, Character genero, String descricao, String codigoInternoIndustria) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
        this.genero = genero;
        this.descricao = descricao;
        this.codigoInternoIndustria = codigoInternoIndustria;
    }
    

   
    // Property accessors

    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getStatus() {
        return this.status;
    }
    
    public void setStatus(char status) {
        this.status = status;
    }

    public Character getGenero() {
        return this.genero;
    }
    
    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoInternoIndustria() {
        return this.codigoInternoIndustria;
    }
    
    public void setCodigoInternoIndustria(String codigoInternoIndustria) {
        this.codigoInternoIndustria = codigoInternoIndustria;
    }

}