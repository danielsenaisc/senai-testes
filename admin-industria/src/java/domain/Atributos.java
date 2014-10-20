/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "ATRIBUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atributos.findAll", query = "SELECT a FROM Atributos a"),
    @NamedQuery(name = "Atributos.findByCodigo", query = "SELECT a FROM Atributos a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Atributos.findByDescricao", query = "SELECT a FROM Atributos a WHERE a.descricao = :descricao")})
public class Atributos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ATRIBUTOS_SEQ")
    @SequenceGenerator(name = "ATRIBUTOS_SEQ", sequenceName = "ATRIBUTOS_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(mappedBy = "atributosCodigo", fetch = FetchType.LAZY)
    private List<Atributos> atributosList;
    @JoinColumn(name = "ATRIBUTOS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne
    private Atributos atributosCodigo;

    public Atributos() {
    }

    public Atributos(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public Atributos(String descricao) {
        this.descricao = descricao;
    }

    public Atributos(String descricao, Atributos atributosCodigo) {
        this.descricao = descricao;
        this.atributosCodigo = atributosCodigo;
    }

    public Atributos(BigDecimal codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Atributos> getAtributosList() {
        return atributosList;
    }

    public void setAtributosList(List<Atributos> atributosList) {
        this.atributosList = atributosList;
    }

    public Atributos getAtributosCodigo() {
        return atributosCodigo;
    }

    public void setAtributosCodigo(Atributos atributosCodigo) {
        this.atributosCodigo = atributosCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atributos)) {
            return false;
        }
        Atributos other = (Atributos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Atributos[ codigo=" + codigo + " ]";
    }
    
}
