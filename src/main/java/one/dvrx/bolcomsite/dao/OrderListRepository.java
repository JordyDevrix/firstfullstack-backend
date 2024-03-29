package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.models.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderListRepository extends JpaRepository<OrderList, Long> {
    List<OrderList> findAllByMemberId(long id);
}
