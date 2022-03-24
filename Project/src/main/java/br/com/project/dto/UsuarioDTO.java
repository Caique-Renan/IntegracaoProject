package br.com.project.dto;

import java.util.List;

import br.com.project.domain.EnderecoEntity;
import br.com.project.domain.TelefoneEntity;

public class UsuarioDTO {

	private Long idUsuario;

	private String nomeUsuario;

	private String idadeUsuario;

	private String emailUsuario;

	private String CPFUsuario;

	private String generoUsuario;

	private String signoUsuario;

	private String maeUsuario;

	private String paiUsuario;

	private List<EnderecoEntity> endereco;

	private List<TelefoneEntity> telefone;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getIdadeUsuario() {
		return idadeUsuario;
	}

	public void setIdadeUsuario(String idadeUsuario) {
		this.idadeUsuario = idadeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getCPFUsuario() {
		return CPFUsuario;
	}

	public void setCPFUsuario(String cPFUsuario) {
		CPFUsuario = cPFUsuario;
	}

	public String getGeneroUsuario() {
		return generoUsuario;
	}

	public void setGeneroUsuario(String generoUsuario) {
		this.generoUsuario = generoUsuario;
	}

	public String getSignoUsuario() {
		return signoUsuario;
	}

	public void setSignoUsuario(String signoUsuario) {
		this.signoUsuario = signoUsuario;
	}

	public String getMaeUsuario() {
		return maeUsuario;
	}

	public void setMaeUsuario(String maeUsuario) {
		this.maeUsuario = maeUsuario;
	}

	public String getPaiUsuario() {
		return paiUsuario;
	}

	public void setPaiUsuario(String paiUsuario) {
		this.paiUsuario = paiUsuario;
	}

	public List<EnderecoEntity> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoEntity> endereco) {
		this.endereco = endereco;
	}

	public List<TelefoneEntity> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<TelefoneEntity> telefone) {
		this.telefone = telefone;
	}

}
