/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "INDUSTRIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Industria.findAll", query = "SELECT i FROM Industria i"),
    @NamedQuery(name = "Industria.findByCodigo", query = "SELECT i FROM Industria i WHERE i.codigo = :codigo"),
    @NamedQuery(name = "Industria.findByCnpj", query = "SELECT i FROM Industria i WHERE i.cnpj = :cnpj"),
    @NamedQuery(name = "Industria.findByNomeFantasia", query = "SELECT i FROM Industria i WHERE i.nomeFantasia = :nomeFantasia"),
    @NamedQuery(name = "Industria.findByRazaoSocial", query = "SELECT i FROM Industria i WHERE i.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "Industria.findByIncricaoEstadual", query = "SELECT i FROM Industria i WHERE i.incricaoEstadual = :incricaoEstadual"),
    @NamedQuery(name = "Industria.findByNumero", query = "SELECT i FROM Industria i WHERE i.numero = :numero"),
    @NamedQuery(name = "Industria.findByComplemento", query = "SELECT i FROM Industria i WHERE i.complemento = :complemento"),
    @NamedQuery(name = "Industria.findBySobre", query = "SELECT i FROM Industria i WHERE i.sobre = :sobre"),
    @NamedQuery(name = "Industria.findByDataFundacao", query = "SELECT i FROM Industria i WHERE i.dataFundacao = :dataFundacao"),
    @NamedQuery(name = "Industria.findByArquivoMarcaInsdustria", query = "SELECT i FROM Industria i WHERE i.arquivoMarcaInsdustria = :arquivoMarcaInsdustria")})
public class Industria extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INDUSTRIA_SEQ")
    @SequenceGenerator(name = "INDUSTRIA_SEQ", sequenceName = "INDUSTRIA_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "CNPJ")
    private BigInteger cnpj;
    @Column(name = "NOME_FANTASIA")
    private String nomeFantasia;
    @Basic(optional = false)
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    @Column(name = "INCRICAO_ESTADUAL")
    private Long incricaoEstadual;
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "SOBRE")
    private String sobre;
    @Column(name = "DATA_FUNDACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFundacao;
    @Column(name = "ARQUIVO_MARCA_INSDUSTRIA")
    private String arquivoMarcaInsdustria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "industriaCodigo", fetch = FetchType.LAZY)
    private List<UsuarioIndustria> usuarioIndustriaList;
    @JoinColumn(name = "CODIGO_IDIOMA_PADRAO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Idiomas codigoIdiomaPadrao;
    @JoinColumn(name = "CEP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cep cepCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "industriaCodigo", fetch = FetchType.LAZY)
    private List<Marca> marcaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "industriaCodigo", fetch = FetchType.LAZY)
    private List<Relatorio> relatorioList;

    public Industria() {
    }

    public Industria(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public Industria(BigInteger cnpj, String razaoSocial, Idiomas codigoIdiomaPadrao, Cep cepCodigo){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.codigoIdiomaPadrao = codigoIdiomaPadrao;
        this.cepCodigo = cepCodigo;
    }
    
    public Industria(BigDecimal codigo, BigInteger cnpj, String razaoSocial) {
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigInteger getCnpj() {
        return cnpj;
    }

    public void setCnpj(BigInteger cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Long getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(Long incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getArquivoMarcaInsdustria() {
        return arquivoMarcaInsdustria;
    }

    public void setArquivoMarcaInsdustria(String arquivoMarcaInsdustria) {
        this.arquivoMarcaInsdustria = arquivoMarcaInsdustria;
    }

    @XmlTransient
    public List<UsuarioIndustria> getUsuarioIndustriaList() {
        return usuarioIndustriaList;
    }

    public void setUsuarioIndustriaList(List<UsuarioIndustria> usuarioIndustriaList) {
        this.usuarioIndustriaList = usuarioIndustriaList;
    }

    public Idiomas getCodigoIdiomaPadrao() {
        return codigoIdiomaPadrao;
    }

    public void setCodigoIdiomaPadrao(Idiomas codigoIdiomaPadrao) {
        this.codigoIdiomaPadrao = codigoIdiomaPadrao;
    }

    public Cep getCepCodigo() {
        return cepCodigo;
    }

    public void setCepCodigo(Cep cepCodigo) {
        this.cepCodigo = cepCodigo;
    }

    @XmlTransient
    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
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
        if (!(object instanceof Industria)) {
            return false;
        }
        Industria other = (Industria) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Industria[ codigo=" + codigo + " ]";
    }
    
}
