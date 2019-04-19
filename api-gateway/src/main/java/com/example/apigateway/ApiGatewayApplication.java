package com.example.apigateway;

import com.example.apigateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author lifubei
 * @date 2019/4/18
 *
 * @EnableZuulProxy 开启Zuul的API网关服务功能
 */
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
