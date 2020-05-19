package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.List;
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
    private Double deliveryArrangementsId;
    @Column
    private String distanceUnitOfMeasure;
    private BusinessUnit businessUnit;
    private ShipToAddress shipToAddress;
    private List<ItemLine> itemLines;
    private List<ServiceType> serviceTypes;
}
