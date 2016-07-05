package com.nayakam.practice;

public class ConstructorExample1 extends B
{

    ConstructorExample1()
    {
        super(4);
        System.out.println(ConstructorExample1.class.getSimpleName() + " - super :" + 4);


    }

    int getId(){
        return  i;
    }

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName() + " - " + new ConstructorExample1().i);
        B t =  new ConstructorExample1();
        t.i = 5;
       // System.out.println(t.getId());

    }
}

class A
{
    int i;

    A()
    {
        System.out.println(A.class.getSimpleName() + " - int :" + i);
    }
    private int getId(){
        return  i;
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