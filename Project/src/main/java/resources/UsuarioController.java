package resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Services.EnderecoService;
import Services.UsuarioService;
import domain.Endereco;
import domain.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> buscador(Usuario usuario){
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarTodas());
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salva(@RequestBody Usuario usuario) {
		usuarioService.salvarUsuario(usuario);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> busca(@PathVariable("/id") Long id) {
		Optional<Usuario> usuario = usuarioService.BuscarUm(id);
		if(usuario == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(usuario);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Long id) {
		usuarioService.Deletar(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void atualizar(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
		usuarioService.atualizar(usuario, id);
	}
	
	
	@RequestMapping(value = "/{id}/endereco", method = RequestMethod.POST)
	public void adicionarEndereco(@PathVariable("id") Long usuarioId, 
			@RequestBody Endereco endereco) {
		enderecoService.salvarEndereco(usuarioId, endereco);
	}
	

}
