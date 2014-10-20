/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "ESTILO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estilo.findAll", query = "SELECT e FROM Estilo e"),
    @NamedQuery(name = "Estilo.findByCodigo", query = "SELECT e FROM Estilo e WHERE e.codigo = :codigo"),
    @NamedQuery(name = "Estilo.findByDescricao", query = "SELECT e FROM Estilo e WHERE e.descricao = :descricao")})
public class Estilo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @JoinTable(name = "ESTILO_MARCA", joinColumns = {
        @JoinColumn(name = "ESTILO_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "MARCA_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany
    private List<Marca> marcaList;
    @ManyToMany(mappedBy = "estiloList")
    private List<Colecao> colecaoList;

    public Estilo() {
    }

    public Estilo(Long codigo) {
        this.codigo = codigo;
    }

    public Estilo(Long codigo, String descricao) {
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
    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
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
        if (!(object instanceof Estilo)) {
            return false;
        }
        Estilo other = (Estilo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Estilo[ codigo=" + codigo + " ]";
    }
    
}
