package domain;

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
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEndereco;

	private String ruaEndereco;

	private Integer numeroendereco;

	private String bairroEndereco;

	private String cidadeEndereco;

	private String estadoEndereco;

	private Integer CEPEndereco;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	@JsonIgnore
	private Optional<Usuario> usuario;

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

	public Optional<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Optional<Usuario> usuario2, Optional<Usuario> usuario) {
		this.usuario = usuario;
	}

}
