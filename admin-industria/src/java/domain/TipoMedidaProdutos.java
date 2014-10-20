/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TIPO_MEDIDA_PRODUTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMedidaProdutos.findAll", query = "SELECT t FROM TipoMedidaProdutos t"),
    @NamedQuery(name = "TipoMedidaProdutos.findByCodigoSequencialOrdem", query = "SELECT t FROM TipoMedidaProdutos t WHERE t.codigoSequencialOrdem = :codigoSequencialOrdem"),
    @NamedQuery(name = "TipoMedidaProdutos.findByValorMedida", query = "SELECT t FROM TipoMedidaProdutos t WHERE t.valorMedida = :valorMedida")})
public class TipoMedidaProdutos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_SEQUENCIAL_ORDEM")
    private BigDecimal codigoSequencialOrdem;
    @Basic(optional = false)
    @Column(name = "VALOR_MEDIDA")
    private double valorMedida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoMedidaProdutoCodigo")
    private List<AnexosVarianteProduto> anexosVarianteProdutoList;
    @JoinColumn(name = "TIPO_TECIDO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoTecido tipoTecidoCodigo;
    @JoinColumn(name = "TIPO_MEDIDA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoMedida tipoMedidaCodigo;
    @JoinColumn(name = "TIPO_GRADE_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoGrade tipoGradeCodigo;
    @JoinColumn(name = "TAMANHO_TIPO_GRADE_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TamanhoTipoGrade tamanhoTipoGradeCodigo;
    @JoinColumn(name = "PRODUTOS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Produtos produtosCodigo;
    @JoinColumn(name = "PADRAO_MEDIDA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private PadraoMedida padraoMedidaCodigo;

    public TipoMedidaProdutos() {
    }

    public TipoMedidaProdutos(BigDecimal codigoSequencialOrdem) {
        this.codigoSequencialOrdem = codigoSequencialOrdem;
    }

    public TipoMedidaProdutos(BigDecimal codigoSequencialOrdem, double valorMedida) {
        this.codigoSequencialOrdem = codigoSequencialOrdem;
        this.valorMedida = valorMedida;
    }

    public BigDecimal getCodigoSequencialOrdem() {
        return codigoSequencialOrdem;
    }

    public void setCodigoSequencialOrdem(BigDecimal codigoSequencialOrdem) {
        this.codigoSequencialOrdem = codigoSequencialOrdem;
    }

    public double getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(double valorMedida) {
        this.valorMedida = valorMedida;
    }

    @XmlTransient
    public List<AnexosVarianteProduto> getAnexosVarianteProdutoList() {
        return anexosVarianteProdutoList;
    }

    public void setAnexosVarianteProdutoList(List<AnexosVarianteProduto> anexosVarianteProdutoList) {
        this.anexosVarianteProdutoList = anexosVarianteProdutoList;
    }

    public TipoTecido getTipoTecidoCodigo() {
        return tipoTecidoCodigo;
    }

    public void setTipoTecidoCodigo(TipoTecido tipoTecidoCodigo) {
        this.tipoTecidoCodigo = tipoTecidoCodigo;
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

    public Produtos getProdutosCodigo() {
        return produtosCodigo;
    }

    public void setProdutosCodigo(Produtos produtosCodigo) {
        this.produtosCodigo = produtosCodigo;
    }

    public PadraoMedida getPadraoMedidaCodigo() {
        return padraoMedidaCodigo;
    }

    public void setPadraoMedidaCodigo(PadraoMedida padraoMedidaCodigo) {
        this.padraoMedidaCodigo = padraoMedidaCodigo;
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
        if (!(object instanceof TipoMedidaProdutos)) {
            return false;
        }
        TipoMedidaProdutos other = (TipoMedidaProdutos) object;
        if ((this.codigoSequencialOrdem == null && other.codigoSequencialOrdem != null) || (this.codigoSequencialOrdem != null && !this.codigoSequencialOrdem.equals(other.codigoSequencialOrdem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.TipoMedidaProdutos[ codigoSequencialOrdem=" + codigoSequencialOrdem + " ]";
    }
    
}
