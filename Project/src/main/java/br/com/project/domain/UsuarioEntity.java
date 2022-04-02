package br.com.project.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "TB_USUARIO")
public class UsuarioEntity {

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long idUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "NOME_USUARIO")
	private String nomeUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "IDADE_USUARIO")
	private String idadeUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "EMAIL_USUARIO")
	private String emailUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "CPF_USUARIO")
	private String CPFUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "GENERO_USUARIO")
	private String generoUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "SIGNO_USUARIO")
	private String signoUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "MAE_USUARIO")
	private String maeUsuario;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "PAI_USUARIO")
	private String paiUsuario;

	@JsonInclude(Include.NON_NULL)
	@OneToMany
	@JoinColumn(name = "ID_USUARIO")
	private List<EnderecoEntity> endereco;

	@JsonInclude(Include.NON_NULL)
	@OneToMany
	@JoinColumn(name = "ID_USUARIO")
	private List<TelefoneEntity> telefone;

	@Override
	public String toString() {
		return String.format(
				"UsuarioEntity [idUsuario=%s, nomeUsuario=%s, idadeUsuario=%s, emailUsuario=%s, "
						+ "CPFUsuario=%s, generoUsuario=%s, signoUsuario=%s, maeUsuario=%s, paiUsuario=%s, "
						+ "endereco=%s, telefone=%s]",
				idUsuario, nomeUsuario, idadeUsuario, emailUsuario, CPFUsuario, generoUsuario, signoUsuario, maeUsuario,
				paiUsuario, endereco, telefone);
	}

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
