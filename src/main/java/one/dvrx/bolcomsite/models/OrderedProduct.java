package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class OrderedProduct {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String brand;

    private double price;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private OrderList orderList;

    public OrderedProduct(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public OrderedProduct(String name, String brand, double price, OrderList orderList) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.orderList = orderList;
    }

    // Foreign key constructor for OrderedProduct
    public OrderedProduct(OrderList orderList) {
        this.orderList = orderList;
    }

    public OrderedProduct() {
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
