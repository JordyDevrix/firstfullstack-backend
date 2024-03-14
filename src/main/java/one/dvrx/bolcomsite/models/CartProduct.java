package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class CartProduct {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Cart cart;

    @OneToMany(mappedBy = "cartProduct")
    @JsonBackReference
    private List<Product> product;

    public CartProduct(Cart cart) {
        this.cart = cart;
    }

    // Foreign key constructor for CartProduct


    public CartProduct(Cart cart, List<Product> product) {
        this.cart = cart;
        this.product = product;
    }

    public CartProduct() {
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
