package one.dvrx.bolcomsite.dto;

public class MemberDTO {

    public long id;

    public String email;

    public String password;

    public String name;
    public String streetAddress;
    public String zipCode;

    public MemberDTO(long id, String email, String password, String name, String streetAddress, String zipCode) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public MemberDTO() {
    }
}
