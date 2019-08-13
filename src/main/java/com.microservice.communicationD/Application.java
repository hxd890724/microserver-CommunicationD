package com.microservice.communicationD;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  启动类
 *  访问路径：http://localhost:8080/swagger.html
 */
@SpringBootApplication
@EnableSwagger2
public class Application {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(Application.class);
        sa.run(args);
    }
}
