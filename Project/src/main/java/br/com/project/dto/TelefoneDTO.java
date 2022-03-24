package br.com.project.dto;

import java.util.Optional;

import br.com.project.domain.UsuarioEntity;

public class TelefoneDTO {

	private Long idTelefone;

	private Integer celularTelefone;

	private Integer telefoneTelefone;

	private Optional<UsuarioEntity> usuario;

	public Long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	public Integer getCelularTelefone() {
		return celularTelefone;
	}

	public void setCelularTelefone(Integer celularTelefone) {
		this.celularTelefone = celularTelefone;
	}

	public Integer getTelefoneTelefone() {
		return telefoneTelefone;
	}

	public void setTelefoneTelefone(Integer telefoneTelefone) {
		this.telefoneTelefone = telefoneTelefone;
	}

	public Optional<UsuarioEntity> getUsuario() {
		return usuario;
	}

	public void setUsuario(Optional<UsuarioEntity> usuario) {
		this.usuario = usuario;
	}

}
