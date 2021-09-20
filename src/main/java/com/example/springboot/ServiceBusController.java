package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBusController {
    @GetMapping("/service_bus")
    public String index() {
        return "chtk service bus.";
    }

    @GetMapping("/service_bus/pub")
    public String pub() {
        ServiceBusExample.sendMessage();
        return "chtk sendMessage to service bus.";
    }

    @GetMapping("/service_bus/pub_batch")
    public String pub_batch() {
        ServiceBusExample.sendMessageBatch();
        return "chtk sendMessage to service bus pub_batch.";
    }
}
