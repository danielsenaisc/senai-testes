/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "TAMANHO_TIPO_GRADE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TamanhoTipoGrade.findAll", query = "SELECT t FROM TamanhoTipoGrade t"),
    @NamedQuery(name = "TamanhoTipoGrade.findByCodigo", query = "SELECT t FROM TamanhoTipoGrade t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TamanhoTipoGrade.findByDescricao", query = "SELECT t FROM TamanhoTipoGrade t WHERE t.descricao = :descricao")})
public class TamanhoTipoGrade extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TAMANHO_TIPO_GRADE_SEQ")
    @SequenceGenerator(name = "TAMANHO_TIPO_GRADE_SEQ", sequenceName = "TAMANHO_TIPO_GRADE_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tamanhoTipoGradeCodigo")
    private List<ModelagemDadosTamanho> modelagemDadosTamanhoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tamanhoTipoGradeCodigo")
    private List<TipoMedidaProdutos> tipoMedidaProdutosList;
    @JoinColumn(name = "TIPO_GRADE_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoGrade tipoGradeCodigo;

    public TamanhoTipoGrade() {
    }

    public TamanhoTipoGrade(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public TamanhoTipoGrade(BigDecimal codigo, String descricao) {
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

    public TipoGrade getTipoGradeCodigo() {
        return tipoGradeCodigo;
    }

    public void setTipoGradeCodigo(TipoGrade tipoGradeCodigo) {
        this.tipoGradeCodigo = tipoGradeCodigo;
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
        if (!(object instanceof TamanhoTipoGrade)) {
            return false;
        }
        TamanhoTipoGrade other = (TamanhoTipoGrade) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.TamanhoTipoGrade[ codigo=" + codigo + " ]";
    }
    
    public ArrayList<TamanhoTipoGrade> listaTamanhoTipoGrades() {
        return new ArrayList(super.list());
    }
    
}
