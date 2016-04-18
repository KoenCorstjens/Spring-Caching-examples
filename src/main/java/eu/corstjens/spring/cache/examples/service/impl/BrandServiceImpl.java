package eu.corstjens.spring.cache.examples.service.impl;

import eu.corstjens.spring.cache.examples.model.Brand;
import eu.corstjens.spring.cache.examples.service.BrandService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by koencorstjens on 17/04/16.
 */
@Service
public class BrandServiceImpl implements BrandService{

    private final Logger log = Logger.getLogger(BrandServiceImpl.class);
    private Map<Long, Brand> brands = new HashMap<>();

    public BrandServiceImpl(){
        brands.put(1l,new Brand(1l,"Nike"));
        brands.put(2l,new Brand(2l,"Adidas"));
        brands.put(3l,new Brand(3l,"Nort Face"));
        brands.put(4l,new Brand(4l,"Nomad"));
        brands.put(5l,new Brand(5l,"Reebok"));
    }


    @Override
    public List<Brand> getBrands() {
        log.info("BrandServiceImpl getBrands");
        return new ArrayList<Brand>(brands.values());
    }

    @Override
    public Brand getBrand(Long id) {
        log.info("BrandServiceImpl getBrand"+id);
        return new Brand(id,"Nike");
    }

    @Override
    public Brand saveBrand(Brand brand) {
        log.info("BrandServiceImpl saveBrand"+brand.getId());
        brands.put(brand.getId(),brand);
        return brand;
    }
}
