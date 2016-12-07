package com.nayakam.interview;


public class ThreadExample1 extends Thread
{
    ThreadExample1(String threadName)
    {
        super(threadName);
    }

    public void run()
    {
        method();
    }

    private void method()
    {
        System.out.print(Thread.currentThread().getName());
    }

    /**
     * Two thread objects are created but only ThreadExample1 object b is started in separate thread of execution.
     *
     * Method in the ThreadExample1 object a is invoked directly on a Thread object.
     * The run() method does not start a new thread of execution.
     *
     * Execution order can not be predicted because it is dependent on the Thread scheduler.
     *
     * OUTPUT : Bmain or mainB
     */
    public static void main(String args[])
    {
        ThreadExample1 a = new ThreadExample1("A");
        ThreadExample1 b = new ThreadExample1("B");
        b.start();
        Thread.yield();
        a.run();
    }
}
