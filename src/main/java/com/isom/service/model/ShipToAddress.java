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
@UserDefinedType("shipToAddress")
public class ShipToAddress implements Serializable {
    private final static long serialVersionUID = -2393776248907090321L;
    private String country;
    private String emailAddress;
    private String zipCode;
}
