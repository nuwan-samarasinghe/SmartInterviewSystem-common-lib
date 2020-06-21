package com.smartinterviewshedular.commonlib.portalservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartinterviewshedular.commonlib.portalservice.model.CandidateInterviewStatus;
import com.smartinterviewshedular.commonlib.portalservice.model.CandidateInterviewStatusResponse;
import com.smartinterviewshedular.commonlib.portalservice.model.InterviewerInterviewStatus;
import com.smartinterviewshedular.commonlib.portalservice.model.InterviewerInterviewStatusResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private Date dateTime;
    private String interviewType;
    private String score;
    private String feedback;
    private String interviewStatus;
    @CreationTimestamp
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Timestamp createdTimeStamp;
    @UpdateTimestamp
    @Column(name = "updatedTime", nullable = false, updatable = true)
    @Nullable
    private Timestamp updatedTimeStamp;
    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<InterviewerInterviewStatus> interviewers;
    @Nullable
    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private CandidateInterviewStatus candidate;
    @Nullable
    @Transient
    private List<InterviewerInterviewStatusResponse> interviewerInterviewStatusResponses;
    @Nullable
    @Transient
    private List<CandidateInterviewStatusResponse> candidateInterviewStatusResponses;
}
