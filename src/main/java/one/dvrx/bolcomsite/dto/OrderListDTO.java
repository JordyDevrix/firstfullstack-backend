package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import one.dvrx.bolcomsite.models.OrderedProduct;

import java.util.List;

public class OrderListDTO {

    public String date;

    public double price;

    @JsonAlias("member_id")
    public long memberId;

    @JsonAlias("products")
    public List<OrderedProduct> orderedProducts;

    public OrderListDTO(String date, double price, long memberId, List<OrderedProduct> orderedProducts) {
        this.date = date;
        this.price = price;
        this.memberId = memberId;
        this.orderedProducts = orderedProducts;
    }

    public OrderListDTO() {
    }
}
