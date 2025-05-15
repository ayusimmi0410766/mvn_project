package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    @Test
    public void testadd() {
        App app = new App();
        int result = app.add(2, 3);
        System.out.println("running test :2+3=" + result);
        Assert.assertEquals(5, result);
    }
}