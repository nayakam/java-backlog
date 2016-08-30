package com.nayakam.practice;

import java.util.Random;

public class Outter {
    private int num = 2399;
    static int numStatic = 5000;

    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Inner inner = outter.new Inner();
        inner.innerMethod();
        System.out.println("inner.num:" + inner.num);
        System.out.println("outter.num:" + outter.num);
        Random r = new Random();
        System.out.println(r.nextInt(7));
        System.out.println(5 / 0);
    }

    class Inner {
        private int num = 9922;

        void innerMethod() {
            System.out.println("num:" + num);
            System.out.println("this.num" + this.num);
            System.out.println("Outter.this.num" + Outter.this.num);
            System.out.println("Inner.this.num:" + Inner.this.num);
            System.out.println("Outter.numStatic:" + Outter.numStatic);
        }
    }
}
