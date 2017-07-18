package com.aop.example.jcabi;

import com.jcabi.aspects.Loggable;

public class FooMethodLeveLog {

    @Loggable
    public double add(int x, int p) {
        return (x + p);
    }

    @Loggable(prepend = true)
    public double power(int x, int p) {
        return Math.pow(x, p);
    }

    @Loggable(value = Loggable.ERROR)
    public double modulus(int x, int p) {
        return (x % p);
    }

    @Loggable(value = Loggable.INFO)
    public double modulus(int x, int p, int dummy) {
        return (x % p);
    }

    @Loggable(logThis = true)
    public static void main(String[] args) {
        FooMethodLeveLog foo = new FooMethodLeveLog();
        foo.add(5, 2);
        foo.power(5, 2);
        foo.modulus(5, 2);
        foo.modulus(5, 2, 10);
    }
}