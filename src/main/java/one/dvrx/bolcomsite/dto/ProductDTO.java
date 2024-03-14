package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import one.dvrx.bolcomsite.models.Brand;
import one.dvrx.bolcomsite.models.CartProduct;
import one.dvrx.bolcomsite.models.Category;

public class ProductDTO {

    public String name;

    @JsonAlias("description_nl")
    public String descriptionNl;

    public String descriptionEn;

    public String descriptionFr;

    public double price;

    public int quantity;

    public Category category;

    public CartProduct cartProduct;
    public Brand brand;

    public ProductDTO(String name, String descriptionNl, String descriptionEn, String descriptionFr, double price, int quantity, Category category, CartProduct cartProduct, Brand brand) {
        this.name = name;
        this.descriptionNl = descriptionNl;
        this.descriptionEn = descriptionEn;
        this.descriptionFr = descriptionFr;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.cartProduct = cartProduct;
        this.brand = brand;
    }
}
