package com.smartinterviewshedular.commonlib.vacancy.model;

import com.smartinterviewshedular.commonlib.technology.model.Technology;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "vacancy")
public class Vacancy {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int id;
    @Column(name="publishedDate", nullable = true)
    private Timestamp publishedDate;
    @Column(name="closingDate",nullable = true)
    private Timestamp closingDate;
    @Column(name="is_deleted",nullable = true)
    private boolean isDeleted;

    @CreationTimestamp
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Timestamp createdTimeStamp;
    @UpdateTimestamp
    @Column(name = "updatedTime", nullable = false, updatable = true)
    private Timestamp updatedTimeStamp;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "technologyId")
    private Technology technology;
}
