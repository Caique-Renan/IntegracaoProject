package br.com.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_ENDERECO")
public class EnderecoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENDERECO")
	private Long idEndereco;

	@Column(name = "cep")
	private String cep;

	@Column(name = "numero")
	private Integer numero;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "localidade")
	private String localidade;

	@Column(name = "uf")
	private String uf;

	@Column(name = "ibge")
	private String ibge;

	@Column(name = "gia")
	private String gia;

	@Column(name = "ddd")
	private String ddd;

	@Column(name = "siafi")
	private String siafi;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_USUARIO")
	@JsonIgnore
	private UsuarioEntity usuarioEntity;
	
	

	@Override
	public String toString() {
		return String.format(
				"EnderecoEntity [idEndereco=%s, cep=%s, numero=%s, logradouro=%s, complemento=%s, bairro=%s,"
				+ " localidade=%s, uf=%s, ibge=%s, gia=%s, ddd=%s, siafi=%s, usuarioEntity=%s]",
				idEndereco, cep, numero, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi,
				usuarioEntity);
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	public UsuarioEntity getUsuarioEntity() {
		return usuarioEntity;
	}

	public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}

	
	
}
