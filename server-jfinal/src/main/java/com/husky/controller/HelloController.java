package com.husky.controller;

import com.husky.model.Student;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.GET;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.json.FastJson;


public class HelloController extends Controller {

    //响应用户的内容
    @Before({GET.class})
    public void index() {
        renderText("hello world!");
    }

    @Before({POST.class})
    public void testParam() {
        // 测试 get()、getPara(),获取请求路径中的参数
        System.out.println(get("sId"));
        System.out.println(getPara("sName"));
        System.out.println(getPara("sex"));

        // 获取请求体中的参数
        String json = getRawData();
        Student student = FastJson.getJson().parse(json, Student.class);
        renderText(student.toString());
    }

}
