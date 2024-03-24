package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderedProductDAO;
import one.dvrx.bolcomsite.models.OrderedProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://s1151166.student.inf-hsleiden.nl:1151166"})
@RequestMapping("/orderedproduct")
public class OrderedProductController {

    private OrderedProductDAO orderedProductDAO;

    public OrderedProductController(OrderedProductDAO orderedProductDAO) {
        this.orderedProductDAO = orderedProductDAO;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<OrderedProduct>> getOrderedProduct(@PathVariable long id) {
        return ResponseEntity.ok(orderedProductDAO.getAllOrderedProducts(id));
    }

}
