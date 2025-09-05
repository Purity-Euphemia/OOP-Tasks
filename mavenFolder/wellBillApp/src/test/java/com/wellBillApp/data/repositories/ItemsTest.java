package com.wellBillApp.data.repositories;


import com.wellBillApp.data.models.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ItemsTest {
    @Autowired
    private Items items;
    @Test
    public void saveItemTest() {
        items.deleteAll();
        items.save(new Item());
        assertEquals(1, items.count());
    }


}