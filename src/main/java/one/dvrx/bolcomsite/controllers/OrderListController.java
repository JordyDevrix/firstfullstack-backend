package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderListDAO;
import one.dvrx.bolcomsite.models.OrderList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderlist")
public class OrderListController {

    private OrderListDAO orderListDAO;

    public OrderListController(OrderListDAO orderListDAO) {
        this.orderListDAO = orderListDAO;
    }

    @GetMapping("/get")
    public ResponseEntity<List<OrderList>> getOrderList() {
        return ResponseEntity.ok(orderListDAO.getAllOrderLists());
    }

//    @GetMapping("/get/{id}")
//    public ResponseEntity<List<OrderList>> getOrderListByMember(@PathVariable long id) {
//        return ResponseEntity.ok(orderListDAO.getAllOrderListsByMember(id));
//    }


}
