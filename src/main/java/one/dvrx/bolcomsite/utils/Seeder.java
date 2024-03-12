package one.dvrx.bolcomsite.utils;

import one.dvrx.bolcomsite.dao.ProductRepository;
import one.dvrx.bolcomsite.models.Product;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Seeder {

    private ProductRepository productRepository;

    public Seeder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        Product product1 = new Product(
                "MPK mini",
                "AKAI",
                "midi keyboards",
                "great beginner's keyboard for lots of settings",
                94.10,
                34
        );

        Product product2 = new Product(
                "Ez creator plus",
                "Devine",
                "midi keyboards",
                "cheap entry keyboard with loads of cool settings",
                58.55,
                39
        );

        Product product3 = new Product(
                "LPK25 MK2",
                "AKAI",
                "midi keyboards",
                "A tiny keyboard practical for travelling",
                54.00,
                6
        );

        this.productRepository.save(product1);
        this.productRepository.save(product2);
        this.productRepository.save(product3);
    }
}