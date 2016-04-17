package eu.corstjens.spring.cache.examples;

import eu.corstjens.spring.cache.examples.model.Brand;
import eu.corstjens.spring.cache.examples.service.BrandService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by koencorstjens on 17/04/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class Example1 {

    @Autowired
    private BrandService brandService;


    @Test
    public void getBrands(){
        List<Brand> brandList1 = brandService.getBrands();
        Assert.assertEquals(5, brandList1.size());
        List<Brand> brandList2 = brandService.getBrands();
        Assert.assertEquals(5, brandList2.size());
        List<Brand> brandList3 = brandService.getBrands();
        Assert.assertEquals(5, brandList3.size());
        Brand brand = brandService.getBrand(1l);
    }
}
