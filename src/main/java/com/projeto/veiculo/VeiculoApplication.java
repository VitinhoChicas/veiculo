package com.projeto.veiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "com.projeto.veiculo")
@EntityScan(basePackages = {"com.projeto.veiculo.domains"})
@EnableJpaRepositories(basePackages =  "com.projeto.veiculo.repositories")
@SpringBootApplication
public class VeiculoApplication {





	public static void main(String[] args) {
		SpringApplication.run(VeiculoApplication.class, args);
	}

}
