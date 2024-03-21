package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.config.JWTUtil;
import one.dvrx.bolcomsite.dao.MemberDAO;
import one.dvrx.bolcomsite.dao.UserRepository;
import one.dvrx.bolcomsite.dto.AuthenticationDTO;
import one.dvrx.bolcomsite.dto.LoginResponse;
import one.dvrx.bolcomsite.dto.MemberDTO;
import one.dvrx.bolcomsite.models.Member;
import one.dvrx.bolcomsite.services.CredentialValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userDAO;
    private final JWTUtil jwtUtil;
    private final AuthenticationManager authManager;
    private final PasswordEncoder passwordEncoder;
    private CredentialValidator validator;

    private MemberDAO memberDAO;

    public AuthController(UserRepository userDAO, JWTUtil jwtUtil, AuthenticationManager authManager,
                          PasswordEncoder passwordEncoder, CredentialValidator validator, MemberDAO memberDAO) {
        this.userDAO = userDAO;
        this.jwtUtil = jwtUtil;
        this.authManager = authManager;
        this.passwordEncoder = passwordEncoder;
        this.validator = validator;
        this.memberDAO = memberDAO;
    }

    @PostMapping("/register")
    public ResponseEntity<LoginResponse> register(@RequestBody AuthenticationDTO authenticationDTO) {
        if (!validator.isValidEmail(authenticationDTO.email)) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "No valid email provided"
            );
        }

        if (!validator.isValidPassword(authenticationDTO.password)) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "No valid password provided"
            );
        }

        Member member = userDAO.findByEmail(authenticationDTO.email);

        if (member != null){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Can not register with this email"
            );
        }
        String encodedPassword = passwordEncoder.encode(authenticationDTO.password);

        Member registerdCustomUser = new Member(
                authenticationDTO.email,
                encodedPassword,
                authenticationDTO.name,
                authenticationDTO.streetAddress,
                authenticationDTO.zipCode
        );
        userDAO.save(registerdCustomUser);
        String token = jwtUtil.generateToken(registerdCustomUser.getEmail());
        LoginResponse loginResponse = new LoginResponse(registerdCustomUser.getEmail(), token);
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody AuthenticationDTO body) {
        try {
            UsernamePasswordAuthenticationToken authInputToken =
                    new UsernamePasswordAuthenticationToken(body.email, body.password);

            authManager.authenticate(authInputToken);

            String token = jwtUtil.generateToken(body.email);

            Member customUser = userDAO.findByEmail(body.email);
            LoginResponse loginResponse = new LoginResponse(customUser.getEmail(), token);


            return ResponseEntity.ok(loginResponse);

        } catch (AuthenticationException authExc) {
            throw new ResponseStatusException(
                    HttpStatus.FORBIDDEN, "No valid credentials"
            );
        }
    }

}
