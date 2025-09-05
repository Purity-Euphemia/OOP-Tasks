package com.wellBillApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("myStuff")
public class Item {
    @Id
    private String id;
    private String description;
    private int weightInGrammes;
    private String senderName;
    private String receiverName;
    private String contactPhoneNumber;

    @DBRef
    private TrackingInfos trackingInfos;


}
