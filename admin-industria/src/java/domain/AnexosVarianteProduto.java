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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "ANEXOS_VARIANTE_PRODUTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnexosVarianteProduto.findAll", query = "SELECT a FROM AnexosVarianteProduto a"),
    @NamedQuery(name = "AnexosVarianteProduto.findByCodigoAnexoImagemVideo", query = "SELECT a FROM AnexosVarianteProduto a WHERE a.codigoAnexoImagemVideo = :codigoAnexoImagemVideo"),
    @NamedQuery(name = "AnexosVarianteProduto.findByAnexo", query = "SELECT a FROM AnexosVarianteProduto a WHERE a.anexo = :anexo")})
public class AnexosVarianteProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANEXOS_VARIANTE_PRODUTO_SEQ")
    @SequenceGenerator(name = "ANEXOS_VARIANTE_PRODUTO_SEQ", sequenceName = "ANEXOS_VARIANTE_PRODUTO_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO_ANEXO_IMAGEM_VIDEO")
    private BigDecimal codigoAnexoImagemVideo;
    @Basic(optional = false)
    @Column(name = "ANEXO")
    private String anexo;
    @JoinColumn(name = "TIPO_MEDIDA_PRODUTO_CODIGO", referencedColumnName = "CODIGO_SEQUENCIAL_ORDEM")
    @ManyToOne(optional = false)
    private TipoMedidaProdutos tipoMedidaProdutoCodigo;

    public AnexosVarianteProduto() {
    }

    public AnexosVarianteProduto(BigDecimal codigoAnexoImagemVideo) {
        this.codigoAnexoImagemVideo = codigoAnexoImagemVideo;
    }

    public AnexosVarianteProduto(String anexo, TipoMedidaProdutos tipoMedidaProdutoCodigo) {
        this.anexo = anexo;
        this.tipoMedidaProdutoCodigo = tipoMedidaProdutoCodigo;
    }

    public AnexosVarianteProduto(BigDecimal codigoAnexoImagemVideo, String anexo) {
        this.codigoAnexoImagemVideo = codigoAnexoImagemVideo;
        this.anexo = anexo;
    }

    public BigDecimal getCodigoAnexoImagemVideo() {
        return codigoAnexoImagemVideo;
    }

    public void setCodigoAnexoImagemVideo(BigDecimal codigoAnexoImagemVideo) {
        this.codigoAnexoImagemVideo = codigoAnexoImagemVideo;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public TipoMedidaProdutos getTipoMedidaProdutoCodigo() {
        return tipoMedidaProdutoCodigo;
    }

    public void setTipoMedidaProdutoCodigo(TipoMedidaProdutos tipoMedidaProdutoCodigo) {
        this.tipoMedidaProdutoCodigo = tipoMedidaProdutoCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoAnexoImagemVideo != null ? codigoAnexoImagemVideo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnexosVarianteProduto)) {
            return false;
        }
        AnexosVarianteProduto other = (AnexosVarianteProduto) object;
        if ((this.codigoAnexoImagemVideo == null && other.codigoAnexoImagemVideo != null) || (this.codigoAnexoImagemVideo != null && !this.codigoAnexoImagemVideo.equals(other.codigoAnexoImagemVideo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.AnexosVarianteProduto[ codigoAnexoImagemVideo=" + codigoAnexoImagemVideo + " ]";
    }
    
}
