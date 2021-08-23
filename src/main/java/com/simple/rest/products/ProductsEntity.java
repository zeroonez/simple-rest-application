package com.simple.rest.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class ProductsEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @NotNull
    UUID uuid;
    @NotNull
    String title;
    @NotNull
    int price;
    String description;
    String fountain;

    public UUID getUuid() {
        return uuid;
    }

    public ProductsEntity setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ProductsEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public ProductsEntity setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductsEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getFountain() {
        return fountain;
    }

    public ProductsEntity setFountain(String fountain) {
        this.fountain = fountain;
        return this;
    }
}
