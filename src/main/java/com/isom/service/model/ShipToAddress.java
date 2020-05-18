package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class ShipToAddress implements Serializable {
    private final static long serialVersionUID = -2393776248907090321L;
    public String country;
    public String emailAddress;
    public String zipCode;
}
