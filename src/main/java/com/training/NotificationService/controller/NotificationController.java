package com.training.NotificationService.controller;
import com.training.NotificationService.model.Notification;
import com.training.NotificationService.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    /*@PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
        notificationService.handleNotification(notification);
        return ResponseEntity.ok("Notification Sent Successfully!");
    }*/
}