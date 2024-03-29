package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.config.JWTUtil;
import one.dvrx.bolcomsite.dto.MemberDTO;
import one.dvrx.bolcomsite.dto.OrderListDTO;
import one.dvrx.bolcomsite.models.Member;
import one.dvrx.bolcomsite.models.OrderList;
import one.dvrx.bolcomsite.models.OrderedProduct;
import org.hibernate.query.Order;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderListDAO {

    private OrderListRepository orderListRepository;

    private MemberRepository memberRepository;

    private UserRepository userRepository;

    private OrderedProductRepository orderedProductRepository;

    public OrderListDAO(OrderListRepository orderListRepository, MemberRepository memberRepository, UserRepository userRepository, OrderedProductRepository orderedProductRepository) {
        this.orderListRepository = orderListRepository;
        this.memberRepository = memberRepository;
        this.userRepository = userRepository;
        this.orderedProductRepository = orderedProductRepository;
    }

    public List<OrderList> getAllOrderListsByMember(UserDetails member) {
        System.out.println(member.getUsername());
        Member member1 = userRepository.findByEmail(member.getUsername());
        System.out.println(member1.getId());
        List<OrderList> orderLists = member1.getOrders();
        System.out.println(orderLists);



        return orderLists;
    }

    public void addOrderList(UserDetails member, OrderListDTO orderListDTO) {
        Member member1 = userRepository.findByEmail(member.getUsername());

        OrderList order = new OrderList(orderListDTO.date, orderListDTO.price);
        order.setMember(member1);
        this.orderListRepository.save(order);
        for (OrderedProduct orderedProduct : orderListDTO.orderedProducts) {
            orderedProduct.setOrder(order);
            System.out.println(order.getId());
            OrderedProduct orderedProduct1 = new OrderedProduct(
                    orderedProduct.getName(),
                    orderedProduct.getBrand(),
                    orderedProduct.getPrice(),
                    order
                    );
            this.orderedProductRepository.save(orderedProduct1);
        }
    }
}
