package com.wellBillApp.services;

import com.wellBillApp.data.models.Item;
import com.wellBillApp.data.repositories.Items;
import com.wellBillApp.data.repositories.TrackingInfosRepo;
import com.wellBillApp.dtos.requests.SendItemRequest;
import com.wellBillApp.dtos.responses.SendItemResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ItemServiceImplTest {
    @Autowired
    private ItemService itemService;

    @Autowired
    private Items items;

    @Autowired
    private TrackingInfosRepo trackingInfosRepo;

    @BeforeEach
    public void setUp() {
        items.deleteAll();
        trackingInfosRepo.deleteAll();
    }
    @Test
    public void saveItemTest() {
        SendItemRequest sendItemRequest = new SendItemRequest();
        itemService.sendItemResponse(sendItemRequest);
        assertEquals(1, items.count());
    }
    public void sendItem_RetrieveSentItemReturnSavedItemTest() {
        SendItemRequest sendItemRequest = new SendItemRequest();
        sendItemRequest.setDescription("A pack of condom");
        sendItemRequest.setSenderName("John");
        sendItemRequest.setReceiverName("Purity");
        sendItemRequest.setContactPhoneNumber("1234567890");
        sendItemRequest.setWeightInGrammes(3);
        SendItemResponse response = itemService.sendItemResponse(sendItemRequest);

        Item item =  items.findItemsById(response.getTrackingNumber()).get();
        assertEquals("A pack of Condom", item.getDescription());
        assertEquals("John", item.getSenderName());
        assertEquals("Purity", item.getReceiverName());
        assertEquals("1234567890", item.getContactPhoneNumber());
        assertEquals(3, item.getWeightInGrammes());
    }
    @Test
    public void sendItem_trackingInfoIsOneTest() {
        SendItemRequest sendItemRequest = new SendItemRequest();
        sendItemRequest.setDescription("A pack of Condom");
        sendItemRequest.setSenderName("John");
        sendItemRequest.setReceiverName("Purity");
        sendItemRequest.setContactPhoneNumber("1234567890");
        sendItemRequest.setWeightInGrammes(3);
        SendItemResponse response = itemService.sendItemResponse(sendItemRequest);
        assertEquals(1, trackingInfosRepo.count());
    }
}


