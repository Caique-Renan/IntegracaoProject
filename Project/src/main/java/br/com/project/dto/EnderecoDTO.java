package br.com.project.dto;

import java.util.Optional;

import br.com.project.domain.UsuarioEntity;

public class EnderecoDTO {

	private Long idEndereco;

	private String ruaEndereco;

	private Integer numeroendereco;

	private String bairroEndereco;

	private String cidadeEndereco;

	private String estadoEndereco;

	private Integer CEPEndereco;

	private Optional<UsuarioEntity> usuario;

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

	public Optional<UsuarioEntity> getUsuario() {
		return usuario;
	}

	public void setUsuario(Optional<UsuarioEntity> usuario) {
		this.usuario = usuario;
	}

}
