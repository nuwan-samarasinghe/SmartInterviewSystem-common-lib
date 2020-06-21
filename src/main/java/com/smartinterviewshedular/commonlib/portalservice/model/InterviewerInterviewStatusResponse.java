package com.smartinterviewshedular.commonlib.portalservice.model;

import com.smartinterviewshedular.commonlib.portalservice.model.Interview;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewerInterviewStatusResponse {
    @Nullable
    private String status;
    @Nullable
    private Interviewer interviewer;
    @Nullable
    private Interview interview;
}
