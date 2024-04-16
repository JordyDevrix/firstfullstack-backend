package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ProductDTO {

    public String name;

    @JsonAlias("description")
    public String description;

    public double price;

    public int quantity;

    @JsonAlias("category_id")
    public long categoryId;

//    @JsonAlias("cart_product")
//    public CartProduct cartProduct;

    @JsonAlias("brand_id")
    public long brandId;

    public String url;

    public ProductDTO(String name, String description, double price, int quantity, long categoryId, long brandId, String url) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.url = url;
    }
}
