package com.isom.service.model;

import com.datastax.driver.core.DataType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@UserDefinedType("businessUnit")
public class BusinessUnit implements Serializable {
    private final static long serialVersionUID = -7564560956526271168L;
    @CassandraType(type = DataType.Name.VARCHAR)
    private String type;

    @CassandraType(type = DataType.Name.BIGINT)
    private Long code;
}
