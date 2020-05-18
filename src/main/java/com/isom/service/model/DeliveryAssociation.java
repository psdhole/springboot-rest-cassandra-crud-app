package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter

public class DeliveryAssociation implements Serializable {
    private final static long serialVersionUID = 379608226215677209L;
    public Long itemLineId;
    public Long itemQty;
}
