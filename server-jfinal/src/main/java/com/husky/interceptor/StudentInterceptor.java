package com.husky.interceptor;

import com.husky.controller.StudentController;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class StudentInterceptor implements Interceptor {
    @Override
    public void intercept(Invocation invocation) {

        if (invocation.getController() instanceof StudentController) {
            System.out.println("执行方法之前");
            invocation.invoke();
            System.out.println("执行方法之后");
        } else {
            invocation.invoke();
        }
    }
}
