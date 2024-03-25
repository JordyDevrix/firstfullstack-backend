package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.dto.OrderedProductDTO;
import one.dvrx.bolcomsite.models.OrderedProduct;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.Optional;

@Component
public class OrderedProductDAO {

    private OrderedProductRepository orderedProductRepository;

    public OrderedProductDAO(OrderedProductRepository orderedProductRepository) {
        this.orderedProductRepository = orderedProductRepository;
    }

    public Optional<OrderedProduct> getAllOrderedProducts(long id) {
        Optional<OrderedProduct> optionalOrderedProducts = this.orderedProductRepository.findById(id);
        return optionalOrderedProducts;
    }

    public void addOrderedProduct(String email, OrderedProductDTO orderedProductDTO) {

    }
}
