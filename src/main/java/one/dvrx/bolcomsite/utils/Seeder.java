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
                brand1,
                "https://m.media-amazon.com/images/I/717qmGlA7ZL._AC_UF894,1000_QL80_.jpg"
        );

        Product product2 = new Product(
                "Ez creator plus",
                "een goedkoop beginners keyboard met veel coole settings",
                58.55,
                39,
                category1,
                brand5,
                "https://media.s-bol.com/46XG70m3KR21/EyWvL0/550x228.jpg"
        );

        Product product3 = new Product(
                "LPK25 MK2",
                "Een klein keyboard handig voor onderweg",
                54.00,
                6,
                category1,
                brand1,
                "https://static.bax-shop.nl/image/product/1021882/3865776/47d49077/1664458409akai_LPK25_mk2_01.jpg"
        );

        Product product4 = new Product(
                "Oxygen Pro Mini",
                "Een middelgroot keyboard voor de professionele producer",
                109.00,
                11,
                category1,
                brand3,
                "https://m.media-amazon.com/images/I/81rPqm+Wl6S._AC_UF894,1000_QL80_.jpg"
        );

        Product product5 = new Product(
                "MPK mini plus",
                "Een middelgroot keyboard voor de professionele producer",
                159.00,
                11,
                category1,
                brand1,
                "https://m.media-amazon.com/images/I/71wPxxzlLHL._AC_UF894,1000_QL80_.jpg"
        );

        Product product6 = new Product(
                "804 D4",
                "Een uitstekende speakers voor in huis",
                16000.00,
                11,
                category2,
                brand4,
                "https://iear.nl/wp-content/uploads/2023/07/prd125826-1024x822.jpg"
        );

        Product product7 = new Product(
                "Phantom II",
                "Een exclusieve speaker voor de echte audiofiel",
                999.00,
                11,
                category2,
                brand6,
                "https://bartelstilburg.nl/wp-content/uploads/2021/02/Phantom-Il-95db-5.png"
        );

        Product product8 = new Product(
                "Nautilus floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                100000.00,
                11,
                category2,
                brand4,
                "https://audiosolutions.net.au/wp-content/uploads/2023/10/bowers_wilkins_Nautilus-White-Beauty-1.jpg"
        );

        Product product9 = new Product(
                "Grande Utopia III EM evo floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                249998.00,
                11,
                category2,
                brand7,
                "https://www.overtureav.com/wp-content/uploads/2021/10/stella-blue.jpg"
        );

        Product product10 = new Product(
                "801 D4 signature midnight blue metallic",
                "Een exclusieve speaker voor de echte audiofiel",
                27500.00,
                11,
                category2,
                brand4,
                "https://iear.nl/wp-content/uploads/2023/07/prd125697.jpg"
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
    }
}
