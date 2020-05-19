package com.isom.service.dao;

import com.isom.service.model.ISOMFulfilment;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface IFODao extends CrudRepository<ISOMFulfilment, String> {

    @Query("Select * from ISOMFulfilment where distanceUnitOfMeasure=?0")
    List<ISOMFulfilment> findByDistanceUnitOfMeasure(String distanceUnitOfMeasure);

    @Query("Select * from ISOMFulfilment where deliveryArrangementsId=?0")
    List<ISOMFulfilment> findByDeliveryArrangementsId(Double deliveryArrangementsId);

    @Query("Select * from ISOMFulfilment where id=?0")
    ISOMFulfilment findById(UUID id);
}
