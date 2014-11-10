/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import utils.Formatador;
import utils.Genero;
import utils.OracleBoolean;
import utils.RadioOptions;

/**
 *
 * @author IST-08-PC
 */
@Entity
@Table(name = "MARCA", catalog = "", schema = "RIGHTSIZE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findById", query = "SELECT m FROM Marca m WHERE m.id = :id"),
    @NamedQuery(name = "Marca.findByNome", query = "SELECT m FROM Marca m WHERE m.nome = :nome"),
    @NamedQuery(name = "Marca.findByDescricao", query = "SELECT m FROM Marca m WHERE m.descricao = :descricao"),
    @NamedQuery(name = "Marca.findByLogomarca", query = "SELECT m FROM Marca m WHERE m.logomarca = :logomarca"),
    @NamedQuery(name = "Marca.findByDataCriacao", query = "SELECT m FROM Marca m WHERE m.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Marca.findByGenero", query = "SELECT m FROM Marca m WHERE m.genero = :genero"),
    @NamedQuery(name = "Marca.findByIdadeInicial", query = "SELECT m FROM Marca m WHERE m.idadeInicial = :idadeInicial"),
    @NamedQuery(name = "Marca.findByIdadeFinal", query = "SELECT m FROM Marca m WHERE m.idadeFinal = :idadeFinal"),
    @NamedQuery(name = "Marca.findByStatus", query = "SELECT m FROM Marca m WHERE m.status = :status")})
public class Marca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MARCA_SEQ")
    @SequenceGenerator(name = "MARCA_SEQ", sequenceName = "MARCA_SEQ")
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;
    @Column(name = "DESCRICAO", length = 200)
    private String descricao;
    @Column(name = "LOGOMARCA", length = 500)
    private String logomarca;
    @Basic(optional = false)
    @Column(name = "DATA_CRIACAO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Column(name = "GENERO")
    private Character genero;
    @Basic(optional = false)
    @Column(name = "IDADE_INICIAL", nullable = false)
    private long idadeInicial;
    @Basic(optional = false)
    @Column(name = "IDADE_FINAL", nullable = false)
    private long idadeFinal;
    @Basic(optional = false)
    @Column(name = "STATUS", nullable = false)
    private Character status;
    @ManyToMany(mappedBy = "marcaList", fetch = FetchType.LAZY)
    private List<Estilo> estiloList;
    @JoinTable(name = "MODELAGEM_MARCA", joinColumns = {
        @JoinColumn(name = "MARCA_ID", referencedColumnName = "ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "MODELAGEM_ID", referencedColumnName = "ID", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Modelagem> modelagemList;
    @JoinTable(name = "PAIS_MARCA", joinColumns = {
        @JoinColumn(name = "MARCA_ID", referencedColumnName = "ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "PAIS_ID", referencedColumnName = "ID", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Pais> paisList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaId", fetch = FetchType.LAZY)
    private List<MarcaCanal> marcaCanalList;
    @JoinColumn(name = "INDUSTRIA_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Industria industriaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaId", fetch = FetchType.LAZY)
    private List<Colecao> colecaoList;

    public Marca() {
    }

    public Marca(Long id) {
        this.id = id;
    }

    public Marca(Long id, String nome, Date dataCriacao, long idadeInicial, long idadeFinal, Character status) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.idadeInicial = idadeInicial;
        this.idadeFinal = idadeFinal;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        if (nome == null) {
            return "";
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        if (descricao == null) {
            return "";
        }
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLogomarca() {
        //TODO ver metodo de tratamento null
        return logomarca;
    }

    public void setLogomarca(String logomarca) {
        this.logomarca = logomarca;
    }

    public Date getDataCriacao() {
        if (dataCriacao == null) {
            return new Date();
        }
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Character getGenero() {
        if (genero == null) {
            return ' ';
        }
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public long getIdadeInicial() {
        //TODO checar retorno null
        return idadeInicial;
    }

    public void setIdadeInicial(long idadeInicial) {
        this.idadeInicial = idadeInicial;
    }

    public long getIdadeFinal() {
        //TODO checar retorno null
        return idadeFinal;
    }

    public void setIdadeFinal(long idadeFinal) {
        this.idadeFinal = idadeFinal;
    }

    public Character getStatus() {
        if (status == null) {
            return ' ';
        }
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @XmlTransient
    public List<Estilo> getEstiloList() {
        if (estiloList == null) {
            return new ArrayList();
        }
        return estiloList;
    }

    public void setEstiloList(List<Estilo> estiloList) {
        this.estiloList = estiloList;
    }

    @XmlTransient
    public List<Modelagem> getModelagemList() {
        if (modelagemList == null) {
            return new ArrayList();
        }
        return modelagemList;
    }

    public void setModelagemList(List<Modelagem> modelagemList) {
        this.modelagemList = modelagemList;
    }

    @XmlTransient
    public List<Pais> getPaisList() {
        if (paisList == null) {
            return new ArrayList();
        }
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    @XmlTransient
    public List<MarcaCanal> getMarcaCanalList() {
        if (marcaCanalList == null) {
            return new ArrayList();
        }
        return marcaCanalList;
    }

    public void setMarcaCanalList(List<MarcaCanal> marcaCanalList) {
        this.marcaCanalList = marcaCanalList;
    }

    public Industria getIndustriaId() {
        return industriaId;
    }

    public void setIndustriaId(Industria industriaId) {
        this.industriaId = industriaId;
    }

    @XmlTransient
    public List<Colecao> getColecaoList() {
        if (colecaoList == null) {
            return new ArrayList();
        }
        return colecaoList;
    }

    public void setColecaoList(List<Colecao> colecaoList) {
        this.colecaoList = colecaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNome();
    }

    /* CUSTOM METHODS */
    public int getQuantidadeProdutos() {
        int quantidadeDeProdutos = 0;

        for (Colecao colecaoList : getColecaoList()) {
            quantidadeDeProdutos += colecaoList.getProdutosList().size();
        }

        return quantidadeDeProdutos;
    }

    public String getStatusTratado() {
        if (getStatus().equals(OracleBoolean.TRUE.getValue())) {
            return "Ativo";
        }
        return "Inativo";
    }

    public String getDataCriacaoTratada() {
        return Formatador.formataData(getDataCriacao());
    }

    public String isMascChecked() {
        if (getGenero().equals(Genero.MASCULINO.getDescricao())) {
            return RadioOptions.CHECKED.getOption();
        }
        return RadioOptions.UNCHECkED.getOption();
    }

    public String isFemChecked() {
        if (getGenero().equals(Genero.FEMININO.getDescricao())) {
            return RadioOptions.CHECKED.getOption();
        }
        return RadioOptions.UNCHECkED.getOption();
    }

    public String isUnissexChecked() {
        //retorno default para marcasVazias;
        if (getId() == null) {
            return RadioOptions.CHECKED.getOption();
        }
        if (getGenero().equals(Genero.UNISSEX.getDescricao())) {
            return RadioOptions.CHECKED.getOption();
        }
        return RadioOptions.UNCHECkED.getOption();
    }

    public String getEstiloListTratado() {
        String retorno = "";

        if (getEstiloList().size() <= 0) {
            return retorno;
        }

        for (Estilo style : getEstiloList()) {
            retorno += (style.getDescricao() + ",");
        }

        retorno = retorno.substring(0, retorno.length() - 1);

        return retorno;
    }

    public String getLocationsListTratado() {
        String retorno = "";

        if (getPaisList().size() <= 0) {
            return retorno;
        }

        for (Pais location : getPaisList()) {
            retorno += (location.getNome() + ",");
        }

        retorno = retorno.substring(0, retorno.length() - 1);

        return retorno;
    }

    public Pais getDefaultCountry() {
        //TODO implementar regra para retorno de Marca > Pais
        return new Pais();
    }

    public String isActive() {
        //retorno default para marcasVazias;
        if (getId() == null) {
            return "checked";
        }
        if (getStatus().equals(OracleBoolean.TRUE.getValue())) {
        	return "checked";
        }
        return RadioOptions.UNCHECkED.getOption();
    }

    public String isInactive() {
        if (getStatus().equals(OracleBoolean.FALSE.getValue())) {
            return RadioOptions.CHECKED.getOption();
        }
        return RadioOptions.UNCHECkED.getOption();
    }

    public void setDataCriacao(String dataCriacao) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataCriacao = simpleDateFormat.parse(dataCriacao);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
