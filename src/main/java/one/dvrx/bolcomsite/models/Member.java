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

    private String firstName;

    private String lastName;

    private String streetAddress;

    private String zipCode;

    private String customUserRole;

    @OneToMany(mappedBy = "member")
    @JsonManagedReference
    private List<OrderList> orders;

    public Member(String email, String password, String firstName, String lastName, String streetAddress, String zipCode, String administrator) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.customUserRole = administrator;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getCustomUserRole() {
        return customUserRole;
    }

    public void setCustomUserRole(String administrator) {
        this.customUserRole = administrator;
    }
}
