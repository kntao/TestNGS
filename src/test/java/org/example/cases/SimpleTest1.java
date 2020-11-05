package org.example.cases;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by qingtao.kong on 2020/11/5.
 */
public class SimpleTest1 {
    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
}
