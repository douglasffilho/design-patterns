package br.com.douglasffillho.designpatterns.model;

import br.com.douglasffillho.designpatterns.domain.OrderStatus;

public class MappedOrderStatus {
    private final OrderStatus original;
    private final ExpectedOrderStatus expected;

    public MappedOrderStatus(OrderStatus original, ExpectedOrderStatus expected) {
        this.original = original;
        this.expected = expected;
    }

    public OrderStatus getOriginal() {
        return original;
    }

    public ExpectedOrderStatus getExpected() {
        return expected;
    }
}
