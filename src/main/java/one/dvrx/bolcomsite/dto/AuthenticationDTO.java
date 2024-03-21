package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AuthenticationDTO {

    public long id;
    public String email;
    public String password;

    public String name;

    @JsonAlias("zip_code")
    public String streetAddress;

    @JsonAlias("street_address")
    public String zipCode;

    public boolean administrator;

    public AuthenticationDTO(long id, String email, String password, String name, String streetAddress, String zipCode, boolean administrator) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.administrator = administrator;
    }
}
