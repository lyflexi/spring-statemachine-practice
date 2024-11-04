package org.lyflexi.orderstatemachine.enums;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-statemachine-practice
 * @Date: 2024/11/4 15:22
 */
/**
 * 订单状态改变事件
 */
public enum OrderStatusChangeEvent {
    // 支付，发货，确认收货
    PAYED, DELIVERY, RECEIVED;
}