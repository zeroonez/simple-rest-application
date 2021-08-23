package com.simple.rest.products;

public class ProductsResponseDto {

    String uuid;
    String title;
    int price;
    String description;
    String fountain;

    public ProductsResponseDto(String uuid, String title, int price, String description, String fountain) {
        this.uuid = uuid;
        this.title = title;
        this.price = price;
        this.description = description;
        this.fountain = fountain;
    }

    public String getUuid() {
        return uuid;
    }

    public ProductsResponseDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ProductsResponseDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public ProductsResponseDto setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductsResponseDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getFountain() {
        return fountain;
    }

    public ProductsResponseDto setFountain(String fountain) {
        this.fountain = fountain;
        return this;
    }
}
