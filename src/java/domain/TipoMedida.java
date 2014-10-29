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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "TIPO_MEDIDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMedida.findAll", query = "SELECT t FROM TipoMedida t"),
    @NamedQuery(name = "TipoMedida.findByCodigo", query = "SELECT t FROM TipoMedida t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoMedida.findByDescricao", query = "SELECT t FROM TipoMedida t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TipoMedida.findByAbreviacao", query = "SELECT t FROM TipoMedida t WHERE t.abreviacao = :abreviacao"),
    @NamedQuery(name = "TipoMedida.findByFormaMedidaFigura", query = "SELECT t FROM TipoMedida t WHERE t.formaMedidaFigura = :formaMedidaFigura")})
public class TipoMedida extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPO_MEDIDA_SEQ")
    @SequenceGenerator(name = "TIPO_MEDIDA_SEQ", sequenceName = "TIPO_MEDIDA_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "ABREVIACAO")
    private String abreviacao;
    @Column(name = "FORMA_MEDIDA_FIGURA")
    private String formaMedidaFigura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoMedidaCodigo", fetch = FetchType.LAZY)
    private List<ModelagemDadosTamanho> modelagemDadosTamanhoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoMedidaCodigo", fetch = FetchType.LAZY)
    private List<TipoMedidaProdutos> tipoMedidaProdutosList;

    public TipoMedida() {
    }

    public TipoMedida(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public TipoMedida(BigDecimal codigo, String descricao) {
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

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getFormaMedidaFigura() {
        return formaMedidaFigura;
    }

    public void setFormaMedidaFigura(String formaMedidaFigura) {
        this.formaMedidaFigura = formaMedidaFigura;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMedida)) {
            return false;
        }
        TipoMedida other = (TipoMedida) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.TipoMedida[ codigo=" + codigo + " ]";
    }
    
    public ArrayList<TipoMedida> listaTipoMedidas() {
        return new ArrayList(super.list());
    }
    
}
