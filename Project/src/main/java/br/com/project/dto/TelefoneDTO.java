package br.com.project.dto;

public class TelefoneDTO {

	private Long idTelefone;

	private Integer celularTelefone;

	@Override
	public String toString() {
		return String.format("TelefoneDTO [idTelefone=%s, celularTelefone=%s, " 
	+ "telefoneTelefone=%s, usuarioDTO=%s]",
				idTelefone, celularTelefone, telefoneTelefone, usuarioDTO);
	}

	private Integer telefoneTelefone;

	private UsuarioDTO usuarioDTO;

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

	public UsuarioDTO getUsuario() {
		return usuarioDTO;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuarioDTO = usuario;
	}

}
