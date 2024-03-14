package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class CategoryDTO {

    @JsonAlias("name")
    public String name;

}
