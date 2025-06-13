package com.itic.intranet.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class EvaluationDetailedResponseDto {
    private Long id;
    private String title;
    private String description;
    private int minValue;
    private int maxValue;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private List<String> classrooms;
    private boolean finished;
    private LocalDateTime finishedAt;
}
