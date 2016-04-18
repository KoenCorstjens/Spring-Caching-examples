package eu.corstjens.spring.cache.examples.service;

import eu.corstjens.spring.cache.examples.model.Brand;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

import java.util.List;

/**
 * Created by koencorstjens on 17/04/16.
 */
@CacheConfig(cacheNames = {"brands"})
public interface BrandService {


    @Cacheable
    List<Brand> getBrands();

    @Cacheable
    Brand getBrand(Long id);

    @CachePut
    Brand saveBrand(Brand brand);


}
