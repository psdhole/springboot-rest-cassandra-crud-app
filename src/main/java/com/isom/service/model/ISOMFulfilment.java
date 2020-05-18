package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Table
public class ISOMFulfilment implements Serializable {
    private final static long serialVersionUID = -3163331657457447613L;
    @PrimaryKey
    private UUID id;
    @Column
    public Double deliveryArrangementsId;
    @Column
    public String distanceUnitOfMeasure;
    private BusinessUnit businessUnit;
//    public ShipToAddress shipToAddress;
//    public List<ItemLine> itemLines;
//    public List<ServiceType> serviceTypes;
}
