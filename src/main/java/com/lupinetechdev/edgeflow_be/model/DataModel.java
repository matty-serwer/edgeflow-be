package com.lupinetechdev.edgeflow_be.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DataModel {
    private LocalDateTime timestamp;
    private String deviceId;
    private String sensorType;
    private Double value;
    private String units;

}
