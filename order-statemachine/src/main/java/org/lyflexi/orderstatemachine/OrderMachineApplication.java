package org.lyflexi.orderstatemachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-statemachine-practice
 * @Date: 2024/11/4 15:34
 */

@SpringBootApplication
public class OrderMachineApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMachineApplication.class, args);
    }
}