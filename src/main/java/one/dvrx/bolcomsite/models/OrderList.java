package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderList {

    @Id
    @GeneratedValue
    private long id;

    private String date;

    private double price;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Member member;

    @OneToMany(mappedBy = "orderList")
    @JsonManagedReference
    private List<OrderedProduct> orderedProduct;

    public OrderList(String date, double price) {
        this.date = date;
        this.price = price;
    }

    // Foreign key constructor for orderList
    public OrderList(Member member, List<OrderedProduct> orderedProduct) {
        this.member = member;
        this.orderedProduct = orderedProduct;
    }

    public OrderList(String date, double price, Member member) {
        this.date = date;
        this.price = price;
        this.member = member;
    }

    public OrderList() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<OrderedProduct> getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(List<OrderedProduct> orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
}
