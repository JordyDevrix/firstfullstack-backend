package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.dto.ProductDTO;
import one.dvrx.bolcomsite.models.Brand;
import one.dvrx.bolcomsite.models.Category;
import one.dvrx.bolcomsite.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDAO {

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    private BrandRepository brandRepository;

    public ProductDAO(ProductRepository productRepository, CategoryRepository categoryRepository, BrandRepository brandRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.brandRepository = brandRepository;
    }

    public List<Product> getAllProducts() {
        List<Product> products = this.productRepository.findAll();
        System.out.println(products);
        return products;
    }

    public void createProduct(ProductDTO productDTO) {
        Optional<Category> optionalCategory = this.categoryRepository.findById(productDTO.categoryId);
        Optional<Brand> optionalBrand = this.brandRepository.findById(productDTO.brandId);

        if (optionalCategory.isPresent() && optionalBrand.isPresent()) {
            Category category = optionalCategory.get();
            Brand brand = optionalBrand.get();

            Product product = new Product(
                    productDTO.name,
                    productDTO.description,
                    productDTO.price,
                    productDTO.quantity,
                    category,
                    brand,
                    productDTO.url
            );

            this.productRepository.save(product);

        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Given category or brand does not exist"
            );
        }
    }

    public void updateProductById(long id, ProductDTO productDTO) {
        Optional<Product> optionalProduct = this.productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(productDTO.name);
            product.setPrice(productDTO.price);
            this.productRepository.save(product);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "The product you're trying to update does not exist"
            );
        }
    }

    public Product getAllProductsById(long id) {
        Optional<Product> optionalProduct = this.productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            return product;
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Product does not exist"
            );
        }
    }

    public Category getProductCategoryById(long id) {
        Optional<Product> optionalProduct = this.productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Category category = optionalProduct.get().getCategory();
            return category;
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Product does not exist"
            );
        }
    }

    public Brand getProductBrandById(long id) {
        Optional<Product> optionalProduct = this.productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Brand brand = optionalProduct.get().getBrand();
            return brand;
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Product does not exist"
            );
        }
    }
}
