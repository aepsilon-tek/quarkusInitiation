package org.aepsilon.culturetek.springboot;

import org.aepsilon.culturetek.springboot.service.ReferentielService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class SpringbootApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	/* 
	* Seconde possibilité pour importer des datas
	@Bean
	public CommandLineRunner demo(ReferentielService service) {
	  return (args) -> {
		  service.initData();
	  };
	}
	*/
}
