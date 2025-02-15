package org.lahiru.ecommerce.kafka;

import org.lahiru.ecommerce.customer.CustomerResponse;
import org.lahiru.ecommerce.order.PaymentMethod;
import org.lahiru.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
