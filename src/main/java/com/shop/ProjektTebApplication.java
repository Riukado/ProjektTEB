package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjektTebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektTebApplication.class, args);
	}

}
/*
	14 sprawozdań - 1 na tydzień
		Sprawozdanie ma zawierać:
		- postęp prac,
		- opis napotkanych problemów,
		- wnioski

	Pierwsze sprawozdanie:
		- dobrać się w pary/trójki,
		- wybrać temat,
		- stworzyć trello,
		- stworzyć projekt i wypchnąć go na gita,
		- rozpocząć pracę nad pierwszymi serwisami/encjami/kontrolerami
	---------------------------- H2 Database Dependency

	---------------------------- application properties config
	# Enabling H2 Console
	spring.h2.console.enabled=true

	# Custom H2 Console URL
	spring.h2.console.path=/h2

	# Configure H2 Datasource
	spring.datasource.url=jdbc:h2:file:./data/demo
	spring.datasource.driverClassName=org.h2.Driver
	spring.datasource.username=sa
	spring.datasource.password=password
	spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
	spring.jpa.hibernate,ddl-auto=update

 */