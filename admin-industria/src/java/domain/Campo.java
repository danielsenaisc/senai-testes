/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "CAMPO", catalog = "", schema = "RIGHTSIZE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campo.findAll", query = "SELECT c FROM Campo c"),
    @NamedQuery(name = "Campo.findByCodigo", query = "SELECT c FROM Campo c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Campo.findByDescricao", query = "SELECT c FROM Campo c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Campo.findByAjuda", query = "SELECT c FROM Campo c WHERE c.ajuda = :ajuda")})
public class Campo extends GenericDao implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "campoCodigo")
    private Collection<Telas> telasCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAMPO_SEQ")
    @SequenceGenerator(name = "CAMPO_SEQ", sequenceName = "CAMPO_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO", nullable = false, length = 100)
    private String descricao;
    @Basic(optional = false)
    @Column(name = "AJUDA", nullable = false, length = 500)
    private String ajuda;

    public Campo() {
    }

    public Campo(Long codigo) {
        this.codigo = codigo;
    }
    
    public Campo(String descricao, String ajuda){
        this.descricao = descricao;
        this.ajuda = ajuda;
    }

    public Campo(Long codigo, String descricao, String ajuda) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ajuda = ajuda;
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

    public String getAjuda() {
        return ajuda;
    }

    public void setAjuda(String ajuda) {
        this.ajuda = ajuda;
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
        if (!(object instanceof Campo)) {
            return false;
        }
        Campo other = (Campo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Campo[ codigo=" + codigo + " ]";
    }

    @XmlTransient
    public Collection<Telas> getTelasCollection() {
        return telasCollection;
    }

    public void setTelasCollection(Collection<Telas> telasCollection) {
        this.telasCollection = telasCollection;
    }
    
}
