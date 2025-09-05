package com.wellBillApp.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class TrackingInfos {
    @Id
    private String trackingId;
    private String packageId;
    private List<TrackingInfo> infos = new ArrayList<>();
}
