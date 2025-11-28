package com.driver;

public class A {
  public String method1(){
    return "method is overiden in class B";
  }
}
public class B extends A{
  public String method1(){
    return "Method is overridden in Extended class B";
  }
}
public class Main{
  public static void main(String args[]){
    B obj = new B();
    System.out.println(obj.method1());

      A objA = new B();
      System.out.println(objA.method1());
  }
}