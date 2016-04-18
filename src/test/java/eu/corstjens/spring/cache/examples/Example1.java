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
    public void getBrandsExample1(){
        List<Brand> brandList1 = brandService.getBrands();
        Assert.assertEquals(5, brandList1.size());

        List<Brand> brandList2 = brandService.getBrands();
        Assert.assertEquals(5, brandList2.size());

        List<Brand> brandList3 = brandService.getBrands();
        Assert.assertEquals(5, brandList3.size());

        Brand brand = brandService.getBrand(1l);
        List<Brand> brandList4 = brandService.getBrands();
        Assert.assertEquals(5, brandList4.size());

    }

    @Test
    public void getBrandsExample2(){
        List<Brand> brandList1 = brandService.getBrands();
        Assert.assertEquals(5, brandList1.size());

        List<Brand> brandList2 = brandService.getBrands();
        Assert.assertEquals(5, brandList2.size());

        List<Brand> brandList3 = brandService.getBrands();
        Assert.assertEquals(5, brandList3.size());

        Brand brand = brandService.getBrand(1l);
        List<Brand> brandList4 = brandService.getBrands();
        Assert.assertEquals(5, brandList4.size());

        Brand brand2 = brandService.getBrand(1l);
        Brand newBrand = new Brand(6L,"Esprit");
        brandService.saveBrand(newBrand);

        Brand brand6 = brandService.getBrand(6l);
    }

}
