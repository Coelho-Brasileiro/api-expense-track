package com.coelho.brasileiro.expensetrack.util;

public class Constants {

    public interface User{
        String USER = "USER";
        String USER_INPUT = USER+"_INPUT";
        String USER_DTO = USER+"_DTO";
        String USER_REQUEST = USER+"_REQUEST";

    }

    public interface Token{
        String TOKEN = "TOKEN";
        String TOKEN_DTO = TOKEN+"_DTO";

    }

    public interface Category{
        String CATEGORY = "CATEGORY";
        String CATEGORY_INPUT = CATEGORY+"_INPUT";
        String CATEGORY_DTO = CATEGORY+"_DTO";
        String CATEGORY_REQUEST = CATEGORY+"_REQUEST";
    }

    public interface Budget
    {
        String BUDGET = "BUDGET";
        String BUDGET_INPUT = BUDGET+"_INPUT";
        String BUDGET_DTO = BUDGET+"_DTO";
        String BUDGET_REQUEST = BUDGET+"_REQUEST";
    }

    public interface RecurringBudget {
        String RECURRING_BUDGET = "RECURRING_BUDGET";
        String RECURRING_BUDGET_INPUT = RECURRING_BUDGET + "_INPUT";
        String RECURRING_BUDGET_DTO = RECURRING_BUDGET + "_DTO";
        String RECURRING_BUDGET_REQUEST = RECURRING_BUDGET + "_REQUEST";
    }
}
