package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("deliveryLine")
public class DeliveryLine implements Serializable {
    private final static long serialVersionUID = -4552200933724698685L;
    private String deliveryId;
    private String serviceItemId;
    private String unitOfMeasure;
    private String transportMethodType;
    private List<PickupPoint> pickupPoints;
}
