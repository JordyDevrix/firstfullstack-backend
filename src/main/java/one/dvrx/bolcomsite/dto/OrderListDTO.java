package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class OrderListDTO {

    public String date;

    public double price;

    @JsonAlias("member_id")
    public long memberId;

    public OrderListDTO(String date, double price, long memberId) {
        this.date = date;
        this.price = price;
        this.memberId = memberId;
    }

    public OrderListDTO() {
    }
}
