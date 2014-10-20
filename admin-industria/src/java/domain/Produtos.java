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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import control.GenericDao;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findByCodigo", query = "SELECT p FROM Produtos p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produtos.findByNome", query = "SELECT p FROM Produtos p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produtos.findByStatus", query = "SELECT p FROM Produtos p WHERE p.status = :status"),
    @NamedQuery(name = "Produtos.findByGenero", query = "SELECT p FROM Produtos p WHERE p.genero = :genero"),
    @NamedQuery(name = "Produtos.findByReferencia", query = "SELECT p FROM Produtos p WHERE p.referencia = :referencia"),
    @NamedQuery(name = "Produtos.findByDescricao", query = "SELECT p FROM Produtos p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produtos.findByProdutoscol", query = "SELECT p FROM Produtos p WHERE p.produtoscol = :produtoscol")})
public class Produtos extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUTOS_SEQ")
    @SequenceGenerator(name = "PRODUTOS_SEQ", sequenceName = "PRODUTOS_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "GENERO")
    private Character genero;
    @Column(name = "REFERENCIA")
    private String referencia;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PRODUTOSCOL")
    private String produtoscol;
    @ManyToMany(mappedBy = "produtosList", fetch = FetchType.LAZY)
    private List<Tag> tagList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtosCodigo", fetch = FetchType.LAZY)
    private List<TipoMedidaProdutos> tipoMedidaProdutosList;
    @JoinColumn(name = "COLECAO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Colecao colecaoCodigo;
    @JoinColumn(name = "CATEGORIA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Categoria categoriaCodigo;

    public Produtos() {
    }

    public Produtos(BigDecimal codigo) {
        this.codigo = codigo;
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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProdutoscol() {
        return produtoscol;
    }

    public void setProdutoscol(String produtoscol) {
        this.produtoscol = produtoscol;
    }

    @XmlTransient
    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    @XmlTransient
    public List<TipoMedidaProdutos> getTipoMedidaProdutosList() {
        return tipoMedidaProdutosList;
    }

    public void setTipoMedidaProdutosList(List<TipoMedidaProdutos> tipoMedidaProdutosList) {
        this.tipoMedidaProdutosList = tipoMedidaProdutosList;
    }

    public Colecao getColecaoCodigo() {
        return colecaoCodigo;
    }

    public void setColecaoCodigo(Colecao colecaoCodigo) {
        this.colecaoCodigo = colecaoCodigo;
    }

    public Categoria getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(Categoria categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
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
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Produtos[ codigo=" + codigo + " ]";
    }
    
}
