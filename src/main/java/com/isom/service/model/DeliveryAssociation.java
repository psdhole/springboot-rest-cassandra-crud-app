package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("deliveryAssociation")
public class DeliveryAssociation implements Serializable {
    private final static long serialVersionUID = 379608226215677209L;
    private Long itemLineId;
    private Long itemQty;
}
