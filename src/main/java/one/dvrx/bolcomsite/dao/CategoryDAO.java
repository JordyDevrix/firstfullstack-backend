package one.dvrx.bolcomsite.dao;

import one.dvrx.bolcomsite.dto.CategoryDTO;
import one.dvrx.bolcomsite.models.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDAO {

    private CategoryRepository categoryRepository;

    public CategoryDAO(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        List<Category> categories = this.categoryRepository.findAll();
        return categories;
    }

    public void createCategory(CategoryDTO categoryDTO) {
        Category category = new Category(
                categoryDTO.name
        );
        this.categoryRepository.save(category);

    }
}
