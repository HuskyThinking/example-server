package com.husky.aop;

import com.husky.annotation.AnnotationTest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Axin
 * @version 1.0
 * @description: 切面测试
 * @date 2024/3/6 17:48
 */
@Aspect
@Component
public class TestAopAnnoAspect {

    @Pointcut("@annotation(com.husky.annotation.AnnotationTest)")
    public void PointCut(){
    }

    @Before("PointCut()")
    public void Before() {
        System.out.println("请求之前");
    }

    @Around("PointCut()")
    public Object Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AnnotationTest annotationTest = method.getAnnotation(AnnotationTest.class);
        String type = annotationTest.type();
        System.out.println("type 为：" + type);
        Object result = joinPoint.proceed();
        System.out.println("环绕结束");
        return result;
    }

    @After("PointCut()")
    public void After() {
        System.out.println("在请求之后");
    }

    @AfterReturning("PointCut()")
    public void AfterReturning() {
        System.out.println("在返回之后");
    }

}
