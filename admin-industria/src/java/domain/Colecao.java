/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
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

import utils.Genero;
import control.Conexao;
import control.GenericDao;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "COLECAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colecao.findAll", query = "SELECT c FROM Colecao c"),
    @NamedQuery(name = "Colecao.findByCodigo", query = "SELECT c FROM Colecao c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Colecao.findByNome", query = "SELECT c FROM Colecao c WHERE c.nome = :nome"),
    @NamedQuery(name = "Colecao.findByVigenciaInicial", query = "SELECT c FROM Colecao c WHERE c.vigenciaInicial = :vigenciaInicial"),
    @NamedQuery(name = "Colecao.findByVigenciaFinal", query = "SELECT c FROM Colecao c WHERE c.vigenciaFinal = :vigenciaFinal"),
    @NamedQuery(name = "Colecao.findByDescricao", query = "SELECT c FROM Colecao c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Colecao.findByIdadeInicial", query = "SELECT c FROM Colecao c WHERE c.idadeInicial = :idadeInicial"),
    @NamedQuery(name = "Colecao.findByIdadeFinal", query = "SELECT c FROM Colecao c WHERE c.idadeFinal = :idadeFinal"),
    @NamedQuery(name = "Colecao.findByGenero", query = "SELECT c FROM Colecao c WHERE c.genero = :genero"),
    @NamedQuery(name = "Colecao.findByCodigoLivre", query = "SELECT c FROM Colecao c WHERE c.codigoLivre = :codigoLivre")})
public class Colecao extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COLECAO_SEQ")
    @SequenceGenerator(name = "COLECAO_SEQ", sequenceName = "COLECAO_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "VIGENCIA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigenciaInicial;
    @Column(name = "VIGENCIA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigenciaFinal;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "IDADE_INICIAL")
    private Long idadeInicial;
    @Column(name = "IDADE_FINAL")
    private Long idadeFinal;
    @Column(name = "GENERO")
    private Character genero;
    @Column(name = "CODIGO_LIVRE")
    private String codigoLivre;
    @JoinTable(name = "TAG_COLECAO", joinColumns = {
        @JoinColumn(name = "COLECAO_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "TAG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Tag> tagList;
    @JoinTable(name = "PAIS_COLECAO", joinColumns = {
        @JoinColumn(name = "COLECAO_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "PAIS_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Pais> paisList;
    @JoinTable(name = "ESTILO_COLECAO", joinColumns = {
        @JoinColumn(name = "COLECAO_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "ESTILO_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Estilo> estiloList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colecaoCodigo", fetch = FetchType.LAZY)
    private List<AnexoColecao> anexoColecaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colecaoCodigo", fetch = FetchType.LAZY)
    private List<Produtos> produtosList;
    @JoinColumn(name = "MARCA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Marca marcaCodigo;
    @JoinColumn(name = "COLECAO_STATUS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ColecaoStatus colecaoStatusCodigo;

    public Colecao() {
    }

    public Colecao(BigDecimal codigo) {
        this.codigo = codigo;
    }
    
    public Colecao(String nome, Marca marca, ColecaoStatus colecaoStatus){
    	this.nome = nome;
    	this.marcaCodigo = marca;
    	this.colecaoStatusCodigo = colecaoStatus;
    }

    public Colecao(BigDecimal codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    

    public Colecao(BigDecimal codigo, String nome, Date vigenciaInicial,
			Date vigenciaFinal, String descricao, Long idadeInicial,
			Long idadeFinal, Genero genero, String codigoLivre,
			Marca marcaCodigo, ColecaoStatus colecaoStatusCodigo) {
		this.codigo = codigo;
		this.nome = nome;
		this.vigenciaInicial = vigenciaInicial;
		this.vigenciaFinal = vigenciaFinal;
		this.descricao = descricao;
		this.idadeInicial = idadeInicial;
		this.idadeFinal = idadeFinal;
		this.genero = genero.getDescricao();
		this.codigoLivre = codigoLivre;
		this.marcaCodigo = marcaCodigo;
		this.colecaoStatusCodigo = colecaoStatusCodigo;
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

    public Date getVigenciaInicial() {
        return vigenciaInicial;
    }

    public void setVigenciaInicial(Date vigenciaInicial) {
        this.vigenciaInicial = vigenciaInicial;
    }

    public Date getVigenciaFinal() {
        return vigenciaFinal;
    }

    public void setVigenciaFinal(Date vigenciaFinal) {
        this.vigenciaFinal = vigenciaFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdadeInicial() {
        return idadeInicial;
    }

    public void setIdadeInicial(Long idadeInicial) {
        this.idadeInicial = idadeInicial;
    }

    public Long getIdadeFinal() {
        return idadeFinal;
    }

    public void setIdadeFinal(Long idadeFinal) {
        this.idadeFinal = idadeFinal;
    }

    //TODO GENERO
    public Character getGenero() {
        return genero;
    }

    //TODO GENERO
    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getCodigoLivre() {
        return codigoLivre;
    }

    public void setCodigoLivre(String codigoLivre) {
        this.codigoLivre = codigoLivre;
    }

    @XmlTransient
    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    @XmlTransient
    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    @XmlTransient
    public List<Estilo> getEstiloList() {
        return estiloList;
    }

    public void setEstiloList(List<Estilo> estiloList) {
        this.estiloList = estiloList;
    }

    @XmlTransient
    public List<AnexoColecao> getAnexoColecaoList() {
        return anexoColecaoList;
    }

    public void setAnexoColecaoList(List<AnexoColecao> anexoColecaoList) {
        this.anexoColecaoList = anexoColecaoList;
    }

    @XmlTransient
    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    public Marca getMarcaCodigo() {
        return marcaCodigo;
    }

    public void setMarcaCodigo(Marca marcaCodigo) {
        this.marcaCodigo = marcaCodigo;
    }

    public ColecaoStatus getColecaoStatusCodigo() {
        return colecaoStatusCodigo;
    }

    public void setColecaoStatusCodigo(ColecaoStatus colecaoStatusCodigo) {
        this.colecaoStatusCodigo = colecaoStatusCodigo;
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
        if (!(object instanceof Colecao)) {
            return false;
        }
        Colecao other = (Colecao) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Colecao[ codigo=" + codigo + " ]";
    }
    
    public ArrayList<Colecao> listaColecoes(){
    	ArrayList<Colecao> arrayList = new ArrayList(super.list());
    	return arrayList;
    }
    
    public ArrayList<Colecao> findByStatus(String status){
    	ArrayList<Colecao> listaColecoesPorDescricao = new ArrayList<Colecao>();

    	for (Colecao colecao : listaColecoes()) {
			if(colecao.getColecaoStatusCodigo().getDescricao().equals(status)) listaColecoesPorDescricao.add(colecao);
		}
    	
    	return listaColecoesPorDescricao;
    }
    
}
