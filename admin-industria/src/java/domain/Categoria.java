/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "CATEGORIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "Categoria.findByCodigo", query = "SELECT c FROM Categoria c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Categoria.findByIncone", query = "SELECT c FROM Categoria c WHERE c.incone = :incone"),
    @NamedQuery(name = "Categoria.findByImagem", query = "SELECT c FROM Categoria c WHERE c.imagem = :imagem"),
    @NamedQuery(name = "Categoria.findByDescricao", query = "SELECT c FROM Categoria c WHERE c.descricao = :descricao")})
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Column(name = "INCONE")
    private String incone;
    @Column(name = "IMAGEM")
    private String imagem;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @JoinTable(name = "MODELAGEM_CATEGORIA", joinColumns = {
        @JoinColumn(name = "CATEGORIA_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "MODELAGEM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany
    private List<Modelagem> modelagemList;
    @OneToMany(mappedBy = "categoriaCodigo")
    private List<Categoria> categoriaList;
    @JoinColumn(name = "CATEGORIA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne
    private Categoria categoriaCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaCodigo")
    private List<Produtos> produtosList;

    public Categoria() {
    }

    public Categoria(Long codigo) {
        this.codigo = codigo;
    }

    public Categoria(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getIncone() {
        return incone;
    }

    public void setIncone(String incone) {
        this.incone = incone;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Modelagem> getModelagemList() {
        return modelagemList;
    }

    public void setModelagemList(List<Modelagem> modelagemList) {
        this.modelagemList = modelagemList;
    }

    @XmlTransient
    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public Categoria getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(Categoria categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
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
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Categoria[ codigo=" + codigo + " ]";
    }
    
}
