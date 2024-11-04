package org.lyflexi.orderstatemachine.listener;

import org.lyflexi.orderstatemachine.enums.OrderStatus;
import org.lyflexi.orderstatemachine.enums.OrderStatusChangeEvent;
import org.lyflexi.orderstatemachine.model.Order;
import org.springframework.messaging.Message;
import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-statemachine-practice
 * @Date: 2024/11/4 15:24
 */
@Component("orderStateListener")
//监听状态机orderStateMachine
@WithStateMachine(name = "orderStateMachine")
public class OrderStateListenerImpl{

    @OnTransition(source = "WAIT_PAYMENT", target = "WAIT_DELIVER")
    public boolean payTransition(Message<OrderStatusChangeEvent> message) {
        Order order = (Order) message.getHeaders().get("order");
        order.setStatus(OrderStatus.WAIT_DELIVER);
        System.out.println("支付，状态机反馈信息：" + message.getHeaders().toString());
        return true;
    }

    @OnTransition(source = "WAIT_DELIVER", target = "WAIT_RECEIVE")
    public boolean deliverTransition(Message<OrderStatusChangeEvent> message) {
        Order order = (Order) message.getHeaders().get("order");
        order.setStatus(OrderStatus.WAIT_RECEIVE);
        System.out.println("发货，状态机反馈信息：" + message.getHeaders().toString());
        return true;
    }

    @OnTransition(source = "WAIT_RECEIVE", target = "FINISH")
    public boolean receiveTransition(Message<OrderStatusChangeEvent> message){
        Order order = (Order) message.getHeaders().get("order");
        order.setStatus(OrderStatus.FINISH);
        System.out.println("收货，状态机反馈信息：" + message.getHeaders().toString());
        return true;
    }
}
