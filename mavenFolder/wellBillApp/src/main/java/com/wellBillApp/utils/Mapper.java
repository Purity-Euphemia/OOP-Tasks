package com.wellBillApp.utils;

import com.wellBillApp.data.models.Item;
import com.wellBillApp.data.repositories.Items;
import com.wellBillApp.dtos.requests.SendItemRequest;
import com.wellBillApp.dtos.responses.SendItemResponse;

import java.time.format.DateTimeFormatter;

public class Mapper {
    public static Item convertToItem(SendItemRequest sendItemRequest) {
        Item item = new Item();
        item.setDescription(sendItemRequest.getDescription());
        item.setWeightInGrammes(sendItemRequest.getWeightInGrammes());
        item.setSenderName(sendItemRequest.getSenderName());
        item.setReceiverName(sendItemRequest.getReceiverName());
        item.setContactPhoneNumber(sendItemRequest.getContactPhoneNumber());
        return item;
    }
    public static SendItemResponse convertToSendItemResponse(Item item) {
        SendItemResponse sendItemResponse = new SendItemResponse();
        sendItemResponse.setDescription(item.getDescription());
        sendItemResponse.setWeightInGrammes(item.getWeightInGrammes());
        sendItemResponse.setSenderName(item.getSenderName());
        sendItemResponse.setReceiverName(item.getReceiverName());
        sendItemResponse.setContactPhoneNumber(item.getContactPhoneNumber());
        sendItemResponse.setTrackingNumber(item.getId());
        sendItemResponse.setDateSent(DateTimeFormatter.ofPattern("EEE, dd, MM, yyyy HH:mm:ss a"));
        return sendItemResponse;
    }
}
