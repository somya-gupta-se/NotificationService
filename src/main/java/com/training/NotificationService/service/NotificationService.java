package com.training.NotificationService.service;
import com.training.NotificationService.model.Notification;
//import com.training.OrderService.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    @KafkaListener(topics = "orderTopic", groupId = "notificationGroup")
    public void handleOrderPlacedNotification(ConsumerRecord<String, String> record) {
        System.out.println("Received Notification: "+ record.key()+" "+record.value());
    }

    @KafkaListener(topics = "paymentTopic", groupId = "notificationGroup")
    public void handlePaymentSuccessNotification(ConsumerRecord<String, String> record) {
        System.out.println("Received Notification: "+ record.key()+" "+record.value());
    }
    /*
    @KafkaListener(topics = "orderplacedTopic", groupId = "notificationGroup")
    public void handleNotification(ConsumerRecord<String, String> record) {
        //log.info("Received Notification: Order ID: {}, Customer ID: {}, Message: {}",
          //      orderEvent.getOrderId(), orderEvent.getCustomerId(), orderEvent.getMessage());
        System.out.println("Received Notification: Order ID: "+ record.key()+"Message: " +record.value());
    }*/

    /*@KafkaListener(topics = "orderTopic", groupId = "orderGroup")
    public void listenOrder(ConsumerRecord<String, String> record) {
        log.info("📩 Received Order Notification: Key: {}, Value: {}",
                record.key(), record.value());
        System.out.println(" Received Order Notification: Key: "+record.key()+
                        ", Value: "+record.value());
    }*/
}