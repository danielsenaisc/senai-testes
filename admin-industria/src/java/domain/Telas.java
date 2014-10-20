/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "TELAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telas.findAll", query = "SELECT t FROM Telas t"),
    @NamedQuery(name = "Telas.findByCodigo", query = "SELECT t FROM Telas t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "Telas.findByDescricao", query = "SELECT t FROM Telas t WHERE t.descricao = :descricao")})
public class Telas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @ManyToMany(mappedBy = "telasList")
    private List<Idiomas> idiomasList;
    @JoinColumn(name = "CAMPO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Campo campoCodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telasCodigo")
    private List<PerfilAcesso> perfilAcessoList;

    public Telas() {
    }

    public Telas(Long codigo) {
        this.codigo = codigo;
    }

    public Telas(Long codigo, String descricao) {
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
    public List<Idiomas> getIdiomasList() {
        return idiomasList;
    }

    public void setIdiomasList(List<Idiomas> idiomasList) {
        this.idiomasList = idiomasList;
    }

    public Campo getCampoCodigo() {
        return campoCodigo;
    }

    public void setCampoCodigo(Campo campoCodigo) {
        this.campoCodigo = campoCodigo;
    }

    @XmlTransient
    public List<PerfilAcesso> getPerfilAcessoList() {
        return perfilAcessoList;
    }

    public void setPerfilAcessoList(List<PerfilAcesso> perfilAcessoList) {
        this.perfilAcessoList = perfilAcessoList;
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
        if (!(object instanceof Telas)) {
            return false;
        }
        Telas other = (Telas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Telas[ codigo=" + codigo + " ]";
    }
    
}
