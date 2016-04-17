package eu.corstjens.spring.cache.examples.model;

import java.io.Serializable;

/**
 * Created by koencorstjens on 17/04/16.
 */

public class Address implements Serializable {

    private Long id;

    private String url;

    private WebShop webShop;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebShop getWebShop() {
        return webShop;
    }

    public void setWebShop(WebShop webShop) {
        this.webShop = webShop;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
