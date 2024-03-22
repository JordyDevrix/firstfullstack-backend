package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);

}
