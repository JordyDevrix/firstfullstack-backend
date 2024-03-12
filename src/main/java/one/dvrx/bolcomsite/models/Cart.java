package one.dvrx.bolcomsite.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long id;

    public Cart(long id) {
        this.id = id;
    }

    public Cart() {
    }
}
