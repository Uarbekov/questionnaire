package com.uarbekov.questionnaire.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseModel {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long createdBy;
    private Long updatedBy;
}
