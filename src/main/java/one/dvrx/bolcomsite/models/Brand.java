package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue
    private long id;

    private String brand;

    @OneToMany(mappedBy = "brand")
    @JsonManagedReference
    private List<Product> products;

    public Brand(String brand) {
        this.brand = brand;
    }

    // Foreign key constructor for brand
    public Brand(String brand, List<Product> products) {
        this.brand = brand;
        this.products = products;
    }

    public Brand() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
