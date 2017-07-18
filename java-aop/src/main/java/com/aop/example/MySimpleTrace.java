package com.aop.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by tsaba on 17/05/2017.
 */
@Aspect
public class MySimpleTrace {

    @Pointcut("within(net.andrewewhite.examples.*) ")
    void myClass() {
    }

    @Pointcut("myClass() && execution(new(..))")
    void myConstructor() {
    }

    @Pointcut("myClass() && execution(* *(..))")
    void myMethod() {
    }


    @Before("myConstructor()")
    public void traceBefore(JoinPoint.StaticPart thisJoinPointStaticPart) {
        Trace.traceEntry("C:" + thisJoinPointStaticPart.getSignature());

    }

    @After("myConstructor()")
    public void traceAfter(JoinPoint.StaticPart thisJoinPointStaticPart) {
        Trace.traceExit("C:" + thisJoinPointStaticPart.getSignature());
    }

    @Before("myMethod()")
    public void traceBeforeM(JoinPoint.StaticPart thisJoinPointStaticPart) {
        Trace.traceEntry("E:" + thisJoinPointStaticPart.getSignature());
    }

    @After("myMethod()")
    public void traceAfterM(JoinPoint.StaticPart thisJoinPointStaticPart) {
        Trace.traceExit("E:" + thisJoinPointStaticPart.getSignature());
        System.out.println("Constructed");
    }

}