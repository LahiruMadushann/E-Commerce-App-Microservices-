package org.lahiru.ecommerce.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lahiru.ecommerce.kafka.payment.PaymentConfirmation;
import org.lahiru.ecommerce.notification.Notification;
import org.lahiru.ecommerce.notification.NotificationRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static org.lahiru.ecommerce.notification.NotificationType.PAYMENT_CONFIRMATION;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationConsumer {
    private final NotificationRepository repository;

    @KafkaListener(topics = "payment-topic")
    public void consumePaymentSuccessNotification(PaymentConfirmation paymentConfirmation) {
        log.info(String.format("Consuming the message from payment-topic Topic:: %s", paymentConfirmation));
        repository.save(
                Notification.builder()
                        .type(PAYMENT_CONFIRMATION)
                        .notificationDate(LocalDateTime.now())
                        .paymentConfirmation(paymentConfirmation)
                        .build()
        );


    }
}
