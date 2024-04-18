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
                "https://i.imgur.com/1qqOHk4.png"
        );

        Product product2 = new Product(
                "Ez creator plus",
                "een goedkoop beginners keyboard met veel coole settings",
                58.55,
                39,
                category1,
                brand5,
                "https://i.imgur.com/UXIdFSp.png"
        );

        Product product3 = new Product(
                "LPK25 MK2",
                "Een klein keyboard handig voor onderweg",
                54.00,
                6,
                category1,
                brand1,
                "https://i.imgur.com/Wf8TllZ.png"
        );

        Product product4 = new Product(
                "Oxygen Pro Mini",
                "Een middelgroot keyboard voor de professionele producer",
                109.00,
                11,
                category1,
                brand3,
                "https://i.imgur.com/dSIaTpm.png"
        );

        Product product5 = new Product(
                "MPK mini plus",
                "Een middelgroot keyboard voor de professionele producer",
                159.00,
                11,
                category1,
                brand1,
                "https://i.imgur.com/jEQwW2G.png"
        );

        Product product6 = new Product(
                "804 D4",
                "Een uitstekende speakers voor in huis",
                16000.00,
                11,
                category3,
                brand4,
                "https://i.imgur.com/0wwNxgB.png"
        );

        Product product7 = new Product(
                "Phantom II",
                "Een exclusieve speaker voor de echte audiofiel",
                999.00,
                11,
                category3,
                brand6,
                "https://i.imgur.com/FOlMPKs.png"
        );

        Product product8 = new Product(
                "Nautilus floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                100000.00,
                11,
                category3,
                brand4,
                "https://i.imgur.com/tC66CIE.png"
        );

        Product product9 = new Product(
                "Grande Utopia III EM evo floorstanding speaker",
                "Een exclusieve speaker voor de echte audiofiel",
                249998.00,
                11,
                category3,
                brand7,
                "https://i.imgur.com/ghyWJ0s.png"
        );

        Product product10 = new Product(
                "801 D4 signature midnight blue metallic",
                "Een exclusieve speaker voor de echte audiofiel",
                27500.00,
                11,
                category3,
                brand4,
                "https://i.imgur.com/vezBZIT.png"
        );

        Product product11 = new Product(
                "Vestia N2",
                "Een exclusieve speaker met uitstekend geluid",
                1800.00,
                11,
                category3,
                brand7,
                "https://i.imgur.com/9jtNwGr.png"
        );

        Product product12 = new Product(
                "Mania",
                "Een exclusieve speaker die overal mee te nemen is",
                790.00,
                11,
                category3,
                brand6,
                "https://i.imgur.com/SdJwhQQ.png"
        );

        Product product13 = new Product(
                "Rokit classic 5 (1 stuk)",
                "Een speaker met een grote bass perfect voor producers",
                139.00,
                11,
                category2,
                brand8,
                "https://i.imgur.com/W2NTS2x.png"
        );

        Product product14 = new Product(
                "Rokit Rp10-3 (1 stuk)",
                "Een speaker met een grote bass perfect voor producers",
                324.00,
                11,
                category2,
                brand8,
                "https://i.imgur.com/iQetgXE.png"
        );

        Product product15 = new Product(
                "DJ DM-40D (2 stuks)",
                "Een speaker met een goede balans voor het producen of DJ draaien",
                152.00,
                11,
                category2,
                brand9,
                "https://i.imgur.com/x3Yapjb.png"
        );

        Product product16 = new Product(
                "CR3-X BT (2 stuks)",
                "Een goedkopere speaker met een goede balans voor het producen of DJ draaien",
                111.00,
                11,
                category2,
                brand10,
                "https://i.imgur.com/NXtwOrf.png"
        );

        Product product17 = new Product(
                "CR4-X (2 stuks)",
                "Een goedkopere speaker met een goede balans voor het producen of DJ draaien",
                134.00,
                11,
                category2,
                brand10,
                "https://i.imgur.com/NXtwOrf.png"
        );

        Product product18 = new Product(
                "RP5-g2 (1 stuk)",
                "Een speaker met een uitstekende balans voor het producen of DJ draaien",
                275.00,
                11,
                category2,
                brand8,
                "https://i.imgur.com/Biuc4KP.png"
        );

        Product product19 = new Product(
                "RP8-g4 (1 stuk)",
                "Een speaker met veel bass en een goede balans voor het producen",
                249.00,
                11,
                category2,
                brand8,
                "https://i.imgur.com/5Sgr2qV.png"
        );

        Product product20 = new Product(
                "Eris 4.5BT 2nd gen",
                "Een goedkope speaker met een goede balans voor het producen of DJ draaien",
                188.00,
                11,
                category2,
                brand11,
                "https://i.imgur.com/rrOyVoR.png"
        );

        Product product21 = new Product(
                "Eris 3.5BT 2nd gen",
                "Een goedkope speaker met een goede balans voor het producen of DJ draaien",
                89.00,
                11,
                category2,
                brand11,
                "https://i.imgur.com/i0vo0wp.png"
        );

        Product product22 = new Product(
                "Elevate 5 MKII",
                "Een speaker met een goede balans voor het producen of DJ draaien",
                139.00,
                11,
                category2,
                brand12,
                "https://i.imgur.com/Mfqder4.png"
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
        this.productRepository.save(product17);
        this.productRepository.save(product18);
        this.productRepository.save(product19);
        this.productRepository.save(product20);
        this.productRepository.save(product21);
        this.productRepository.save(product22);
    }
}
