package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderListDAO;
import one.dvrx.bolcomsite.dto.OrderListDTO;
import one.dvrx.bolcomsite.dto.OrderedProductDTO;
import one.dvrx.bolcomsite.models.Member;
import one.dvrx.bolcomsite.models.OrderList;
import one.dvrx.bolcomsite.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://s1151166.student.inf-hsleiden.nl:1151166"})
@RequestMapping("/orderlist")
public class OrderListController {

    private OrderListDAO orderListDAO;

    private UserService userService;


    public OrderListController(OrderListDAO orderListDAO, UserService userService) {
        this.orderListDAO = orderListDAO;
        this.userService = userService;
    }

    //    @GetMapping("/get")
//    public ResponseEntity<List<OrderList>> getOrderList() {
//        return ResponseEntity.ok(orderListDAO.getAllOrderLists());
//    }

    @GetMapping("/get")
    public ResponseEntity<List<OrderList>> getOrderListByMember(Principal principal) {
        String email = principal.getName();
        UserDetails member = this.userService.loadUserByUsername(email);
        return ResponseEntity.ok(orderListDAO.getAllOrderListsByMember(member));
    }


    @PostMapping
    public ResponseEntity<String> addOrderList(Principal principal, @RequestBody OrderListDTO orderListDTO) {
        String email = principal.getName();
        UserDetails member = this.userService.loadUserByUsername(email);
        this.orderListDAO.addOrderList(member, orderListDTO);
        return ResponseEntity.ok("Order added");
    }


}
