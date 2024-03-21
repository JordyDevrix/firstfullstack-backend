package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.models.Member;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberDAO {

    private MemberRepository memberRepository;

    public MemberDAO(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

//    public List<Member> getAllMembers() {
//        List<Member> members = this.memberRepository.findAll();
//        return members;
//    }
}
