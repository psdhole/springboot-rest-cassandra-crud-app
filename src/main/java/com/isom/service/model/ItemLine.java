package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class ItemLine implements Serializable {
    private final static long serialVersionUID = -2096036944777384337L;
    public Long bundleParentId;
    public Long id;
    public String itemType;
    public Long itemNo;
    public Long requiredQty;
    public String unitOfMeasure;
    public Double unitVolume;
    public String unitVolumeUnitOfMeasure;
    public Double unitWeight;
    public String unitWeightUnitOfMeasure;
    public Long splitGroupId;
    public String reservationID;
}
