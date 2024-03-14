package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.dto.BrandDTO;
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

    public void createBrand(BrandDTO brandDTO) {
        Brand brand = new Brand(brandDTO.name);
        this.brandRepository.save(brand);
    }
}
