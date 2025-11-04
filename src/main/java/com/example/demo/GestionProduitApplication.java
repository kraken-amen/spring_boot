package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages="com.example.demo.entitise")
public class GestionProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProduitApplication.class, args);
	}

}
