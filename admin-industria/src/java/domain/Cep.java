/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import control.GenericDao;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CEP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cep.findAll", query = "SELECT c FROM Cep c"),
    @NamedQuery(name = "Cep.findByCodigo", query = "SELECT c FROM Cep c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cep.findByRua", query = "SELECT c FROM Cep c WHERE c.rua = :rua"),
    @NamedQuery(name = "Cep.findByCidade", query = "SELECT c FROM Cep c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cep.findByEstado", query = "SELECT c FROM Cep c WHERE c.estado = :estado")})
public class Cep extends GenericDao implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CEP_SEQ")
    @SequenceGenerator(name = "CEP_SEQ", sequenceName = "CEP_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Column(name = "RUA")
    private String rua;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cepCodigo", fetch = FetchType.LAZY)
    private List<Industria> industriaList;
    @JoinColumn(name = "PAIS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pais paisCodigo;

    public Cep() {
    }

    public Cep(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public Cep(Pais paisCodigo) {
        this.paisCodigo = paisCodigo;
    }

    public Cep(String rua, String cidade, String estado, Pais paisCodigo) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.paisCodigo = paisCodigo;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Industria> getIndustriaList() {
        return industriaList;
    }

    public void setIndustriaList(List<Industria> industriaList) {
        this.industriaList = industriaList;
    }

    public Pais getPaisCodigo() {
        return paisCodigo;
    }

    public void setPaisCodigo(Pais paisCodigo) {
        this.paisCodigo = paisCodigo;
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
        if (!(object instanceof Cep)) {
            return false;
        }
        Cep other = (Cep) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Cep[ codigo=" + codigo + " ]";
    }
    
}
