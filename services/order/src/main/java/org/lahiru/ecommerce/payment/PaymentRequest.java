package org.lahiru.ecommerce.payment;

import org.lahiru.ecommerce.customer.CustomerResponse;
import org.lahiru.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
