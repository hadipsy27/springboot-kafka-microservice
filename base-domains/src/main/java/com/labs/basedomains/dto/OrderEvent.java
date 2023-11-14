package com.labs.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
// This class to transfer producing data between Producer and Consumer using Kafka
    private String message;
    private String status;
    private Order order;

}
