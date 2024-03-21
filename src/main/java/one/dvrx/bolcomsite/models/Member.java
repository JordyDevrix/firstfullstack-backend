package one.dvrx.bolcomsite.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "member")
public class Member {

    @Id
    @GeneratedValue
    private long id;

    private String email;

    private String password;

    private String name;

    private String streetAddress;

    private String zipCode;

    private boolean customUserRole;

    @OneToMany(mappedBy = "member")
    @JsonManagedReference
    private List<OrderList> orders;

    public Member(String email, String password, String name, String streetAddress, String zipCode) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    // Foreign key constructor for member
    public Member() {
    }

    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public List<OrderList> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderList> orders) {
        this.orders = orders;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean getCustomUserRole() {
        return customUserRole;
    }

    public void setCustomUserRole(boolean administrator) {
        this.customUserRole = administrator;
    }
}
