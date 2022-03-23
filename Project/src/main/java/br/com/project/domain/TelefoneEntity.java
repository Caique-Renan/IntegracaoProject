package br.com.project.domain;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TelefoneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTelefone;

	private Integer celularTelefone;

	private Integer telefoneTelefone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	@JsonIgnore
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

}
