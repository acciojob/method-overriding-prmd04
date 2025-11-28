package com.driver.test;

import com.driver.A; 
import com.driver.B;  

public class TestCases {

    @Test
    public void testInvokeAFromB() {
        A obj = new B();
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }

    @Test
    public void testOverrideInB() {
        B objB = new B();
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }

}
