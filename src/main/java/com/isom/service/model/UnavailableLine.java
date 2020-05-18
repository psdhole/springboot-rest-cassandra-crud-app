package com.isom.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class UnavailableLine implements Serializable {
    private final static long serialVersionUID = 6600293515408685591L;
    public Long itemLineId;
    public Long unavailableQty;
    public String unavailableReasonCode;
    public String unavailableReason;
}
