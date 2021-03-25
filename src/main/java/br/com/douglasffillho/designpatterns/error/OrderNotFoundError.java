package br.com.douglasffillho.designpatterns.error;

public class OrderNotFoundError extends RuntimeException {

    public OrderNotFoundError(final String orderId) {
        super(String.format("Order Not Found By id: %s", orderId));
    }

}
