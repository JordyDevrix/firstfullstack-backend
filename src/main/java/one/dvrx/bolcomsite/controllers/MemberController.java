package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.MemberDAO;
import one.dvrx.bolcomsite.models.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private MemberDAO memberDAO;

    public MemberController(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

//    @GetMapping("/get")
//    public ResponseEntity<List<Member>> getMember() {
//        return ResponseEntity.ok(memberDAO.getAllMembers());
//    }
}
