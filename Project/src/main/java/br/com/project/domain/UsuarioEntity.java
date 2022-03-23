package br.com.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class UsuarioEntity {

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@JsonInclude(Include.NON_NULL)
	private String nomeUsuario;

	@JsonInclude(Include.NON_NULL)
	private String idadeUsuario;

	@JsonInclude(Include.NON_NULL)
	private String emailUsuario;

	@JsonInclude(Include.NON_NULL)
	private String CPFUsuario;

	@JsonInclude(Include.NON_NULL)
	private String generoUsuario;

	@JsonInclude(Include.NON_NULL)
	private String signoUsuario;

	@JsonInclude(Include.NON_NULL)
	private String maeUsuario;

	@JsonInclude(Include.NON_NULL)
	private String paiUsuario;

	@JsonInclude(Include.NON_NULL)
	@OneToMany(mappedBy = "usuario")
	private List<EnderecoEntity> endereco;

	@JsonInclude(Include.NON_NULL)
	@OneToMany(mappedBy = "usuario")
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
