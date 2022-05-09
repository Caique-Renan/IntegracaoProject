package br.com.project.servicoexterno;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.project.dto.ViaCEPDTO;

public class MetaProjectService {

	

//	public ViaCEPDTO buscaCEP() {
//
//		String url = "http://viacep.com.br/ws/05075030/json/";
//
//		ViaCEPDTO forObject = restTemplate.getForObject(url, ViaCEPDTO.class);
//		
//		return forObject;
//
//	}

	public class ViaCepCtrl implements Serializable {
	private static final long serialVersionUID = 6046704732666502085L;

		public ResponseEntity<ViaCEPDTO> doObterCep(@PathVariable(name = "cep") String cep) {

		    return null;
		  }

		}
}
