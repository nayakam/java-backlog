package com.nayakam.practice;

public final strictfp class StrictFPClass
{
    double num1 = 10e+102;
    double num2 = 6e+08;

    double calculate()
    {
        return num1 + num2;
    }
}

class StrictFPMethod
{
    strictfp double computeTotal(double x, double y)
    {
        return x + y;
    }
}

strictfp interface StrictFPInterface
{
    double calculate();
    //strictfp double compute();    // compile error
}