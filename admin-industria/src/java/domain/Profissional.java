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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "PROFISSIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profissional.findAll", query = "SELECT p FROM Profissional p"),
    @NamedQuery(name = "Profissional.findByCodigo", query = "SELECT p FROM Profissional p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Profissional.findByNome", query = "SELECT p FROM Profissional p WHERE p.nome = :nome"),
    @NamedQuery(name = "Profissional.findByNomeProfissional", query = "SELECT p FROM Profissional p WHERE p.nomeProfissional = :nomeProfissional"),
    @NamedQuery(name = "Profissional.findByEmail", query = "SELECT p FROM Profissional p WHERE p.email = :email"),
    @NamedQuery(name = "Profissional.findByFone", query = "SELECT p FROM Profissional p WHERE p.fone = :fone"),
    @NamedQuery(name = "Profissional.findByCelular", query = "SELECT p FROM Profissional p WHERE p.celular = :celular"),
    @NamedQuery(name = "Profissional.findBySite", query = "SELECT p FROM Profissional p WHERE p.site = :site"),
    @NamedQuery(name = "Profissional.findByDescricaoTrabalho", query = "SELECT p FROM Profissional p WHERE p.descricaoTrabalho = :descricaoTrabalho"),
    @NamedQuery(name = "Profissional.findByFoto", query = "SELECT p FROM Profissional p WHERE p.foto = :foto"),
    @NamedQuery(name = "Profissional.findByRedeSocial1", query = "SELECT p FROM Profissional p WHERE p.redeSocial1 = :redeSocial1"),
    @NamedQuery(name = "Profissional.findByRedeSocial2", query = "SELECT p FROM Profissional p WHERE p.redeSocial2 = :redeSocial2"),
    @NamedQuery(name = "Profissional.findByRedeSocial3", query = "SELECT p FROM Profissional p WHERE p.redeSocial3 = :redeSocial3"),
    @NamedQuery(name = "Profissional.findByGenero", query = "SELECT p FROM Profissional p WHERE p.genero = :genero"),
    @NamedQuery(name = "Profissional.findByApelido", query = "SELECT p FROM Profissional p WHERE p.apelido = :apelido")})
public class Profissional implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "NOME_PROFISSIONAL")
    private String nomeProfissional;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "SITE")
    private String site;
    @Column(name = "DESCRICAO_TRABALHO")
    private String descricaoTrabalho;
    @Column(name = "FOTO")
    private String foto;
    @Column(name = "REDE_SOCIAL_1")
    private String redeSocial1;
    @Column(name = "REDE_SOCIAL_2")
    private String redeSocial2;
    @Column(name = "REDE_SOCIAL_3")
    private String redeSocial3;
    @Column(name = "GENERO")
    private Character genero;
    @Column(name = "APELIDO")
    private String apelido;
    @JoinColumn(name = "CARGO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Cargo cargoCodigo;

    public Profissional() {
    }

    public Profissional(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDescricaoTrabalho() {
        return descricaoTrabalho;
    }

    public void setDescricaoTrabalho(String descricaoTrabalho) {
        this.descricaoTrabalho = descricaoTrabalho;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRedeSocial1() {
        return redeSocial1;
    }

    public void setRedeSocial1(String redeSocial1) {
        this.redeSocial1 = redeSocial1;
    }

    public String getRedeSocial2() {
        return redeSocial2;
    }

    public void setRedeSocial2(String redeSocial2) {
        this.redeSocial2 = redeSocial2;
    }

    public String getRedeSocial3() {
        return redeSocial3;
    }

    public void setRedeSocial3(String redeSocial3) {
        this.redeSocial3 = redeSocial3;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Cargo getCargoCodigo() {
        return cargoCodigo;
    }

    public void setCargoCodigo(Cargo cargoCodigo) {
        this.cargoCodigo = cargoCodigo;
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
        if (!(object instanceof Profissional)) {
            return false;
        }
        Profissional other = (Profissional) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Profissional[ codigo=" + codigo + " ]";
    }
    
}
