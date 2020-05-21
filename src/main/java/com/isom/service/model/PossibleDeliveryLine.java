package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("possibleDeliveryLine")
public class PossibleDeliveryLine implements Serializable {
    private final static long serialVersionUID = -2326203451719993154L;
    private String id;
    private List<DeliveryAssociation> deliveryAssociations;
}
