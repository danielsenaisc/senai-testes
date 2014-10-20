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
@Table(name = "TIPO_ANEXO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAnexo.findAll", query = "SELECT t FROM TipoAnexo t"),
    @NamedQuery(name = "TipoAnexo.findByCodigo", query = "SELECT t FROM TipoAnexo t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoAnexo.findByDescricaoReduzida", query = "SELECT t FROM TipoAnexo t WHERE t.descricaoReduzida = :descricaoReduzida"),
    @NamedQuery(name = "TipoAnexo.findByDescricao", query = "SELECT t FROM TipoAnexo t WHERE t.descricao = :descricao")})
public class TipoAnexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO_REDUZIDA")
    private String descricaoReduzida;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoAnexoCodigo")
    private List<AnexoColecao> anexoColecaoList;

    public TipoAnexo() {
    }

    public TipoAnexo(Long codigo) {
        this.codigo = codigo;
    }

    public TipoAnexo(Long codigo, String descricaoReduzida, String descricao) {
        this.codigo = codigo;
        this.descricaoReduzida = descricaoReduzida;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoReduzida() {
        return descricaoReduzida;
    }

    public void setDescricaoReduzida(String descricaoReduzida) {
        this.descricaoReduzida = descricaoReduzida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<AnexoColecao> getAnexoColecaoList() {
        return anexoColecaoList;
    }

    public void setAnexoColecaoList(List<AnexoColecao> anexoColecaoList) {
        this.anexoColecaoList = anexoColecaoList;
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
        if (!(object instanceof TipoAnexo)) {
            return false;
        }
        TipoAnexo other = (TipoAnexo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.TipoAnexo[ codigo=" + codigo + " ]";
    }
    
}
