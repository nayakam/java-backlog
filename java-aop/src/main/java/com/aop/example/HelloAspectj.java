package com.aop.example;

public class HelloAspectj {
    public static void main(String[] argv) {
        System.out.println("Hello World");
        new HelloAspectj().execute("String");
    }

    private void execute(String string) {
        System.out.println("....");
    }
}