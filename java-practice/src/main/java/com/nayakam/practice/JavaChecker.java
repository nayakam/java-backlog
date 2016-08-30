package com.nayakam.practice;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaChecker {
    private static int count;

    public JavaChecker(String test) {

    }

    static {
        System.out.println("stat1");
        count = 10;
    }

    {
        System.out.println("stat2");
        // count = 10;
    }

    public static void main(String[] args) {
        System.out.println(count);
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        System.out.println(Calendar.getInstance().get(Calendar.MONTH));
        t();
        Integer i = new Integer(25);
        Integer y = ++i == 26 ? 5 : new Integer(10);
        System.out.println("y-i :" + (y - i));
        i += 1;
        System.out.println("i" + i);
        System.out.println(y);
        byte c = 2;
        double d = -27.2345;

        System.out.println(Math.floor(d));
        System.out.println(Math.round(123456789123456789.12f));
        try {
            Formatter f = new Formatter("C");
            System.out.println("LINE " + f.format("%f", null));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void t() {
        Set<String> s = new LinkedHashSet<String>();
        s.add("3");
        s.add("2");
        s.add("3");
        s.add("1");

        for (Iterator<String> it = s.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

}
