package one.dvrx.bolcomsite.utils;

import one.dvrx.bolcomsite.dao.*;
import one.dvrx.bolcomsite.models.*;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Seeder {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    private BrandRepository brandRepository;
    private OrderListRepository orderListRepository;
    private MemberRepository memberRepository;

    private OrderedProductRepository orderedProductRepository;

    public Seeder(ProductRepository productRepository, CategoryRepository categoryRepository, BrandRepository brandRepository, OrderListRepository orderListRepository, MemberRepository memberRepository, OrderedProductRepository orderedProductRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.brandRepository = brandRepository;
        this.orderListRepository = orderListRepository;
        this.memberRepository = memberRepository;
        this.orderedProductRepository = orderedProductRepository;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        Brand brand1 = new Brand("AKAI");
        this.brandRepository.save(brand1);

        Brand brand2 = new Brand("Arturia");
        this.brandRepository.save(brand2);

        Brand brand3 = new Brand("M-Audio");
        this.brandRepository.save(brand3);

        Brand brand4 = new Brand("Bowers & Wilkins");
        this.brandRepository.save(brand4);

        Brand brand5 = new Brand("devine");
        this.brandRepository.save(brand5);

        Brand brand6 = new Brand("Devialet");
        this.brandRepository.save(brand6);

        Brand brand7 = new Brand("Focal");
        this.brandRepository.save(brand7);

        Category category1 = new Category("midi-keyboards");
        Category category2 = new Category("studio monitors");
        Category category3 = new Category("speakers");
        this.categoryRepository.save(category1);
        this.categoryRepository.save(category2);
        this.categoryRepository.save(category3);

        Product product1 = new Product(
                "MPK mini",
                "geweldig beginners keyboard met veel instellingen",
                94.10,
                34,
                category1,
                brand1
        );

        Product product2 = new Product(
                "Ez creator plus",
                "een goedkoop beginners keyboard met veel coole settings",
                58.55,
                39,
                category1,
                brand5
        );

        Product product3 = new Product(
                "LPK25 MK2",
                "Een klein keyboard handig voor onderweg",
                54.00,
                6,
                category2,
                brand1
        );

        Product product4 = new Product(
                "Oxygen Pro Mini",
                "Een middelgroot keyboard voor de professionele producer",
                109.00,
                11,
                category1,
                brand3
        );

        Product product5 = new Product(
                "MPK mini plus",
                "Een middelgroot keyboard voor de professionele producer",
                159.00,
                11,
                category1,
                brand1
        );

        Product product6 = new Product(
                "804 D4",
                "Een uitstekende speakers voor in huis",
                16000.00,
                11,
                category2,
                brand4
        );

        Product product7 = new Product(
                "Phantom II",
                "Een exclusieve speaker voor de echte audiofiel",
                999.00,
                11,
                category2,
                brand6
        );

        Product product8 = new Product(
                "Nautilus floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                100000.00,
                11,
                category2,
                brand4
        );

        Product product9 = new Product(
                "Grande Utopia III EM evo floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                249998.00,
                11,
                category2,
                brand7
        );

        Product product10 = new Product(
                "801 D4 signature midnight blue metallic",
                "Een exclusieve speaker voor de echte audiofiel",
                27500.00,
                11,
                category2,
                brand4
        );


        this.productRepository.save(product1);
        this.productRepository.save(product2);
        this.productRepository.save(product3);
        this.productRepository.save(product4);
        this.productRepository.save(product5);
        this.productRepository.save(product6);
        this.productRepository.save(product7);
        this.productRepository.save(product8);
        this.productRepository.save(product9);
        this.productRepository.save(product10);


        Member member1 = new Member(
                "2109jordy2241@gmail.com",
                "@J2o0r0d4y",
                "Jordy",
                "hoogheemraadstraat 42",
                "2241CH");
        this.memberRepository.save(member1);

        OrderList orderList1 = new OrderList("10-12-2024", 2000, member1);
        this.orderListRepository.save(orderList1);

        OrderedProduct orderedProduct1 = new OrderedProduct("MPK", "AKAI", 109, orderList1);
        this.orderedProductRepository.save(orderedProduct1);
    }
}
