package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class DeliveryLine implements Serializable {
    private final static long serialVersionUID = -4552200933724698685L;
    public String deliveryId;
    public String serviceItemId;
    public String unitOfMeasure;
    public String transportMethodType;
    public List<PickupPoint> pickupPoints;
}
