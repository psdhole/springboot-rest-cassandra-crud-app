package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("earliestShipDate")
public class EarliestShipDate implements Serializable {
    private final static long serialVersionUID = -6074115505751589549L;

    private String date;
}
