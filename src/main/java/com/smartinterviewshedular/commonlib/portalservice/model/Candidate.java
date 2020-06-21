package com.smartinterviewshedular.commonlib.portalservice.model;

import com.smartinterviewshedular.commonlib.portalservice.model.Technology;
import com.smartinterviewshedular.commonlib.portalservice.model.Track;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String nic;
    private String email;
    private String address;
    private String cvLocation;
    private Boolean isShortListed;
    private Boolean isDeleted;

    @CreationTimestamp
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Timestamp createdTimeStamp;

    @UpdateTimestamp
    @Column(name = "updatedTime", nullable = false, updatable = true)
    private Timestamp updatedTimeStamp;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "track", nullable = false)
    private Track track;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "candidateHasTechnology",
            joinColumns = {@JoinColumn(name = "candidateId", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "technologyId", referencedColumnName = "id")})
    List<Technology> technologyList;
}
