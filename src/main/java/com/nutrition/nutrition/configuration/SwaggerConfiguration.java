package com.nutrition.nutrition.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
  private ApiInfo apiInfo() {
		return new ApiInfo(
      "Nutrition Service API",
      "Nutrition Service API Description",
      "1.0",
      "http://github.com",
      new Contact("Ricardo Uribe", "http://github.com", "ricardoauribe@hotmail.com"),
      "LICENSE",
      "LICENSE URL",
      Collections.emptyList()
    );
	}


  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
      .select()
      .build();
  }

}
