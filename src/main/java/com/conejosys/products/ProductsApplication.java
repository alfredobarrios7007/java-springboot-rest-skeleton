package com.conejosys.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.conejosys.products.controllers","com.conejosys.products.dao","com.conejosys.products.services"})
@EntityScan(basePackages = {"com.conejosys.products.models"})
@EnableJpaRepositories(basePackages = {"com.conejosys.products.dao"})
@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	
}
