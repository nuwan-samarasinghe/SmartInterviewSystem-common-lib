package com.smartinterviewshedular.commonlib.portalservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateInterviewStatus {
    private Integer id;
    @Nullable
    private Boolean isSelected;
    @Nullable
    private String position;
}
