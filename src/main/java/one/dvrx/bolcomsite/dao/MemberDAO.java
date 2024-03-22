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

    public Member getCurrentMemberId(String email) {
        Member members = this.userRepository.findByEmail(email);
        return members;
    }

}
