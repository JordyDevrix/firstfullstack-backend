package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.ProductDAO;
import one.dvrx.bolcomsite.dto.ProductDTO;
import one.dvrx.bolcomsite.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductDAO productDAO;

    public ProductController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Product>> getProduct() {
        return ResponseEntity.ok(productDAO.getAllProducts());
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductDTO productDTO) {
        this.productDAO.createProduct(productDTO);
        return ResponseEntity.ok("Product added");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable long id, @RequestBody ProductDTO productDTO) {
        this.productDAO.updateProductById(id, productDTO);
        return ResponseEntity.ok("Updated task with id:" + id);
    }

}
