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
                "geweldig beginners keyboard met veel instellingen",
                "great beginner's keyboard with lots of settings",
                "une bonne keyboard debutant avec noumbreux parametres",
                94.10,
                34,
                category1,
                brand
        );

        Product product2 = new Product(
                "Ez creator plus",
                "een goedkoop beginners keyboard met veel coole settings",
                "cheap entry keyboard with loads of cool settings",
                "une bonne keyboard pas cher avec beaucoup des parametres",
                58.55,
                39,
                category1,
                brand
        );

        Product product3 = new Product(
                "LPK25 MK2",
                "Een klein keyboard handig voor onderweg",
                "A tiny keyboard practical for travelling",
                "Une petit keyboard tres utile pour voyager",
                54.00,
                6,
                category2,
                brand
        );

        Product product4 = new Product(
                "Oxygen Pro Mini",
                "Een middelgroot keyboard voor de professionele producer",
                "Mid size keyboard for professional music production",
                "Une keyboard pour les producer avec beaucoup de l'experience",
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
