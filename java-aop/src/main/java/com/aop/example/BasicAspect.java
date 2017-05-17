package com.aop.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Refer : https://github.com/leika/AspectJSimpleTest/tree/master/src/net/andrewewhite/aspects
 */
@Aspect
public class BasicAspect {

    /* Read as -- do this *before* any *call* to the function
         * *java.io.PrintStream.println* that takes a *String*
         * and returns *void* and the function is not called
     * within any class under the package net.andrewewhite.aspects
     */
    @Before("execution(* *.execute(..))")
    public void beforePrintlnCall() {
        System.out.println("beforePrintlnCall - About to make call to print Hello World");
    }

    @After("    call(void java.io.PrintStream.println(String)) " +
            "&&  !within(com.aop.example..*)")
    public void afterPrintlnCall(JoinPoint.StaticPart thisJoinPointStaticPart) {
        System.out.println("Just made call to print Hello World : " + thisJoinPointStaticPart.getSignature());
        //System.out.println("afterPrintlnCall - Just made call to print Hello World : ");
    }
}