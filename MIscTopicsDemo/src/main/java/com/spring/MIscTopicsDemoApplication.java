package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.spring.dto.DBConfig;

@SpringBootApplication
public class MIscTopicsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MIscTopicsDemoApplication.class, args);
	}

	
//	@Bean
//	@Profile(value = "test")
//	public DBConfig getDBConfig() {
//		DBConfig dbConfig = new DBConfig("jdbc:odbc://localhost:3306/testdb","testuser");
//		return dbConfig;
//	}
//	
//	@Bean
//	@Profile(value = "prod")
//	public DBConfig getDBConfigProd() {
//		DBConfig dbConfig = new DBConfig("jdbc:odbc://localhost:3306/proddb","produser");
//		return dbConfig;
//	}
}
