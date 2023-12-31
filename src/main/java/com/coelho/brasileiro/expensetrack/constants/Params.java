package com.coelho.brasileiro.expensetrack.constants;

import java.util.HashMap;
import java.util.Map;

public class Params {
    private Params() {
        throw new IllegalStateException("Utility class");
    }
    public static final String DESCRIPTION = "description";
    public static final String NAME = "name";
    public static final String TYPE = "type";

    public static final String START_DATE = "startDate";
    public static final String END_DATE = "endDate";

    public static final String ID = "id";

    public static final String NO_PAGE = "pageNo";
    public static final String PAGE_SIZE = "pageSize";
    public static final String SORT_BY = "sortBy";
    public static final String SORT_DIR = "sortDir";

    public static Map<String, String> getDefaultParams() {
        Map<String, String> params = new HashMap<>();
        params.put(PAGE_SIZE, "10");
        params.put(NO_PAGE, "1");
        params.put(SORT_BY, "description");
        params.put(SORT_DIR, "asc");
        return params;
    }
}
