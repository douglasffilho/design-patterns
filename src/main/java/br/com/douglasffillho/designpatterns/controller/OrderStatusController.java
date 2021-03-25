package br.com.douglasffillho.designpatterns.controller;

import br.com.douglasffillho.designpatterns.domain.Order;
import br.com.douglasffillho.designpatterns.model.MappedOrderStatus;
import br.com.douglasffillho.designpatterns.repository.OrderRepository;
import br.com.douglasffillho.designpatterns.utils.OrderStatusMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class OrderStatusController {
    private static final Logger log = LoggerFactory.getLogger(OrderStatusController.class);

    @Autowired
    private OrderRepository repository;

    @Autowired
    private OrderStatusMapper orderStatusMapper;

    @GetMapping("/{orderId}")
    public MappedOrderStatus findMappedOrderStatus(@PathVariable String orderId) {
        Order order = this.repository.findOrderById(orderId);

        return new MappedOrderStatus(
                order.getStatus(),
                this.orderStatusMapper.expect(order.getStatus())
        );
    }
}
