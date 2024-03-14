package one.dvrx.bolcomsite.controllers;

import one.dvrx.bolcomsite.dao.CategoryDAO;
import one.dvrx.bolcomsite.models.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryDAO categoryDAO;

    public CategoryController(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategory() {
        return ResponseEntity.ok(categoryDAO.getAllCategories());
    }
}
