package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderListDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderlist")
public class OrderListController {

    private OrderListDAO orderListDAO;

    public OrderListController(OrderListDAO orderListDAO) {
        this.orderListDAO = orderListDAO;
    }



}
