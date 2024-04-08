package com.husky.controller;

import com.husky.common.DataUtils;
import com.husky.common.Resp;
import com.husky.common.contrant.HuskyConstant;
import com.husky.model.Score;
import com.husky.model.Student;
import com.husky.service.StudentService;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.GET;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.json.FastJson;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;


public class StudentController extends Controller {

    @Before(GET.class)
    public void selectById() {
        String sId = get("id");
        if (!DataUtils.isEmpty(sId)) {
//            List<Record> list = Db.find("select * from student where s_id = ?",sId);
            List<Student> list = StudentService.me.findStudentById(sId);
            renderJson(new Resp(HuskyConstant.STATUS_SUCCESS, HuskyConstant.SUCCESS,
                    HuskyConstant.SUCCESS_MSG, list != null && list.size() == 1 ? list.get(0) : null));
        } else {
            renderJson(new Resp(HuskyConstant.STATUS_FAIL, HuskyConstant.ERROR_REQ_NULL,
                    HuskyConstant.ERROR_REQ_NULL_MSG, null));
        }
    }

    @Before(POST.class)
    public void add() {
        String json = getRawData();
        Student student = FastJson.getJson().parse(json, Student.class);
        try {
            StudentService.me.saveStudent(student);
        } catch (Exception e) {
            renderJson(new Resp(HuskyConstant.STATUS_FAIL, HuskyConstant.ERROR_DB,
                    HuskyConstant.ERROR_DB_MSG, null));
            return;
        }
        renderJson(new Resp(HuskyConstant.STATUS_SUCCESS, HuskyConstant.SUCCESS,
                HuskyConstant.SUCCESS_MSG, null));

    }

    @Before(GET.class)
    public void deleteById() {
        String sId = get("id");
        // 不同方式调用数据库
        Db.deleteById("student", "s_id", sId);
        renderJson(new Resp(HuskyConstant.STATUS_SUCCESS, HuskyConstant.SUCCESS,
                HuskyConstant.SUCCESS_MSG, null));
    }

    @Before(POST.class)
    public void updateById() {
        String json = getRawData();
        Student student = FastJson.getJson().parse(json, Student.class);
        StudentService.me.updateStudent(student);
        renderJson(new Resp(HuskyConstant.STATUS_SUCCESS, HuskyConstant.SUCCESS,
                HuskyConstant.SUCCESS_MSG, null));
    }

}
