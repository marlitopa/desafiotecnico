package com.marlito.desafiotecnico;

import org.springframework.boot.SpringApplication;

public class TestDesafiotecnicoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DesafiotecnicoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
