package com.coelho.brasileiro.expensetrack.handle.actions.category.behavior;


import com.coelho.brasileiro.expensetrack.model.Category;
import com.coelho.brasileiro.expensetrack.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CategorySearchByNameBehavior implements  CategorySearchBehavior{

    @Override
    public Page<Category> searchPageUnit(CategoryRepository categoryRepository, Map<String, String> params) {
        return categoryRepository.findByNameContainingIgnoreCaseAndIsDeletedFalse(getPageable(params), params.get("name"));
    }
}
