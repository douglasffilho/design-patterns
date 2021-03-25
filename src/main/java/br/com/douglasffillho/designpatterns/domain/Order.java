package br.com.douglasffillho.designpatterns.domain;

public class Order {
    private final String orderId;
    private final OrderStatus status;

    public Order(String orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
