package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/14  21:39
 */
@SpringBootApplication
@MapperScan("com.mapper")
public class ApplicationPlus {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPlus.class, args);
    }

}
