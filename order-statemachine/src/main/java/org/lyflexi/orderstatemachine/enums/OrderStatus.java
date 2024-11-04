package org.lyflexi.orderstatemachine.enums;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-statemachine-practice
 * @Date: 2024/11/4 15:22
 */
/**
 * 订单状态
 */
public enum OrderStatus {
    // 待支付，待发货，待收货，订单结束
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH;
}
