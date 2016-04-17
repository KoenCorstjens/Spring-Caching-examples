package eu.corstjens.spring.cache.examples.model;

import java.util.List;

/**
 * Created by koencorstjens on 17/04/16.
 */

public class Category {

    private Long id;

    private String name;


    private List<Product> products;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}