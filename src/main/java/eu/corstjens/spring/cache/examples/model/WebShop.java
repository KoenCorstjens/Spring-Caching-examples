package eu.corstjens.spring.cache.examples.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by koencorstjens on 17/04/16.
 */

public class WebShop implements Serializable {

    private Long id;

    private String name;

    private Set<Brand> brands = new HashSet<>();

    private Set<Address> address = new HashSet<>();

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

    public Set<Brand> getBrands() {
        return brands;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}
