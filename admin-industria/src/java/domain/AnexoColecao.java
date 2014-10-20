/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.Serializable;
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
@Table(name = "ANEXO_COLECAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnexoColecao.findAll", query = "SELECT a FROM AnexoColecao a"),
    @NamedQuery(name = "AnexoColecao.findByCodigo", query = "SELECT a FROM AnexoColecao a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "AnexoColecao.findByTitulo", query = "SELECT a FROM AnexoColecao a WHERE a.titulo = :titulo"),
    @NamedQuery(name = "AnexoColecao.findByDescricao", query = "SELECT a FROM AnexoColecao a WHERE a.descricao = :descricao"),
    @NamedQuery(name = "AnexoColecao.findByUrl", query = "SELECT a FROM AnexoColecao a WHERE a.url = :url")})
public class AnexoColecao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANEXO_COLECAO_SEQ")
    @SequenceGenerator(name = "ANEXO_COLECAO_SEQ", sequenceName = "ANEXO_COLECAO_SEQ")
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @JoinColumn(name = "TIPO_ANEXO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private TipoAnexo tipoAnexoCodigo;
    @JoinColumn(name = "COLECAO_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(optional = false)
    private Colecao colecaoCodigo;

    public AnexoColecao() {
    }

    public AnexoColecao(String codigo) {
        this.codigo = codigo;
    }

    public AnexoColecao(String titulo, String descricao, String url, TipoAnexo tipoAnexoCodigo, Colecao colecaoCodigo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
        this.tipoAnexoCodigo = tipoAnexoCodigo;
        this.colecaoCodigo = colecaoCodigo;
    }

    public AnexoColecao(String codigo, String url) {
        this.codigo = codigo;
        this.url = url;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TipoAnexo getTipoAnexoCodigo() {
        return tipoAnexoCodigo;
    }

    public void setTipoAnexoCodigo(TipoAnexo tipoAnexoCodigo) {
        this.tipoAnexoCodigo = tipoAnexoCodigo;
    }

    public Colecao getColecaoCodigo() {
        return colecaoCodigo;
    }

    public void setColecaoCodigo(Colecao colecaoCodigo) {
        this.colecaoCodigo = colecaoCodigo;
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
        if (!(object instanceof AnexoColecao)) {
            return false;
        }
        AnexoColecao other = (AnexoColecao) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.AnexoColecao[ codigo=" + codigo + " ]";
    }
    
}
