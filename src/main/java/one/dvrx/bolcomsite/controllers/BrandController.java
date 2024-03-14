package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.BrandDAO;
import one.dvrx.bolcomsite.models.Brand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private BrandDAO brandDAO;

    public BrandController(BrandDAO brandDAO) {
        this.brandDAO = brandDAO;
    }

    @GetMapping
    public ResponseEntity<List<Brand>> getBrand() {
        return ResponseEntity.ok(brandDAO.getAllBrands());
    }
}
