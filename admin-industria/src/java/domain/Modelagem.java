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
import javax.persistence.ManyToMany;
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
@Table(name = "MODELAGEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modelagem.findAll", query = "SELECT m FROM Modelagem m"),
    @NamedQuery(name = "Modelagem.findByCodigo", query = "SELECT m FROM Modelagem m WHERE m.codigo = :codigo"),
    @NamedQuery(name = "Modelagem.findByNome", query = "SELECT m FROM Modelagem m WHERE m.nome = :nome"),
    @NamedQuery(name = "Modelagem.findByStatus", query = "SELECT m FROM Modelagem m WHERE m.status = :status"),
    @NamedQuery(name = "Modelagem.findByGenero", query = "SELECT m FROM Modelagem m WHERE m.genero = :genero"),
    @NamedQuery(name = "Modelagem.findByDescricao", query = "SELECT m FROM Modelagem m WHERE m.descricao = :descricao"),
    @NamedQuery(name = "Modelagem.findByCodigoInternoIndustria", query = "SELECT m FROM Modelagem m WHERE m.codigoInternoIndustria = :codigoInternoIndustria")})
public class Modelagem implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "GENERO")
    private Character genero;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "CODIGO_INTERNO_INDUSTRIA")
    private String codigoInternoIndustria;
    @ManyToMany(mappedBy = "modelagemList")
    private List<Marca> marcaList;
    @ManyToMany(mappedBy = "modelagemList")
    private List<Categoria> categoriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modelagemCodigo")
    private List<ModelagemDadosTamanho> modelagemDadosTamanhoList;

    public Modelagem() {
    }

    public Modelagem(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public Modelagem(BigDecimal codigo, String nome, Character status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoInternoIndustria() {
        return codigoInternoIndustria;
    }

    public void setCodigoInternoIndustria(String codigoInternoIndustria) {
        this.codigoInternoIndustria = codigoInternoIndustria;
    }

    @XmlTransient
    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
    }

    @XmlTransient
    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    @XmlTransient
    public List<ModelagemDadosTamanho> getModelagemDadosTamanhoList() {
        return modelagemDadosTamanhoList;
    }

    public void setModelagemDadosTamanhoList(List<ModelagemDadosTamanho> modelagemDadosTamanhoList) {
        this.modelagemDadosTamanhoList = modelagemDadosTamanhoList;
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
        if (!(object instanceof Modelagem)) {
            return false;
        }
        Modelagem other = (Modelagem) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Modelagem[ codigo=" + codigo + " ]";
    }
    
}
