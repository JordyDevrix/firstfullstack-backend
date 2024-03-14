package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.dto.ProductDTO;
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

    public void createProduct(ProductDTO productDTO) {
        Product product = new Product(
                productDTO.name,
                productDTO.descriptionNl,
                productDTO.descriptionEn,
                productDTO.descriptionFr,
                productDTO.price,
                productDTO.quantity,
                productDTO.category,
                productDTO.brand
        );
        this.productRepository.save(product);
    }
}
