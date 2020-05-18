package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class PossibleSolution implements Serializable {
    private final static long serialVersionUID = -8179878945962560330L;
    public List<UnavailableLine> unavailableLines;
    public List<DeliveryLine> deliveryLines;
    public EarliestShipDate earliestShipDate;
    public String id;
    public String service;
}
