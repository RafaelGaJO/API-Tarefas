package com.rev.revisao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RevisaoApplication {

	private static final Logger logger = LoggerFactory.getLogger(RevisaoApplication.class);

	public static void main(String[] args) {
		logger.info("🚀 Iniciando a aplicação Revisao...");
		SpringApplication.run(RevisaoApplication.class, args);
		logger.info("✅ Aplicação Revisao iniciada com sucesso!");
	}
}