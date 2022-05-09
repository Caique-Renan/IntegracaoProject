package br.com.project.utils;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** Class responsible for creating a RestTemplate bean. */
@Configuration
public class RestTemplateConfig {

  /**
   * Method responsible for creating a RestTemplate Bean.
   *
   * @param restTemplateBuilder for the RestTemplate object.
   * @return RestTemplate for consuming others RESTful services.
   */
  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
    RestTemplate restTemplate = restTemplateBuilder.build();
    return restTemplate;
  }

}
