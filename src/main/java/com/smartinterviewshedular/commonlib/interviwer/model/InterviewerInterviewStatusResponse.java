package com.smartinterviewshedular.commonlib.interviwer.model;

import com.smartinterviewshedular.commonlib.interview.model.Interview;
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
