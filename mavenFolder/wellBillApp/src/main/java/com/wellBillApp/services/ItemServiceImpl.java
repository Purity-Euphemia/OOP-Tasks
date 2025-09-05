package com.wellBillApp.services;


import com.wellBillApp.data.models.Item;
import com.wellBillApp.data.models.TrackingInfo;
import com.wellBillApp.data.models.TrackingInfos;
import com.wellBillApp.data.repositories.Items;
import com.wellBillApp.data.repositories.TrackingInfosRepo;
import com.wellBillApp.dtos.requests.SendItemRequest;
import com.wellBillApp.dtos.responses.SendItemResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import static com.wellBillApp.utils.Mapper.convertToItem;
import static com.wellBillApp.utils.Mapper.convertToSendItemResponse;

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private Items items;

    @Autowired
    private TrackingInfosRepo trackingInfosRepo;

    @Override
    public SendItemResponse sendItemResponse(SendItemRequest sendItemRequest) {
        Item item = convertToItem(sendItemRequest);
        addTrackingInforFor(item, String.format("%s sent a package to %s", item.getSenderName(), item.getReceiverName()));

        return convertToSendItemResponse(items.save(item));
    }

    private void addTrackingInforFor(Item item, String info){
        Optional<TrackingInfos> optionalTrackingInfos = trackingInfosRepo.findByPackageId(item.getId());
        if(optionalTrackingInfos.isPresent()){
            log.info("I reached here");
            TrackingInfo trackingInfo = new TrackingInfo();
            trackingInfo.setCreatedAt(LocalDateTime.now());
            trackingInfo.setEvent(info);
            optionalTrackingInfos.get().getInfos().add(trackingInfo);
            trackingInfosRepo.save(optionalTrackingInfos.get());
        }
        else {
            TrackingInfos trackingInfos = new TrackingInfos();
            TrackingInfo trackingInfo = new TrackingInfo();
            trackingInfo.setCreatedAt(LocalDateTime.now());
            trackingInfo.setEvent(info);
            trackingInfos.getInfos().add(trackingInfo);

            trackingInfos.setPackageId(items.save(item).getId());
            item.setTrackingInfos(trackingInfosRepo.save(trackingInfos));
            items.save(item);

        }
    }
}
