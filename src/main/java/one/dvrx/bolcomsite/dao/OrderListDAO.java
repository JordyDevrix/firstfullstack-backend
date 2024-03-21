package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.config.JWTUtil;
import one.dvrx.bolcomsite.dto.MemberDTO;
import one.dvrx.bolcomsite.models.Member;
import one.dvrx.bolcomsite.models.OrderList;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderListDAO {

    private OrderListRepository orderListRepository;

    private MemberRepository memberRepository;

    private UserRepository userRepository;

    private JWTUtil jwtUtil;

    public OrderListDAO(OrderListRepository orderListRepository, MemberRepository memberRepository, UserRepository userRepository, JWTUtil jwtUtil) {
        this.orderListRepository = orderListRepository;
        this.memberRepository = memberRepository;
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public List<OrderList> getAllOrderLists() {
        List<OrderList> orderLists = this.orderListRepository.findAll();
        System.out.println("hier ook");
        return orderLists;
    }

    public List<OrderList> getAllOrderListsByMember() {
        List<OrderList> orderLists = this.orderListRepository.findAll();
        Member member = this.userRepository.findByEmail("email");
        System.out.println(member.getName());
        return orderLists;
    }
}
