package com.smartinterviewshedular.commonlib.interviwer.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class InterviewerInterviewIdentity implements Serializable {
    @Column(nullable = false)
    private Integer interviewId;
    @Column(nullable = false)
    private Integer interviewerId;
}
