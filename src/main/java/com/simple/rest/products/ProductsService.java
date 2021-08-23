package com.simple.rest.products;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ProductsEntity save(ProductsDto dto){
        return productsRepository.save(convertDtoToEntity(dto));
    }

    private ProductsEntity convertDtoToEntity(ProductsDto dto) {
        if (dto == null) {
            return null;
        }
        ProductsEntity productsEntity = new ProductsEntity();
        productsEntity.setTitle(dto.getTitle())
                .setPrice(dto.price)
                .setDescription(dto.description)
                .setFountain(dto.getFountain());
        return productsEntity;
    }
}
