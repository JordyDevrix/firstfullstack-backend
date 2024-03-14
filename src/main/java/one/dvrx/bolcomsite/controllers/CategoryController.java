package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.CategoryDAO;
import one.dvrx.bolcomsite.dto.CategoryDTO;
import one.dvrx.bolcomsite.models.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryDAO categoryDAO;

    public CategoryController(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Category>> getCategory() {
        return ResponseEntity.ok(categoryDAO.getAllCategories());
    }

    @PostMapping
    public ResponseEntity<String> createCategory(@RequestBody CategoryDTO categoryDTO) {
        this.categoryDAO.createCategory(categoryDTO);
        return ResponseEntity.ok("Category added");
    }
}
