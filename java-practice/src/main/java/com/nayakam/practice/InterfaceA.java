package com.nayakam.practice;

interface InterfaceA {
    static final String test = "t";
      void testMethod();
  }
  interface InterfaceB {
      void testMethod();
  }
  interface TestInter extends InterfaceA, InterfaceB {
      // methods of TestInter.  
  }
abstract class  TestClass implements TestInter {

  }