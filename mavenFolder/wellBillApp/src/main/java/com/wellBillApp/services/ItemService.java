package com.wellBillApp.services;

import com.wellBillApp.dtos.requests.SendItemRequest;
import com.wellBillApp.dtos.responses.SendItemResponse;

public interface ItemService {
    SendItemResponse sendItemResponse(SendItemRequest sendItemRequest);
}
