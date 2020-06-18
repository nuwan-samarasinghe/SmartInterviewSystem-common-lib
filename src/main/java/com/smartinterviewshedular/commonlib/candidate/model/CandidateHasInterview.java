package com.smartinterviewshedular.commonlib.candidate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidate_has_interview")
public class CandidateHasInterview {
    @EmbeddedId
    private CandidateInterviewIdentity candidateInterviewIdentity;
    @Nullable
    private Boolean isSelected;
    @Nullable
    private String position;
    @CreationTimestamp
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Timestamp createdTimeStamp;
    @UpdateTimestamp
    @Column(name = "updatedTime", nullable = false, updatable = true)
    private Timestamp updatedTimeStamp;
}
