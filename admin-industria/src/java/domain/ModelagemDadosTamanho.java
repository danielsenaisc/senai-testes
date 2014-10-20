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
@Table(name = "MODELAGEM_DADOS_TAMANHO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelagemDadosTamanho.findAll", query = "SELECT m FROM ModelagemDadosTamanho m"),
    @NamedQuery(name = "ModelagemDadosTamanho.findByCodigoSequencialOrdem", query = "SELECT m FROM ModelagemDadosTamanho m WHERE m.codigoSequencialOrdem = :codigoSequencialOrdem"),
    @NamedQuery(name = "ModelagemDadosTamanho.findByValorMedidaInicial", query = "SELECT m FROM ModelagemDadosTamanho m WHERE m.valorMedidaInicial = :valorMedidaInicial"),
    @NamedQuery(name = "ModelagemDadosTamanho.findByValorMedidaFinal", query = "SELECT m FROM ModelagemDadosTamanho m WHERE m.valorMedidaFinal = :valorMedidaFinal")})
public class ModelagemDadosTamanho implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_SEQUENCIAL_ORDEM")
    private BigDecimal codigoSequencialOrdem;
    @Basic(optional = false)
    @Column(name = "VALOR_MEDIDA_INICIAL")
    private double valorMedidaInicial;
    @Basic(optional = false)
    @Column(name = "VALOR_MEDIDA_FINAL")
    private double valorMedidaFinal;
    @JoinColumn(name = "TIPO_MEDIDA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoMedida tipoMedidaCodigo;
    @JoinColumn(name = "TIPO_GRADE_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoGrade tipoGradeCodigo;
    @JoinColumn(name = "TAMANHO_TIPO_GRADE_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TamanhoTipoGrade tamanhoTipoGradeCodigo;
    @JoinColumn(name = "PADRAO_MEDIDA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private PadraoMedida padraoMedidaCodigo;
    @JoinColumn(name = "MODELAGEM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Modelagem modelagemCodigo;

    public ModelagemDadosTamanho() {
    }

    public ModelagemDadosTamanho(BigDecimal codigoSequencialOrdem) {
        this.codigoSequencialOrdem = codigoSequencialOrdem;
    }

    public ModelagemDadosTamanho(BigDecimal codigoSequencialOrdem, double valorMedidaInicial, double valorMedidaFinal) {
        this.codigoSequencialOrdem = codigoSequencialOrdem;
        this.valorMedidaInicial = valorMedidaInicial;
        this.valorMedidaFinal = valorMedidaFinal;
    }

    public BigDecimal getCodigoSequencialOrdem() {
        return codigoSequencialOrdem;
    }

    public void setCodigoSequencialOrdem(BigDecimal codigoSequencialOrdem) {
        this.codigoSequencialOrdem = codigoSequencialOrdem;
    }

    public double getValorMedidaInicial() {
        return valorMedidaInicial;
    }

    public void setValorMedidaInicial(double valorMedidaInicial) {
        this.valorMedidaInicial = valorMedidaInicial;
    }

    public double getValorMedidaFinal() {
        return valorMedidaFinal;
    }

    public void setValorMedidaFinal(double valorMedidaFinal) {
        this.valorMedidaFinal = valorMedidaFinal;
    }

    public TipoMedida getTipoMedidaCodigo() {
        return tipoMedidaCodigo;
    }

    public void setTipoMedidaCodigo(TipoMedida tipoMedidaCodigo) {
        this.tipoMedidaCodigo = tipoMedidaCodigo;
    }

    public TipoGrade getTipoGradeCodigo() {
        return tipoGradeCodigo;
    }

    public void setTipoGradeCodigo(TipoGrade tipoGradeCodigo) {
        this.tipoGradeCodigo = tipoGradeCodigo;
    }

    public TamanhoTipoGrade getTamanhoTipoGradeCodigo() {
        return tamanhoTipoGradeCodigo;
    }

    public void setTamanhoTipoGradeCodigo(TamanhoTipoGrade tamanhoTipoGradeCodigo) {
        this.tamanhoTipoGradeCodigo = tamanhoTipoGradeCodigo;
    }

    public PadraoMedida getPadraoMedidaCodigo() {
        return padraoMedidaCodigo;
    }

    public void setPadraoMedidaCodigo(PadraoMedida padraoMedidaCodigo) {
        this.padraoMedidaCodigo = padraoMedidaCodigo;
    }

    public Modelagem getModelagemCodigo() {
        return modelagemCodigo;
    }

    public void setModelagemCodigo(Modelagem modelagemCodigo) {
        this.modelagemCodigo = modelagemCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSequencialOrdem != null ? codigoSequencialOrdem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelagemDadosTamanho)) {
            return false;
        }
        ModelagemDadosTamanho other = (ModelagemDadosTamanho) object;
        if ((this.codigoSequencialOrdem == null && other.codigoSequencialOrdem != null) || (this.codigoSequencialOrdem != null && !this.codigoSequencialOrdem.equals(other.codigoSequencialOrdem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.ModelagemDadosTamanho[ codigoSequencialOrdem=" + codigoSequencialOrdem + " ]";
    }
    
}
