package com.wellBillApp.dtos.responses;

import lombok.Data;

import java.time.format.DateTimeFormatter;

@Data
public class SendItemResponse {

    private String description;
    private int weightInGrammes;
    private String senderName;
    private String receiverName;
    private String contactPhoneNumber;
    private String trackingNumber;
    private DateTimeFormatter dateSent;
}
