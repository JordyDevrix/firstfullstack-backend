package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderedProductDAO;
import one.dvrx.bolcomsite.dto.OrderedProductDTO;
import one.dvrx.bolcomsite.models.Member;
import one.dvrx.bolcomsite.models.OrderedProduct;
import one.dvrx.bolcomsite.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://s1151166.student.inf-hsleiden.nl:1151166"})
@RequestMapping("/orderedproduct")
public class OrderedProductController {

    private OrderedProductDAO orderedProductDAO;

    private UserService userService;


    public OrderedProductController(OrderedProductDAO orderedProductDAO, UserService userService) {
        this.orderedProductDAO = orderedProductDAO;
        this.userService = userService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<OrderedProduct>> getOrderedProduct(@PathVariable long id) {
        return ResponseEntity.ok(orderedProductDAO.getAllOrderedProducts(id));
    }

}
