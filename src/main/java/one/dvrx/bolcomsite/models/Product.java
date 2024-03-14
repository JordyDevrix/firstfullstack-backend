package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String description;

    private double price;

    private int quantity;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Category category;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private CartProduct cartProduct;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Brand brand;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Foreign key constructor for Product
    public Product(String name, String description, double price, int quantity, Category category, Brand brand) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }

    public Product() {
    }

    public CartProduct getCartProduct() {
        return cartProduct;
    }

    public void setCartProduct(CartProduct cartProduct) {
        this.cartProduct = cartProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
