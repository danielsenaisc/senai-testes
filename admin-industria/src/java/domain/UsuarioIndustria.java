/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "USUARIO_INDUSTRIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioIndustria.findAll", query = "SELECT u FROM UsuarioIndustria u"),
    @NamedQuery(name = "UsuarioIndustria.findByCodigo", query = "SELECT u FROM UsuarioIndustria u WHERE u.codigo = :codigo"),
    @NamedQuery(name = "UsuarioIndustria.findByNome", query = "SELECT u FROM UsuarioIndustria u WHERE u.nome = :nome"),
    @NamedQuery(name = "UsuarioIndustria.findByFoto", query = "SELECT u FROM UsuarioIndustria u WHERE u.foto = :foto"),
    @NamedQuery(name = "UsuarioIndustria.findByEmail", query = "SELECT u FROM UsuarioIndustria u WHERE u.email = :email"),
    @NamedQuery(name = "UsuarioIndustria.findByStatus", query = "SELECT u FROM UsuarioIndustria u WHERE u.status = :status"),
    @NamedQuery(name = "UsuarioIndustria.findByGenero", query = "SELECT u FROM UsuarioIndustria u WHERE u.genero = :genero"),
    @NamedQuery(name = "UsuarioIndustria.findByDataNascimento", query = "SELECT u FROM UsuarioIndustria u WHERE u.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "UsuarioIndustria.findBySenhaAcesso", query = "SELECT u FROM UsuarioIndustria u WHERE u.senhaAcesso = :senhaAcesso"),
    @NamedQuery(name = "UsuarioIndustria.findByCodigoDepartamento", query = "SELECT u FROM UsuarioIndustria u WHERE u.codigoDepartamento = :codigoDepartamento"),
    @NamedQuery(name = "UsuarioIndustria.findByCodigoCargo", query = "SELECT u FROM UsuarioIndustria u WHERE u.codigoCargo = :codigoCargo")})
public class UsuarioIndustria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FOTO")
    private String foto;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "GENERO")
    private Character genero;
    @Column(name = "DATA_NASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @Basic(optional = false)
    @Column(name = "SENHA_ACESSO")
    private BigInteger senhaAcesso;
    @Basic(optional = false)
    @Column(name = "CODIGO_DEPARTAMENTO")
    private String codigoDepartamento;
    @Basic(optional = false)
    @Column(name = "CODIGO_CARGO")
    private String codigoCargo;
    @JoinColumn(name = "PERFIL_ACESSO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private PerfilAcesso perfilAcessoCodigo;
    @JoinColumn(name = "INDUSTRIA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Industria industriaCodigo;

    public UsuarioIndustria() {
    }

    public UsuarioIndustria(Long codigo) {
        this.codigo = codigo;
    }

    public UsuarioIndustria(Long codigo, String nome, Character status, BigInteger senhaAcesso, String codigoDepartamento, String codigoCargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
        this.senhaAcesso = senhaAcesso;
        this.codigoDepartamento = codigoDepartamento;
        this.codigoCargo = codigoCargo;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigInteger getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(BigInteger senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(String codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public PerfilAcesso getPerfilAcessoCodigo() {
        return perfilAcessoCodigo;
    }

    public void setPerfilAcessoCodigo(PerfilAcesso perfilAcessoCodigo) {
        this.perfilAcessoCodigo = perfilAcessoCodigo;
    }

    public Industria getIndustriaCodigo() {
        return industriaCodigo;
    }

    public void setIndustriaCodigo(Industria industriaCodigo) {
        this.industriaCodigo = industriaCodigo;
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
        if (!(object instanceof UsuarioIndustria)) {
            return false;
        }
        UsuarioIndustria other = (UsuarioIndustria) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.UsuarioIndustria[ codigo=" + codigo + " ]";
    }
    
}
