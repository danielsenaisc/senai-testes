/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "RELATORIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relatorio.findAll", query = "SELECT r FROM Relatorio r"),
    @NamedQuery(name = "Relatorio.findByCodigo", query = "SELECT r FROM Relatorio r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Relatorio.findByPeriodicidade", query = "SELECT r FROM Relatorio r WHERE r.periodicidade = :periodicidade"),
    @NamedQuery(name = "Relatorio.findByDataInicial", query = "SELECT r FROM Relatorio r WHERE r.dataInicial = :dataInicial"),
    @NamedQuery(name = "Relatorio.findByDataFinal", query = "SELECT r FROM Relatorio r WHERE r.dataFinal = :dataFinal"),
    @NamedQuery(name = "Relatorio.findByPrivacidade", query = "SELECT r FROM Relatorio r WHERE r.privacidade = :privacidade")})
public class Relatorio implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Column(name = "PERIODICIDADE")
    private String periodicidade;
    @Column(name = "DATA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicial;
    @Column(name = "DATA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFinal;
    @Column(name = "PRIVACIDADE")
    private String privacidade;
    @JoinColumn(name = "TIPO_RELATORIO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoRelatorio tipoRelatorioCodigo;
    @JoinColumn(name = "INDUSTRIA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Industria industriaCodigo;

    public Relatorio() {
    }

    public Relatorio(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getPrivacidade() {
        return privacidade;
    }

    public void setPrivacidade(String privacidade) {
        this.privacidade = privacidade;
    }

    public TipoRelatorio getTipoRelatorioCodigo() {
        return tipoRelatorioCodigo;
    }

    public void setTipoRelatorioCodigo(TipoRelatorio tipoRelatorioCodigo) {
        this.tipoRelatorioCodigo = tipoRelatorioCodigo;
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
        if (!(object instanceof Relatorio)) {
            return false;
        }
        Relatorio other = (Relatorio) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Relatorio[ codigo=" + codigo + " ]";
    }
    
}
