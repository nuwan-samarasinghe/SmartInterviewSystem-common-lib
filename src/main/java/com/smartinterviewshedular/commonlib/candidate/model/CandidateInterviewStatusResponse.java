package com.smartinterviewshedular.commonlib.candidate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import com.smartinterviewshedular.commonlib.interview.model.Interview;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateInterviewStatusResponse {
    @Nullable
    private Boolean isSelected;
    @Nullable
    private String position;
    @Nullable
    private Candidate candidate;
    @Nullable
    private Interview interview;
}
