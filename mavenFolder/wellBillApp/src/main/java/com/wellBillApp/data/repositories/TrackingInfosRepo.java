package com.wellBillApp.data.repositories;

import com.wellBillApp.data.models.TrackingInfos;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TrackingInfosRepo extends MongoRepository<TrackingInfos, String> {
    Optional<TrackingInfos> findByPackageId(String id);
}
