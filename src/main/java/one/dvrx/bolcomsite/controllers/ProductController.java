package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.ProductDAO;
import one.dvrx.bolcomsite.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductDAO productDAO;

    public ProductController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping
    public List<Product> getProduct() {
        return productDAO.getAllProducts();
    }

}
