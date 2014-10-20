/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;

import java.io.Serializable;
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

/**
 * comentario da classe
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "PAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByCodigo", query = "SELECT p FROM Pais p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Pais.findByNome", query = "SELECT p FROM Pais p WHERE p.nome = :nome"),
    @NamedQuery(name = "Pais.findBySigla", query = "SELECT p FROM Pais p WHERE p.sigla = :sigla"),
    @NamedQuery(name = "Pais.findByNacionalidade", query = "SELECT p FROM Pais p WHERE p.nacionalidade = :nacionalidade")})
public class Pais extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAIS_SEQ")
    @SequenceGenerator(name = "PAIS_SEQ", sequenceName = "PAIS_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @ManyToMany(mappedBy = "paisList", fetch = FetchType.LAZY)
    private List<Colecao> colecaoList;
    @ManyToMany(mappedBy = "paisList", fetch = FetchType.LAZY)
    private List<Marca> marcaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paisCodigo", fetch = FetchType.LAZY)
    private List<Cep> cepList;
    @JoinColumn(name = "IDIOMA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Idiomas idiomaCodigo;
    @JoinColumn(name = "CONTINENTE_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Continente continenteCodigo;

    public Pais() {
    }

    public Pais(Long codigo) {
        this.codigo = codigo;
    }
    
    public Pais(String nome, String sigla, Continente continente, Idiomas idiomas) {
        this.continenteCodigo = continente;
        this.idiomaCodigo = idiomas;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Pais(Long codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @XmlTransient
    public List<Colecao> getColecaoList() {
        return colecaoList;
    }

    public void setColecaoList(List<Colecao> colecaoList) {
        this.colecaoList = colecaoList;
    }

    @XmlTransient
    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
    }

    @XmlTransient
    public List<Cep> getCepList() {
        return cepList;
    }

    public void setCepList(List<Cep> cepList) {
        this.cepList = cepList;
    }

    public Idiomas getIdiomaCodigo() {
        return idiomaCodigo;
    }

    public void setIdiomaCodigo(Idiomas idiomaCodigo) {
        this.idiomaCodigo = idiomaCodigo;
    }

    public Continente getContinenteCodigo() {
        return continenteCodigo;
    }

    public void setContinenteCodigo(Continente continenteCodigo) {
        this.continenteCodigo = continenteCodigo;
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
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Pais[ codigo=" + codigo + " ]";
    }
    
    public List<Pais> listaPaises() {
    	ArrayList<Pais> paises = new ArrayList(super.list());
    	return paises;
    }
    
}
