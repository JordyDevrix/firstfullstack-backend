package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import one.dvrx.bolcomsite.models.Brand;
import one.dvrx.bolcomsite.models.CartProduct;
import one.dvrx.bolcomsite.models.Category;

public class ProductDTO {

    public String name;

    public String description;

    public double price;

    public int quantity;

    public Category category;


    public Brand brand;

    public ProductDTO(String name, String description, double price, int quantity, Category category, Brand brand) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }
}
