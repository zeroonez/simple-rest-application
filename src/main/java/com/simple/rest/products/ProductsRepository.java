package com.simple.rest.products;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductsRepository extends JpaRepository<ProductsEntity, UUID> {
}
