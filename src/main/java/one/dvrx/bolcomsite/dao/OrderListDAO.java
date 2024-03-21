package one.dvrx.bolcomsite.dao;

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

    public OrderListDAO(OrderListRepository orderListRepository, MemberRepository memberRepository) {
        this.orderListRepository = orderListRepository;
        this.memberRepository = memberRepository;
    }


    public List<OrderList> getAllOrderLists() {
        List<OrderList> orderLists = this.orderListRepository.findAll();
        System.out.println("hier ook");
        return orderLists;
    }

//    public List<OrderList> getAllOrderListsByMember(long id) {
//        List<OrderList> orderLists = this.orderListRepository.findAll();
//        Optional<Member> member = this.memberRepository.findById(id);
//        System.out.println("hier");
//        return orderLists;
//    }
}
