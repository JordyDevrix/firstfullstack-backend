package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.MemberDAO;
import one.dvrx.bolcomsite.dao.MemberRepository;
import one.dvrx.bolcomsite.models.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://s1151166.student.inf-hsleiden.nl:1151166"})
@RequestMapping("/members")
public class MemberController {

    private MemberDAO memberDAO;

    public MemberController(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @GetMapping("/get_id/{email}")
    public ResponseEntity<Member> getMemberOrders(@PathVariable String email) {
        return ResponseEntity.ok(memberDAO.getCurrentMemberId(email));
    }
}
