package com.simple.rest.products;

import com.simple.rest.exception.WebException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE},
    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
    public ResponseEntity saveProduct(@RequestBody ProductsDto dto) {
        ProductsEntity productsEntity = productsService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ProductsResponseDto(
                productsEntity.getUuid().toString(),
                productsEntity.title,
                productsEntity.price,
                productsEntity.description,
                productsEntity.fountain
        ));
    }

    @ExceptionHandler(ConstraintViolationException.class)
    private ResponseEntity<WebException> constraintHandler(ConstraintViolationException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new WebException(exception.getConstraintViolations().toString()));
    }

}
