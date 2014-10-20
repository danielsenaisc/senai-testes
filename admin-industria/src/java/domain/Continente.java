/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
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
@Table(name = "CONTINENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Continente.findAll", query = "SELECT c FROM Continente c"),
    @NamedQuery(name = "Continente.findByCodigo", query = "SELECT c FROM Continente c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Continente.findByNome", query = "SELECT c FROM Continente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Continente.findBySigla", query = "SELECT c FROM Continente c WHERE c.sigla = :sigla")})
public class Continente extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTINENTE_SEQ")
    @SequenceGenerator(name = "CONTINENTE_SEQ", sequenceName = "CONTINENTE_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "SIGLA")
    private String sigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "continenteCodigo", fetch = FetchType.LAZY)
    private List<Pais> paisList;

    public Continente() {
    }

    public Continente(Long codigo) {
        this.codigo = codigo;
    }

    public Continente( String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public Continente(Long codigo, String nome, String sigla) {
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

    @XmlTransient
    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }
    
}
