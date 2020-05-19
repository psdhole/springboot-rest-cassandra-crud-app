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
@UserDefinedType("serviceType")
public class ServiceType implements Serializable {
    private final static long serialVersionUID = -9211494892042500941L;
    private String id;
    private List<PossibleSolution> possibleSolutions;
    private List<PossibleDeliveryLine> possibleDeliveryLines;
}
