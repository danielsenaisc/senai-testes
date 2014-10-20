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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "IDIOMAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Idiomas.findAll", query = "SELECT i FROM Idiomas i"),
    @NamedQuery(name = "Idiomas.findByCodigo", query = "SELECT i FROM Idiomas i WHERE i.codigo = :codigo"),
    @NamedQuery(name = "Idiomas.findByDescricao", query = "SELECT i FROM Idiomas i WHERE i.descricao = :descricao")})
public class Idiomas extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDIOMAS_SEQ")
    @SequenceGenerator(name = "IDIOMAS_SEQ", sequenceName = "IDIOMAS_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @JoinTable(name = "TRADUCAO_TELAS", joinColumns = {
        @JoinColumn(name = "IDIOMAS_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "TELAS_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Telas> telasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoIdiomaPadrao", fetch = FetchType.LAZY)
    private List<Industria> industriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idiomaCodigo", fetch = FetchType.LAZY)
    private List<Pais> paisList;

    public Idiomas() {
    }

    public Idiomas(Long codigo) {
        this.codigo = codigo;
    }

    public Idiomas(String descricao) {
        this.descricao = descricao;
    }

    public Idiomas(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Telas> getTelasList() {
        return telasList;
    }

    public void setTelasList(List<Telas> telasList) {
        this.telasList = telasList;
    }

    @XmlTransient
    public List<Industria> getIndustriaList() {
        return industriaList;
    }

    public void setIndustriaList(List<Industria> industriaList) {
        this.industriaList = industriaList;
    }

    @XmlTransient
    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
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
        if (!(object instanceof Idiomas)) {
            return false;
        }
        Idiomas other = (Idiomas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Idiomas[ codigo=" + codigo + " ]";
    }
    
}
