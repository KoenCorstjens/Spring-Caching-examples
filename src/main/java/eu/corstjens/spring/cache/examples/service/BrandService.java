package eu.corstjens.spring.cache.examples.service;

import eu.corstjens.spring.cache.examples.model.Brand;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by koencorstjens on 17/04/16.
 */
public interface BrandService {

    @Cacheable("brands")
    List<Brand> getBrands();

    @Cacheable("brands")
    Brand getBrand(Long id);

}
