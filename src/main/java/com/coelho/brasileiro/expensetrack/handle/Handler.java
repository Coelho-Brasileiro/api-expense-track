package com.coelho.brasileiro.expensetrack.handle;

import com.coelho.brasileiro.expensetrack.context.Context;

public interface Handler extends  Cloneable {
    void setNext(Handler next);
    Handler getNextHandler();
    void handle(Context context);
    Object clone() throws CloneNotSupportedException;
}
