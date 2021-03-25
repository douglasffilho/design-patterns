package br.com.douglasffillho.designpatterns.repository;

import br.com.douglasffillho.designpatterns.domain.Order;
import br.com.douglasffillho.designpatterns.error.OrderNotFoundError;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import static br.com.douglasffillho.designpatterns.domain.OrderStatus.APROVADO;
import static br.com.douglasffillho.designpatterns.domain.OrderStatus.EMPACOTAMENTO;
import static br.com.douglasffillho.designpatterns.domain.OrderStatus.ENTREGUE;
import static br.com.douglasffillho.designpatterns.domain.OrderStatus.PENDENTE;
import static br.com.douglasffillho.designpatterns.domain.OrderStatus.REJEITADO;

@Component
public class OrderRepository {
    private static final Map<String, Order> orders = new ConcurrentHashMap<>();

    static {
        orders.put("order-1", new Order("order-1", PENDENTE));
        orders.put("order-2", new Order("order-2", APROVADO));
        orders.put("order-3", new Order("order-3", EMPACOTAMENTO));
        orders.put("order-4", new Order("order-4", ENTREGUE));
        orders.put("order-5", new Order("order-5", REJEITADO));
    }

    public Order findOrderById(final String orderId) {
        return Optional.ofNullable(orders.get(orderId)).orElseThrow(() -> new OrderNotFoundError(orderId));
    }
}
