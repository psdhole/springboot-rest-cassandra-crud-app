package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("itemLine")
public class ItemLine implements Serializable {
    private final static long serialVersionUID = -2096036944777384337L;
    private Long bundleParentId;
    private Long id;
    private String itemType;
    private Long itemNo;
    private Long requiredQty;
    private String unitOfMeasure;
    private Double unitVolume;
    private String unitVolumeUnitOfMeasure;
    private Double unitWeight;
    private String unitWeightUnitOfMeasure;
    private Long splitGroupId;
    private String reservationID;
}
