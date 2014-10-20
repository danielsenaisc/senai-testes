/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import utils.OracleBoolean;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "MARCA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findByCodigo", query = "SELECT m FROM Marca m WHERE m.codigo = :codigo"),
    @NamedQuery(name = "Marca.findByNome", query = "SELECT m FROM Marca m WHERE m.nome = :nome"),
    @NamedQuery(name = "Marca.findByDescricao", query = "SELECT m FROM Marca m WHERE m.descricao = :descricao"),
    @NamedQuery(name = "Marca.findByLogomarca", query = "SELECT m FROM Marca m WHERE m.logomarca = :logomarca"),
    @NamedQuery(name = "Marca.findByDataCriacao", query = "SELECT m FROM Marca m WHERE m.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Marca.findByGenero", query = "SELECT m FROM Marca m WHERE m.genero = :genero"),
    @NamedQuery(name = "Marca.findByIdadeInicial", query = "SELECT m FROM Marca m WHERE m.idadeInicial = :idadeInicial"),
    @NamedQuery(name = "Marca.findByIdadeFinal", query = "SELECT m FROM Marca m WHERE m.idadeFinal = :idadeFinal"),
    @NamedQuery(name = "Marca.findByStatus", query = "SELECT m FROM Marca m WHERE m.status = :status")})
public class Marca extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MARCA_SEQ")
    @SequenceGenerator(name = "MARCA_SEQ", sequenceName = "MARCA_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "LOGOMARCA")
    private String logomarca;
    @Basic(optional = false)
    @Column(name = "DATA_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Column(name = "GENERO")
    private Character genero;
    @Basic(optional = false)
    @Column(name = "IDADE_INICIAL")
    private long idadeInicial;
    @Basic(optional = false)
    @Column(name = "IDADE_FINAL")
    private long idadeFinal;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @ManyToMany(mappedBy = "marcaList", fetch = FetchType.LAZY)
    private List<Estilo> estiloList;
    @JoinTable(name = "MODELAGEM_MARCA", joinColumns = {
        @JoinColumn(name = "MARCA_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "MODELAGEM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Modelagem> modelagemList;
    @JoinTable(name = "PAIS_MARCA", joinColumns = {
        @JoinColumn(name = "MARCA_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "PAIS_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Pais> paisList;
    @JoinColumn(name = "INDUSTRIA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Industria industriaCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaCodigo", fetch = FetchType.LAZY)
    private List<Colecao> colecaoList;

    public Marca() {
    }

    public Marca(Long codigo) {
        this.codigo = codigo;
    }
    
    //TODO Validate
    public Marca(String nome, Date dataCriacao, long idadeInicial, long idadeFinal, OracleBoolean status, Industria industria) {
        this.nome = nome;
        this.industriaCodigo = industria;
        this.dataCriacao = dataCriacao;
        this.idadeInicial = idadeInicial;
        this.idadeFinal = idadeFinal;
        this.status = status.getValue();
    }

    public Marca(Long codigo, String nome, Date dataCriacao, long idadeInicial, long idadeFinal, Character status) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.idadeInicial = idadeInicial;
        this.idadeFinal = idadeFinal;
        this.status = status;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLogomarca() {
        return logomarca;
    }

    public void setLogomarca(String logomarca) {
        this.logomarca = logomarca;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public long getIdadeInicial() {
        return idadeInicial;
    }

    public void setIdadeInicial(long idadeInicial) {
        this.idadeInicial = idadeInicial;
    }

    public long getIdadeFinal() {
        return idadeFinal;
    }

    public void setIdadeFinal(long idadeFinal) {
        this.idadeFinal = idadeFinal;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @XmlTransient
    public List<Estilo> getEstiloList() {
        return estiloList;
    }

    public void setEstiloList(List<Estilo> estiloList) {
        this.estiloList = estiloList;
    }

    @XmlTransient
    public List<Modelagem> getModelagemList() {
        return modelagemList;
    }

    public void setModelagemList(List<Modelagem> modelagemList) {
        this.modelagemList = modelagemList;
    }

    @XmlTransient
    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    public Industria getIndustriaCodigo() {
        return industriaCodigo;
    }

    public void setIndustriaCodigo(Industria industriaCodigo) {
        this.industriaCodigo = industriaCodigo;
    }

    @XmlTransient
    public List<Colecao> getColecaoList() {
        return colecaoList;
    }

    public void setColecaoList(List<Colecao> colecaoList) {
        this.colecaoList = colecaoList;
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
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Marca[ codigo=" + codigo + " ]";
    }
    
}
