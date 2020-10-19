package com.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/15  15:11
 */
public class TimeTest {

    @Test
    public void test(){
        Date now = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sd.format(now));
    }


}
