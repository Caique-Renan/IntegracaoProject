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
public class TelefoneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TELEFONE")
	private Long idTelefone;

	@Column(name = "CELULAR_TELEFONE")
	private Integer celularTelefone;

	@Column(name = "TELEFONE_TELEFONE")
	private Integer telefoneTelefone;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_USUARIO")
	@JsonIgnore
	private UsuarioEntity usuario;

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

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

}
