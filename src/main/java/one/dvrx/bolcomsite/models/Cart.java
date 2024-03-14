package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long id;

    private int quantity;

    private double price;

    @OneToMany(mappedBy = "cart")
    @JsonManagedReference
    private List<CartProduct> cartProducts;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "member_id")
    @JsonBackReference
    private Member member;

    public Cart(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    // Foreign key constructor for cart
    public Cart(List<CartProduct> cartProducts, Member member) {
        this.cartProducts = cartProducts;
        this.member = member;
    }

    public Cart() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
