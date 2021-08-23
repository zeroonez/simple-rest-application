package com.simple.rest.app;

import com.simple.rest.products.ProductConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ProductConfig.class)
public class SimpleRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleRestApplication.class, args);
    }

}
