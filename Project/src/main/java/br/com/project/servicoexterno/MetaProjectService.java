package br.com.project.servicoexterno;

import java.io.IOException;
import java.net.http.HttpClient;

import javax.tools.JavaFileManager.Location;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class MetaProjectService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MetaProjectService.class);
	
	public Location getWOEId(Integer CEPEndereco) throws IOException{
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(
				"https://www.findcep.com/docs/index.html#/API%20CEP" + CEPEndereco);
		request.setHeader("Contenty-Type", String.valueOf(MediaType.APPLICATION_JSON_UTF8));
		return null;
	}

}
