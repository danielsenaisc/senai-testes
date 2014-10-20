/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "PERFIL_ACESSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilAcesso.findAll", query = "SELECT p FROM PerfilAcesso p"),
    @NamedQuery(name = "PerfilAcesso.findByCodigo", query = "SELECT p FROM PerfilAcesso p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "PerfilAcesso.findByCodigoTipoPermissao", query = "SELECT p FROM PerfilAcesso p WHERE p.codigoTipoPermissao = :codigoTipoPermissao")})
public class PerfilAcesso implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Column(name = "CODIGO_TIPO_PERMISSAO")
    private BigInteger codigoTipoPermissao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilAcessoCodigo")
    private List<UsuarioIndustria> usuarioIndustriaList;
    @JoinColumn(name = "TELAS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Telas telasCodigo;

    public PerfilAcesso() {
    }

    public PerfilAcesso(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigInteger getCodigoTipoPermissao() {
        return codigoTipoPermissao;
    }

    public void setCodigoTipoPermissao(BigInteger codigoTipoPermissao) {
        this.codigoTipoPermissao = codigoTipoPermissao;
    }

    @XmlTransient
    public List<UsuarioIndustria> getUsuarioIndustriaList() {
        return usuarioIndustriaList;
    }

    public void setUsuarioIndustriaList(List<UsuarioIndustria> usuarioIndustriaList) {
        this.usuarioIndustriaList = usuarioIndustriaList;
    }

    public Telas getTelasCodigo() {
        return telasCodigo;
    }

    public void setTelasCodigo(Telas telasCodigo) {
        this.telasCodigo = telasCodigo;
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
        if (!(object instanceof PerfilAcesso)) {
            return false;
        }
        PerfilAcesso other = (PerfilAcesso) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.PerfilAcesso[ codigo=" + codigo + " ]";
    }
    
}
