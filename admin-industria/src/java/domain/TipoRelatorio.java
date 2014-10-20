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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "TIPO_RELATORIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoRelatorio.findAll", query = "SELECT t FROM TipoRelatorio t"),
    @NamedQuery(name = "TipoRelatorio.findByCodigo", query = "SELECT t FROM TipoRelatorio t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoRelatorio.findByDescricao", query = "SELECT t FROM TipoRelatorio t WHERE t.descricao = :descricao")})
public class TipoRelatorio implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoRelatorioCodigo")
    private List<Relatorio> relatorioList;

    public TipoRelatorio() {
    }

    public TipoRelatorio(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public TipoRelatorio(BigDecimal codigo, String descricao) {
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
    public List<Relatorio> getRelatorioList() {
        return relatorioList;
    }

    public void setRelatorioList(List<Relatorio> relatorioList) {
        this.relatorioList = relatorioList;
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
        if (!(object instanceof TipoRelatorio)) {
            return false;
        }
        TipoRelatorio other = (TipoRelatorio) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.TipoRelatorio[ codigo=" + codigo + " ]";
    }
    
}
