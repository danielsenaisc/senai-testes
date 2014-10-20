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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Calandrini
 */
@Entity
@Table(name = "COMPOSICAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Composicao.findAll", query = "SELECT c FROM Composicao c"),
    @NamedQuery(name = "Composicao.findByCodigo", query = "SELECT c FROM Composicao c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Composicao.findByDescricao", query = "SELECT c FROM Composicao c WHERE c.descricao = :descricao")})
public class Composicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;

    public Composicao() {
    }

    public Composicao(Long codigo) {
        this.codigo = codigo;
    }

    public Composicao(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
