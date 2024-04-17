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

        Brand brand8 = new Brand("KRK");
        this.brandRepository.save(brand8);

        Brand brand9 = new Brand("Pioneer");
        this.brandRepository.save(brand9);

        Brand brand10 = new Brand("Mackie");
        this.brandRepository.save(brand10);

        Brand brand11 = new Brand("Presonus");
        this.brandRepository.save(brand11);

        Brand brand12 = new Brand("Alesis");
        this.brandRepository.save(brand12);

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
                category3,
                brand4,
                "https://iear.nl/wp-content/uploads/2023/07/prd125826-1024x822.jpg"
        );

        Product product7 = new Product(
                "Phantom II",
                "Een exclusieve speaker voor de echte audiofiel",
                999.00,
                11,
                category3,
                brand6,
                "https://bartelstilburg.nl/wp-content/uploads/2021/02/Phantom-Il-95db-5.png"
        );

        Product product8 = new Product(
                "Nautilus floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                100000.00,
                11,
                category3,
                brand4,
                "https://audiosolutions.net.au/wp-content/uploads/2023/10/bowers_wilkins_Nautilus-White-Beauty-1.jpg"
        );

        Product product9 = new Product(
                "Grande Utopia III EM evo floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                249998.00,
                11,
                category3,
                brand7,
                "https://www.overtureav.com/wp-content/uploads/2021/10/stella-blue.jpg"
        );

        Product product10 = new Product(
                "801 D4 signature midnight blue metallic",
                "Een exclusieve speaker voor de echte audiofiel",
                27500.00,
                11,
                category3,
                brand4,
                "https://iear.nl/wp-content/uploads/2023/07/prd125697.jpg"
        );

        Product product11 = new Product(
                "Vestia N2",
                "Een exclusieve speaker met uitstekend geluid",
                1800.00,
                11,
                category3,
                brand7,
                "https://doublepoint.nl/media/catalog/product/cache/d64b9013a241faf05c3fcd5f3a7eae29/f/o/focal-vestia-n3-staande-luidspreker.jpeg"
        );

        Product product12 = new Product(
                "Mania",
                "Een exclusieve speaker die overal mee te nemen is",
                790.00,
                11,
                category3,
                brand6,
                "https://premiumsound.com.au/wp-content/uploads/2022/11/Mania-Grey-1.jpg"
        );

        Product product13 = new Product(
                "Rokit classic 5 (1 stuk)",
                "Een speaker met een grote bass perfect voor producers",
                139.00,
                11,
                category2,
                brand8,
                "https://www.huigens-webshop.nl/pub/media/catalog/product/cache/eeb355d55688b13b42e39d18ca714e29/k/r/krk_classic_5_g3_2.jpg"
        );

        Product product14 = new Product(
                "Rokit Rp10-3 (1 stuk)",
                "Een speaker met een grote bass perfect voor producers",
                324.00,
                11,
                category2,
                brand8,
                "https://thumbs.static-thomann.de/thumb/padthumb600x600/pics/bdb/_45/458024/14202807_800.jpg"
        );

        Product product15 = new Product(
                "DJ DM-40D (2 stuks)",
                "Een speaker met een goede balans voor het producen of DJ draaien",
                152.00,
                11,
                category2,
                brand9,
                "https://d1aeri3ty3izns.cloudfront.net/media/72/721471/600/preview.jpg"
        );

        Product product16 = new Product(
                "CR3-X BT (2 stuks)",
                "Een goedkopere speaker met een goede balans voor het producen of DJ draaien",
                111.00,
                11,
                category2,
                brand10,
                "https://thumbs.static-thomann.de/thumb/padthumb600x600/pics/bdb/_48/485467/15242878_800.jpg"
        );

        Product product17 = new Product(
                "CR4-X (2 stuks)",
                "Een goedkopere speaker met een goede balans voor het producen of DJ draaien",
                134.00,
                11,
                category2,
                brand10,
                "https://thumbs.static-thomann.de/thumb/padthumb600x600/pics/bdb/_48/485467/15242878_800.jpg"
        );

        Product product18 = new Product(
                "RP5-g2 (1 stuk)",
                "Een speaker met een uitstekende balans voor het producen of DJ draaien",
                275.00,
                11,
                category2,
                brand8,
                "https://www.profmbroadcast.com/img/uploaded/krk-rp5-g2.jpg"
        );

        Product product19 = new Product(
                "RP8-g4 (1 stuk)",
                "Een speaker met veel bass en een goede balans voor het producen",
                249.00,
                11,
                category2,
                brand8,
                "https://thumbs.static-thomann.de/thumb/padthumb600x600/pics/bdb/_45/458022/14112332_800.jpg"
        );

        Product product20 = new Product(
                "Eris 4.5BT 2nd gen",
                "Een goedkope speaker met een goede balans voor het producen of DJ draaien",
                188.00,
                11,
                category2,
                brand11,
                "https://thumbs.static-thomann.de/thumb/padthumb600x600/pics/bdb/_57/572885/18689218_800.jpg"
        );

        Product product21 = new Product(
                "Eris 3.5BT 2nd gen",
                "Een goedkope speaker met een goede balans voor het producen of DJ draaien",
                89.00,
                11,
                category2,
                brand11,
                "https://thumbs.static-thomann.de/thumb/padthumb600x600/pics/bdb/_57/572877/18550693_800.jpg"
        );

        Product product22 = new Product(
                "Elevate 5 MKII",
                "Een speaker met een goede balans voor het producen of DJ draaien",
                139.00,
                11,
                category2,
                brand12,
                "https://7132afa424c2f1a2ab6d-54d68a14e2e7c1f76563a2d8c3e9fd82.ssl.cf2.rackcdn.com/961/images/elevate5_angle_1200x750_lg-1.jpg"
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
        this.productRepository.save(product11);
        this.productRepository.save(product12);
        this.productRepository.save(product13);
        this.productRepository.save(product14);
        this.productRepository.save(product15);
        this.productRepository.save(product16);
    }
}
