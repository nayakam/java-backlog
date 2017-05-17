package com.aop.example.jcabi;

import com.jcabi.aspects.Loggable;

/**
 * http://www.yegor256.com/2014/06/01/aop-aspectj-java-method-logging.html
 */
@Loggable(prepend = true)
public class FooClassLeveLog {


    //@Loggable
    public double add(int x, int p) {
        return (x + p);
    }

    // @Loggable(prepend = true)
    public double power(int x, int p) {
        return Math.pow(x, p);
    }

    // @Loggable(prepend = true)
    public double modulus(int x, int p) {
        return (x % p);
    }

    //@Loggable(prepend = true)
    public static void main(String[] args) {
        FooClassLeveLog foo = new FooClassLeveLog();
        foo.add(5, 2);
        foo.power(5, 2);
        foo.modulus(5, 2);
    }
}