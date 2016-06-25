package com.nayakam.practice;

public class ConstructorExample1 extends B
{

    ConstructorExample1()
    {
        super(4);
        System.out.println(ConstructorExample1.class.getSimpleName() + " - super :" + 4);


    }

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName() + " - " + new ConstructorExample1().i);
    }
}

class A
{
    int i;

    A()
    {
        System.out.println(A.class.getSimpleName() + " - int :" + i);
    }
}

class B extends A
{
    int i;

    B(short i)
    {
        this.i = i;
        System.out.println(B.class.getSimpleName() + " - short :" + i + " ");
    }

    B(float j)
    {
        i = (int) j;
        System.out.println(B.class.getSimpleName() + " - float :" + j + " ");
    }
}