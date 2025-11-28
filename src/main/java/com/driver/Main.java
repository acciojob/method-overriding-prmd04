package com.driver;

public class Main{
  public static void main(String args[]){
    B obj = new B();
    System.out.println(obj.meth());
    A objA = new B();
    System.out.println(objA.meth());
  }
}