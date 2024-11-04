package org.lyflexi.orderstatemachine.service;

import org.lyflexi.orderstatemachine.model.Order;

import java.util.Map;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-statemachine-practice
 * @Date: 2024/11/4 15:29
 */
public interface IOrderService {
    //创建新订单
    Order create();
    //发起支付
    Order pay(int id);
    //订单发货
    Order deliver(int id);
    //订单收货
    Order receive(int id);
    //获取所有订单信息
    Map<Integer, Order> getOrders();
}