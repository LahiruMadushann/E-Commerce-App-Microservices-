package org.lahiru.ecommerce.notification;

import lombok.*;
import org.lahiru.ecommerce.kafka.order.OrderConfirmation;
import org.lahiru.ecommerce.kafka.payment.PaymentConfirmation;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Notification {
    private String id;
    private NotificationType type;
    private OrderConfirmation orderConfirmation;
    private PaymentConfirmation paymentConfirmation;
}
