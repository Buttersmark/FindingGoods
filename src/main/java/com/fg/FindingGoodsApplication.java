package com.fg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan("com.fg.mapper")
@SpringBootApplication
public class FindingGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindingGoodsApplication.class, args);
    }

}
