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
@Table(name = "TIPO_GRADE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoGrade.findAll", query = "SELECT t FROM TipoGrade t"),
    @NamedQuery(name = "TipoGrade.findByCodigo", query = "SELECT t FROM TipoGrade t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoGrade.findByDescricao", query = "SELECT t FROM TipoGrade t WHERE t.descricao = :descricao")})
public class TipoGrade implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoGradeCodigo")
    private List<ModelagemDadosTamanho> modelagemDadosTamanhoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoGradeCodigo")
    private List<TipoMedidaProdutos> tipoMedidaProdutosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoGradeCodigo")
    private List<TamanhoTipoGrade> tamanhoTipoGradeList;

    public TipoGrade() {
    }

    public TipoGrade(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public TipoGrade(BigDecimal codigo, String descricao) {
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
    public List<ModelagemDadosTamanho> getModelagemDadosTamanhoList() {
        return modelagemDadosTamanhoList;
    }

    public void setModelagemDadosTamanhoList(List<ModelagemDadosTamanho> modelagemDadosTamanhoList) {
        this.modelagemDadosTamanhoList = modelagemDadosTamanhoList;
    }

    @XmlTransient
    public List<TipoMedidaProdutos> getTipoMedidaProdutosList() {
        return tipoMedidaProdutosList;
    }

    public void setTipoMedidaProdutosList(List<TipoMedidaProdutos> tipoMedidaProdutosList) {
        this.tipoMedidaProdutosList = tipoMedidaProdutosList;
    }

    @XmlTransient
    public List<TamanhoTipoGrade> getTamanhoTipoGradeList() {
        return tamanhoTipoGradeList;
    }

    public void setTamanhoTipoGradeList(List<TamanhoTipoGrade> tamanhoTipoGradeList) {
        this.tamanhoTipoGradeList = tamanhoTipoGradeList;
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
        if (!(object instanceof TipoGrade)) {
            return false;
        }
        TipoGrade other = (TipoGrade) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.TipoGrade[ codigo=" + codigo + " ]";
    }
    
}
