/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CANAL_COMUNICACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CanalComunicacao.findAll", query = "SELECT c FROM CanalComunicacao c"),
    @NamedQuery(name = "CanalComunicacao.findByCodigo", query = "SELECT c FROM CanalComunicacao c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "CanalComunicacao.findByDescricaoReduzida", query = "SELECT c FROM CanalComunicacao c WHERE c.descricaoReduzida = :descricaoReduzida")})
public class CanalComunicacao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CANAL_COMUNICACAO_SEQ")
    @SequenceGenerator(name = "CANAL_COMUNICACAO_SEQ", sequenceName = "CANAL_COMUNICACAO_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO_REDUZIDA")
    private String descricaoReduzida;

    public CanalComunicacao() {
    }

    public CanalComunicacao(BigDecimal codigo) {
        this.codigo = codigo;
    }
    
    public CanalComunicacao(String descricaoReduzida) {
        this.descricaoReduzida = descricaoReduzida;
    }

    public CanalComunicacao(BigDecimal codigo, String descricaoReduzida) {
        this.codigo = codigo;
        this.descricaoReduzida = descricaoReduzida;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoReduzida() {
        return descricaoReduzida;
    }

    public void setDescricaoReduzida(String descricaoReduzida) {
        this.descricaoReduzida = descricaoReduzida;
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
        if (!(object instanceof CanalComunicacao)) {
            return false;
        }
        CanalComunicacao other = (CanalComunicacao) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.CanalComunicacao[ codigo=" + codigo + " ]";
    }
    
}
