package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.models.Brand;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrandDAO {

    private BrandRepository brandRepository;

    public BrandDAO(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> getAllBrands() {
        List<Brand> brands = this.brandRepository.findAll();
        return brands;
    }

}
