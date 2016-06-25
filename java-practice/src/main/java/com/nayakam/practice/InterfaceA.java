package com.nayakam.practice;

interface InterfaceA {
      void testMethod();
  }
  interface InterfaceB {
      void testMethod();
  }
  interface TestInter extends InterfaceA, InterfaceB {
      // methods of TestInter.  
  }
  class TestClass implements TestInter {@
      Override
      public void testMethod() {
          //you see here  
          //method from A and B  
          //only one method overridden.    
      }
  }