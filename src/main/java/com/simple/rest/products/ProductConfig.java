package com.simple.rest.products;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan("com.simple.rest.products")
@Import({ProductsController.class, ProductsService.class})
public class ProductConfig {
}