package com.simple.rest.products;

import com.simple.rest.validation.Base64;

import javax.validation.constraints.NotNull;

public class ProductsDto {

    @NotNull
    String title;
    @NotNull
    int price;
    String description;
    @Base64
    String fountain;

    public ProductsDto(String title, int price, String description, String fountain) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.fountain = fountain;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFountain() {
        return fountain;
    }

    public void setFountain(String fountain) {
        this.fountain = fountain;
    }

}
