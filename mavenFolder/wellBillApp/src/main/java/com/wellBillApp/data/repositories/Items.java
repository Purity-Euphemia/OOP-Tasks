package com.wellBillApp.data.repositories;

import com.wellBillApp.data.models.Item;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Items extends MongoRepository <Item, String>{
    Optional<Item> findItemsById(String id);
}
