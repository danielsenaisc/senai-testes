/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import control.Conexao;
import control.GenericDao;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "COLECAO_STATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColecaoStatus.findAll", query = "SELECT c FROM ColecaoStatus c"),
    @NamedQuery(name = "ColecaoStatus.findByCodigo", query = "SELECT c FROM ColecaoStatus c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "ColecaoStatus.findByDescricao", query = "SELECT c FROM ColecaoStatus c WHERE c.descricao = :descricao")})
public class ColecaoStatus extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colecaoStatusCodigo")
    private List<Colecao> colecaoList;

    public ColecaoStatus() {
    }

    public ColecaoStatus(Long codigo) {
        this.codigo = codigo;
    }

    public ColecaoStatus(Long codigo, String descricao) {
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
        if (!(object instanceof ColecaoStatus)) {
            return false;
        }
        ColecaoStatus other = (ColecaoStatus) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.ColecaoStatus[ codigo=" + codigo + " ]";
    }
    
    public List<ColecaoStatus> listaColecaoStatus() {
    	ArrayList<ColecaoStatus> colecaoStatus = new ArrayList(super.list());
    	return colecaoStatus;
    }
    
    public ColecaoStatus findByDescricao(String descricao){
    	return (ColecaoStatus) Conexao.singleResultNamedQuery(getEntityName()+".findByDescricao", descricao, "descricao");
    }
    
    
    
}
