package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("pickupPoint")
public class PickupPoint implements Serializable {
    private final static long serialVersionUID = 6147731166575635208L;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String city;
    private String country;
    private Double distance;
    private String id;
    private String identifier;
    private String lsc;
    private String openingHoursMonTime;
    private String openingHoursTueTime;
    private String openingHoursWedTime;
    private String openingHoursThuTime;
    private String openingHoursFriTime;
    private String openingHoursSatTime;
    private String openingHoursSunTime;
    private String name;
    private String state;
    private String zipCode;
}
