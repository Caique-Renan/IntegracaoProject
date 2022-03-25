package br.com.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EnderecoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ENDERECO")
	private Long idEndereco;

	@Column(name = "RUA_ENDERECO")
	private String ruaEndereco;

	@Column(name = "NUMERO_ENDERECO")
	private Integer numeroendereco;

	@Column(name = "BAIRRO_ENDERECO")
	private String bairroEndereco;

	@Column(name = "CIDADE_ENDERECO")
	private String cidadeEndereco;

	@Column(name = "ESTADO_ENDERECO")
	private String estadoEndereco;

	@Column(name = "CEP_ENDERECO")
	private Integer CEPEndereco;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_USUARIO")
	@JsonIgnore
	private UsuarioEntity usuarioEntity;

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}

	public Integer getNumeroendereco() {
		return numeroendereco;
	}

	public void setNumeroendereco(Integer numeroendereco) {
		this.numeroendereco = numeroendereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getEstadoEndereco() {
		return estadoEndereco;
	}

	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}

	public Integer getCEPEndereco() {
		return CEPEndereco;
	}

	public void setCEPEndereco(Integer cEPEndereco) {
		CEPEndereco = cEPEndereco;
	}

	public UsuarioEntity getidUsuario() {
		return usuarioEntity;
	}

	public void setidUsuario(UsuarioEntity idUsuario) {
		this.usuarioEntity = idUsuario;
	}

}
