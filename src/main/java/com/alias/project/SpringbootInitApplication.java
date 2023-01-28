package com.alias.project;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@MapperScan("com.alias.project.Mapper")
//@ServletComponentScan
@EnableTransactionManagement
@EnableCaching
@SpringBootApplication
public class SpringbootInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootInitApplication.class, args);
        log.info("project started...");
    }

}
