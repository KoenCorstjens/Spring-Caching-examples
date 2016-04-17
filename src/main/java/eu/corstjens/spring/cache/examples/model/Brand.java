package eu.corstjens.spring.cache.examples.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by koencorstjens on 17/04/16.
 */

public class Brand implements Serializable {

    public Brand(){
        super();
    }

    public Brand(Long id, String name){
        this.id = id;
        this.name = name;
    }


    private Long id;

    private String name;

    private Set<WebShop> webShops = new HashSet<WebShop>();

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

    public Set<WebShop> getWebShops() {
        return webShops;
    }

    public void setWebShops(Set<WebShop> webShops) {
        this.webShops = webShops;
    }
}
