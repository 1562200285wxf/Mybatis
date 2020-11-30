package com.iwhale.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/11/16  9:24
 */
@SpringBootApplication
@MapperScan("com.iwhale.java.mapper.*")
public class ApplicationPlus {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationPlus.class,args);
    }
}
