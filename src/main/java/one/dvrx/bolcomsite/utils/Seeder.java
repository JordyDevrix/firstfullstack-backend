package one.dvrx.bolcomsite.utils;

import one.dvrx.bolcomsite.dao.BrandRepository;
import one.dvrx.bolcomsite.dao.CategoryRepository;
import one.dvrx.bolcomsite.dao.ProductRepository;
import one.dvrx.bolcomsite.models.Brand;
import one.dvrx.bolcomsite.models.Category;
import one.dvrx.bolcomsite.models.Product;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Seeder {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private BrandRepository brandRepository;

    public Seeder(ProductRepository productRepository, CategoryRepository categoryRepository, BrandRepository brandRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.brandRepository = brandRepository;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        Brand brand = new Brand("my brand");
        this.brandRepository.save(brand);

        Category category1 = new Category("naam");
        Category category2 = new Category("naam2");
        this.categoryRepository.save(category1);
        this.categoryRepository.save(category2);

        Product product1 = new Product(
                "MPK mini",
                "great beginner's keyboard for lots of settings",
                94.10,
                34,
                category1,
                brand
        );

        Product product2 = new Product(
                "Ez creator plus",
                "cheap entry keyboard with loads of cool settings",
                58.55,
                39,
                category1,
                brand
        );

        Product product3 = new Product(
                "LPK25 MK2",
                "A tiny keyboard practical for travelling",
                54.00,
                6,
                category2,
                brand
        );

        Product product4 = new Product(
                "Oxygen Pro Mini",
                "Mid size keyboard for professional music production",
                109.00,
                11,
                category1,
                brand
        );

        this.productRepository.save(product1);
        this.productRepository.save(product2);
        this.productRepository.save(product3);
        this.productRepository.save(product4);
    }
}
