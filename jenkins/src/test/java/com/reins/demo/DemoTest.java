package com.reins.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: 陈胜楠
 * @Date: 2019/4/30 8:37 PM
 * @Version 1.0
 */
public class DemoTest {
    @Test
    public void testReturnString(){
        Assert.assertEquals("test",new Demo().returnString());
    }
    @Test
    public void testReString(){
        Assert.assertEquals("test",new Demo().returnString());
    }
}
