package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.models.Member;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberDAO {

    private MemberRepository memberRepository;

    private UserRepository userRepository;

    public MemberDAO(MemberRepository memberRepository, UserRepository userRepository) {
        this.memberRepository = memberRepository;
        this.userRepository = userRepository;
    }

    public List<Member> getAllMembersOrders() {
        List<Member> members = this.memberRepository.findAll();
        return members;
    }

//    public List<Member> getAllMembers() {
//        List<Member> members = this.memberRepository.findAll();
//        return members;
//    }
}
