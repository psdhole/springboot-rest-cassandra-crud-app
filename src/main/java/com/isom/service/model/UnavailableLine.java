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
@UserDefinedType("unavailableLine")
public class UnavailableLine implements Serializable {
    private final static long serialVersionUID = 6600293515408685591L;
    private Long itemLineId;
    private Long unavailableQty;
    private String unavailableReasonCode;
    private String unavailableReason;
}
