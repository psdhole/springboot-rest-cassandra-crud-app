package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class PossibleDeliveryLine implements Serializable {
    private final static long serialVersionUID = -2326203451719993154L;
    public List<DeliveryAssociation> deliveryAssociations;
    public String id;
}
