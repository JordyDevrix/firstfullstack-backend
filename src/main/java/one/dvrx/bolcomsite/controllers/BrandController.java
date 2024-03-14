package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.BrandDAO;
import one.dvrx.bolcomsite.dto.BrandDTO;
import one.dvrx.bolcomsite.models.Brand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private BrandDAO brandDAO;

    public BrandController(BrandDAO brandDAO) {
        this.brandDAO = brandDAO;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Brand>> getBrand() {
        return ResponseEntity.ok(brandDAO.getAllBrands());
    }

    @PostMapping
    public ResponseEntity<String> createBrand(@RequestBody BrandDTO brandDTO) {
        this.brandDAO.createBrand(brandDTO);
        return ResponseEntity.ok("Brand added");
    }
}
