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

    private String description_nl;

    private String description_en;

    private String description_fr;

    private double price;

    private int quantity;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Category category;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Brand brand;

    public Product(String name, String description_nl, String description_en, String description_fr, double price, int quantity) {
        this.name = name;
        this.description_nl = description_nl;
        this.description_en = description_en;
        this.description_fr = description_fr;
        this.price = price;
        this.quantity = quantity;
    }

    // Foreign key constructor for Product


    public Product(String name, String description_nl, String description_en, String description_fr, double price, int quantity, Category category, Brand brand) {
        this.name = name;
        this.description_nl = description_nl;
        this.description_en = description_en;
        this.description_fr = description_fr;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }

    public Product() {
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

    public String getDescription_nl() {
        return description_nl;
    }

    public void setDescription_nl(String description_nl) {
        this.description_nl = description_nl;
    }

    public String getDescription_en() {
        return description_en;
    }

    public void setDescription_en(String description_en) {
        this.description_en = description_en;
    }

    public String getDescription_fr() {
        return description_fr;
    }

    public void setDescription_fr(String description_fr) {
        this.description_fr = description_fr;
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
