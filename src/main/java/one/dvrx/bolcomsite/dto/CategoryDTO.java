package one.dvrx.bolcomsite.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import one.dvrx.bolcomsite.models.Product;

import java.util.List;

public class CategoryDTO {

    @JsonAlias("name")
    public String name;

    public CategoryDTO(String name) {
        this.name = name;
    }

    public CategoryDTO() {
    }
}
