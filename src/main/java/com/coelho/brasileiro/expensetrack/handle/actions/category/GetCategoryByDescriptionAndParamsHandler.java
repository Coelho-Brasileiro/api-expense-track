package com.coelho.brasileiro.expensetrack.handle.actions.category;

import com.coelho.brasileiro.expensetrack.context.Context;
import com.coelho.brasileiro.expensetrack.dto.ResponsePage;
import com.coelho.brasileiro.expensetrack.handle.AbstractHandler;
import com.coelho.brasileiro.expensetrack.handle.actions.category.behavior.CategorySearchBehavior;
import com.coelho.brasileiro.expensetrack.handle.actions.category.behavior.CategorySearchByDescriptionBehavior;
import com.coelho.brasileiro.expensetrack.handle.actions.category.behavior.CategorySearchByNameBehavior;
import com.coelho.brasileiro.expensetrack.mapper.Converter;
import com.coelho.brasileiro.expensetrack.model.Category;
import com.coelho.brasileiro.expensetrack.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class GetCategoryByDescriptionAndParamsHandler extends AbstractHandler {
    private final CategoryRepository categoryRepository;

    public GetCategoryByDescriptionAndParamsHandler(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    protected void doHandle(Context context) {
        if(context.getParams().get("description") == null){
            return;
        }
        CategorySearchBehavior categorySearchBehavior  = new CategorySearchByDescriptionBehavior();
        Page<Category> categoryPage = categorySearchBehavior.searchPageUnit(categoryRepository, context.getParams());
        context.setPage(categoryPage);
    }
}
