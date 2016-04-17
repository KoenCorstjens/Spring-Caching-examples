package eu.corstjens.spring.cache.examples.service.impl;

import eu.corstjens.spring.cache.examples.model.Brand;
import eu.corstjens.spring.cache.examples.service.BrandService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koencorstjens on 17/04/16.
 */
@Service
public class BrandServiceImpl implements BrandService{

    private final Logger log = Logger.getLogger(BrandServiceImpl.class);

    @Override
    public List<Brand> getBrands() {
        log.info("BrandServiceImpl getBrands");
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1l,"Nike"));
        brands.add(new Brand(2l,"Adidas"));
        brands.add(new Brand(3l,"Nort Face"));
        brands.add(new Brand(4l,"Nomad"));
        brands.add(new Brand(5l,"Reebok"));
        return brands;
    }

    @Override
    public Brand getBrand(Long id) {
        log.info("BrandServiceImpl getBrand"+id);
        return new Brand(id,"Nike");
    }
}
