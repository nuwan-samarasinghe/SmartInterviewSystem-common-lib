package com.smartinterviewshedular.commonlib.common.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@MappedSuperclass
public class Person {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String nic;

    private Boolean isLicenseAvailable;
    private Date birthday;

    @Column(nullable = false)
    private String gender;

    private String emailAddress;
    private String mobileNumber;
    private String homeNumber;
    private Timestamp createdTimeStamp;
    private Timestamp modifiedTimeStamp;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "home_address_id")
    private Address address;
}
