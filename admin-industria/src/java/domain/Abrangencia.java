/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "ABRANGENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abrangencia.findAll", query = "SELECT a FROM Abrangencia a"),
    @NamedQuery(name = "Abrangencia.findByCodigo", query = "SELECT a FROM Abrangencia a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Abrangencia.findByDescricao", query = "SELECT a FROM Abrangencia a WHERE a.descricao = :descricao")})
public class Abrangencia extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id    
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ABRANGENCIA_SEQ")
    @SequenceGenerator(name = "ABRANGENCIA_SEQ", sequenceName = "ABRANGENCIA_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;

    public Abrangencia() {
    }

    public Abrangencia(Long codigo) {
        this.codigo = codigo;
    }
    
    public Abrangencia(String descricao){
        this.descricao = descricao;
    }

    public Abrangencia(Long codigo, String descricao) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abrangencia)) {
            return false;
        }
        Abrangencia other = (Abrangencia) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Abrangencia[ codigo=" + codigo + " ]";
    }

    @Override
    public void add() {
        super.add(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
