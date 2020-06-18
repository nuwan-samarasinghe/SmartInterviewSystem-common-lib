package com.smartinterviewshedular.commonlib.interviwer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewerInterviewStatus {
    private Integer id;
    @Nullable
    private String status;
}
