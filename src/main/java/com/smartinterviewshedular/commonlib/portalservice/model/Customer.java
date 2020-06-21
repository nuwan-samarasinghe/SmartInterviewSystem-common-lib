package com.smartinterviewshedular.commonlib.portalservice.model;

import com.smartinterviewshedular.commonlib.portalservice.model.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
@EqualsAndHashCode(callSuper = true)
public class Customer extends Person {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;
}
