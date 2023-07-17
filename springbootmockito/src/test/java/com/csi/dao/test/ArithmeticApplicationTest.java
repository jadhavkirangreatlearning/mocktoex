package com.csi.dao.test;

import com.csi.dao.ArithmeticApplication;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArithmeticApplicationTest {

    ArithmeticApplication arithmeticApplication = new ArithmeticApplication();


    @Test
    public void addTest(){

        Assert.assertEquals(20, arithmeticApplication.add(10, 10));

    }


    @Test
    public void subTest(){

        Assert.assertEquals(30, arithmeticApplication.sub(40, 10));

    }
}
