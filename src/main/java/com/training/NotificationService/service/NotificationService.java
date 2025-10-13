package com.training.NotificationService.service;
import com.training.NotificationService.model.Notification;
//import com.training.OrderService.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {
    Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

    @KafkaListener(topics = "orderTopic", groupId = "notificationGroup")
    public void handleOrderPlacedNotification(ConsumerRecord<String, String> record) {
        LOGGER.info("Received Notification: {} {}",record.key(),record.value());
        LOGGER.info("hi, Added to test jenkins");
    }

    @KafkaListener(topics = "paymentTopic", groupId = "notificationGroup")
    public void handlePaymentSuccessNotification(ConsumerRecord<String, String> record) {
        LOGGER.info("Notification Received: {} {}",record.key(),record.value());
    }
}