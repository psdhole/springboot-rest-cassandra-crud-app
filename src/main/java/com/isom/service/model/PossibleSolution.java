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
@UserDefinedType("possibleSolution")
public class PossibleSolution implements Serializable {
    private final static long serialVersionUID = -8179878945962560330L;
    private String id;
    private String service;
    private List<UnavailableLine> unavailableLines;
    private List<DeliveryLine> deliveryLines;
    private EarliestShipDate earliestShipDate;
}
