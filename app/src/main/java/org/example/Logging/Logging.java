package org.example.Logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//public class Logging {
//    @Before("execution(public void org.example.Service.UserService.logIn())")
//    public void loggingAdvice(){
//        System.out.println("before advice for login is executed LoggingAdvice");
//    }
//    @After("execution(public void org.example.Service.UserService.logIn())")
//    public void loggingAdvice2(){
//         System.out.println("RUNNNING AFTE LOGGING IN DEVICE ");
//
//    }
//}


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging
{



    @Around("execution(public void org.example.Service.UserService.logIn())")
    public void loggingAdvice3() {
        System.out.println("Before and After invoking method logIn");
    }

    @AfterThrowing("execution(public void org.example.Service.UserService.logOut())")
    public void loggingAdvice4() {
        System.out.println("Exception thrown in logOut method");
    }

    @AfterReturning("execution(public void org.example.Service.UserService.logOut())")
    public void loggingAdvice5() {
        System.out.println("AfterReturning advice for logOut is run");
    }

    @Pointcut("execution(public * org.example.Service.UserService.*(..))")
    public void pointCut() {
    }
    @Pointcut("execution(public * org.example.Service.UserService.*(..))")
    public void pointCut1() {
    }

    @Before("pointCut() || pointCut1()")
    public void loggingAdvice6() {
        System.out.println("Before advice using pointcut is executed");
    }

}
