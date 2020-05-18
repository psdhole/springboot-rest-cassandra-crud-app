package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class PickupPoint implements Serializable {
    private final static long serialVersionUID = 6147731166575635208L;
    public String addressLine1;
    public String addressLine2;
    public String addressLine3;
    public String addressLine4;
    public String city;
    public String country;
    public Double distance;
    public String id;
    public String identifier;
    public String lsc;
    public String openingHoursMonTime;
    public String openingHoursTueTime;
    public String openingHoursWedTime;
    public String openingHoursThuTime;
    public String openingHoursFriTime;
    public String openingHoursSatTime;
    public String openingHoursSunTime;
    public String name;
    public String state;
    public String zipCode;
}
