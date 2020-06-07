package com.smartinterviewshedular.commonlib.common.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private String addressLine1;
    private String city;
    private String province;
    private String country;
    private Integer zipCode;
}
