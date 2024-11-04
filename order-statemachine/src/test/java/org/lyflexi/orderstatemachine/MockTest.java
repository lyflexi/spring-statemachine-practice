package org.lyflexi.orderstatemachine;

import org.junit.jupiter.api.Test;
import org.lyflexi.orderstatemachine.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-statemachine-practice
 * @Date: 2024/11/4 15:30
 */
@SpringBootTest
public class MockTest {
    @Autowired
    @Qualifier("orderService")
    IOrderService orderService;

    @Test
    void test() {

        Thread.currentThread().setName("主线程");

        orderService.create();
        orderService.create();

        orderService.pay(1);

        new Thread("客户线程") {
            @Override
            public void run() {
                orderService.deliver(1);
                orderService.receive(1);
            }
        }.start();

        orderService.pay(2);
        orderService.deliver(2);
        orderService.receive(2);

        System.out.println("全部订单状态：" + orderService.getOrders());
    }
}
