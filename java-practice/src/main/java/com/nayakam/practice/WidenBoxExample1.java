package com.nayakam.practice;

/**
 * can't widen and then box, but you can box and then widen
 * widening has higher priority than boxing
 *
 * <br>
 * Widening is replacing one primitive type with another primitive type for assignment-compatibility.
 * Boxing is the automatic conversion of a primitive type to a corresponding reference type
 * <br>
 * <br><i> byte --> int</i> (widening)
 * <br>
 * <b>You CANNOT widen then box (int cannot be Long). IS-A test fails when boxing
 * <br>
 * You CAN box then widen (int can become Object via Integer)
 * </b>
 * Compile will choose widen the argument over boxing and varargs
 */
class WidenBoxExample1
{

//    static void go(Object o) {
//        System.out.println("byte : " + o);
//    }

    static void go(Integer x)
    {
        System.out.println("Integer : " + x);
        double d = x;
        Double D = x.doubleValue();
    }

    static void go(Long x)
    {
        System.out.println("long " + x);
    }

    static void go(long... x)
    {
        System.out.println("long... " + x.length);
    }

    public static void main(String[] a)
    {
        byte b = 5;
        go(b);
        int i = 6;
        go(i);
    }

}