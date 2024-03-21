package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.OrderedProductDAO;
import one.dvrx.bolcomsite.models.OrderedProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
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
