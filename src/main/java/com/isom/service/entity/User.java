package com.isom.service.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@AllArgsConstructor
@Getter
@Setter
@Table
public class User {
  @PrimaryKey private UUID id;
  @Column private String name;
  @Column private String surname;
  @Column private int age;
}
