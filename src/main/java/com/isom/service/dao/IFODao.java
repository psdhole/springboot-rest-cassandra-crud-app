package com.isom.service.dao;

import com.isom.service.model.ISOMFulfilment;
import com.isom.service.model.User;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface IFODao extends CrudRepository<ISOMFulfilment, String> {

    @Query("Select * from ISOMFulfilment where distanceUnitOfMeasure=?0")
    List<User> findByDistanceUnitOfMeasure(String distanceUnitOfMeasure);

    @Query("Select * from ISOMFulfilment where deliveryArrangementsId=?0")
    List<User> findByDeliveryArrangementsId(Double deliveryArrangementsId);

    @Query("Select * from ISOMFulfilment where id=?0")
    User findById(UUID id);
}
