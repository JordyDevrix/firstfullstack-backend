package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderListDAO;
import one.dvrx.bolcomsite.models.OrderList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://s1151166.student.inf-hsleiden.nl:1151166"})
@RequestMapping("/orderlist")
public class OrderListController {

    private OrderListDAO orderListDAO;

    public OrderListController(OrderListDAO orderListDAO) {
        this.orderListDAO = orderListDAO;
    }

//    @GetMapping("/get")
//    public ResponseEntity<List<OrderList>> getOrderList() {
//        return ResponseEntity.ok(orderListDAO.getAllOrderLists());
//    }

    @GetMapping("/get")
    public ResponseEntity<List<OrderList>> getOrderListByMember() {
        return ResponseEntity.ok(orderListDAO.getAllOrderListsByMember());
    }


}
