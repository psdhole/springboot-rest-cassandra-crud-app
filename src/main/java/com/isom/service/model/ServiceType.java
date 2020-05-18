package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class ServiceType implements Serializable {
    private final static long serialVersionUID = -9211494892042500941L;
    public String id;
    public List<PossibleSolution> possibleSolutions;
    public List<PossibleDeliveryLine> possibleDeliveryLines;
}
