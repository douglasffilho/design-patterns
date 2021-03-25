package br.com.douglasffillho.designpatterns.utils;

import br.com.douglasffillho.designpatterns.domain.OrderStatus;
import br.com.douglasffillho.designpatterns.model.ExpectedOrderStatus;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class OrderStatusMapper {
    private static final Map<OrderStatus, ExpectedOrderStatus> map = new HashMap<>();
    static {
        map.put(OrderStatus.APROVADO, ExpectedOrderStatus.APPROVED);
        map.put(OrderStatus.ENTREGUE, ExpectedOrderStatus.DELIVERED);
        map.put(OrderStatus.EMPACOTAMENTO, ExpectedOrderStatus.PACKAGING);
        map.put(OrderStatus.REJEITADO, ExpectedOrderStatus.REJECTED);
        map.put(OrderStatus.PENDENTE, ExpectedOrderStatus.PENDING);
    }

    public ExpectedOrderStatus expect(final OrderStatus status) {
        return map.get(status);
    }

}
