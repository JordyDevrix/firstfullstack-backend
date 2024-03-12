package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.models.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDAO {

    private ProductRepository productRepository;

    public ProductDAO(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        List<Product> products = this.productRepository.findAll();
        return products;
    }

}
