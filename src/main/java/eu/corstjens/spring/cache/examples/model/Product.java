package eu.corstjens.spring.cache.examples.model;

import java.util.List;

/**
 * Created by koencorstjens on 17/04/16.
 */

public class Product {

    private Long id;

    private String name;

    private List<Category> categories;

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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
