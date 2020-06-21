package com.smartinterviewshedular.commonlib.portalservice.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "technology")
public class Technology {

    @Id
    @GeneratedValue
    @Column(name="id",nullable = false)
    private int id;

    @Column(name = "type", nullable = false)
    private String type;

    @CreationTimestamp
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Timestamp createdTimeStamp;
    @UpdateTimestamp
    @Column(name = "updatedTime", nullable = false, updatable = true)
    private Timestamp updatedTimeStamp;

}
