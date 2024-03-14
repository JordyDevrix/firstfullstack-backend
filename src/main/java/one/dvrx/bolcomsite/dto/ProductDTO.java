package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ProductDTO {

    public String name;

    @JsonAlias("description_nl")
    public String descriptionNl;

    @JsonAlias("description_en")
    public String descriptionEn;

    @JsonAlias("description_fr")
    public String descriptionFr;

    public double price;

    public int quantity;

    @JsonAlias("category_id")
    public long categoryId;

//    @JsonAlias("cart_product")
//    public CartProduct cartProduct;

    @JsonAlias("brand_id")
    public long brandId;

    public ProductDTO(String name, String descriptionNl, String descriptionEn, String descriptionFr, double price, int quantity, long categoryId, long brandId) {
        this.name = name;
        this.descriptionNl = descriptionNl;
        this.descriptionEn = descriptionEn;
        this.descriptionFr = descriptionFr;
        this.price = price;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.brandId = brandId;
    }
}
