package com.smartinterviewshedular.commonlib.track.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "track")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nullable
    private String type;
    @CreationTimestamp
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Timestamp createdTimeStamp;
    @UpdateTimestamp
    @Column(name = "updatedTime", nullable = false, updatable = true)
    private Timestamp updatedTimeStamp;

}
