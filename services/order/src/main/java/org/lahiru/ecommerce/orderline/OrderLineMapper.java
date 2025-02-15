package org.lahiru.ecommerce.orderline;

import org.lahiru.ecommerce.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.id())
                .quantity(request.quantity())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .productId(request.productId())
                .build();
    }

    public Object toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(orderLine.getId(), orderLine.getQuantity());
    }
}
