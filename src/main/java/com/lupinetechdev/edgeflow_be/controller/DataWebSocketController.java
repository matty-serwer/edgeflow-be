package com.lupinetechdev.edgeflow_be.controller;

import com.lupinetechdev.edgeflow_be.model.DataModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class DataWebSocketController {

    @MessageMapping("/send-data")
    @SendTo("/topic/data")
    public DataModel sendData() {
        DataModel data = new DataModel();
        data.setTimestamp(LocalDateTime.now());
        data.setDeviceId("sensor-001");
        data.setSensorType("temperature");
        data.setValue(22.3);
        data.setUnits("°C");
        return data;
    }
}
