package com.uarbekov.questionnaire.model;

import lombok.Data;

import java.util.List;

@Data
public class Question extends BaseModel{
    private String question;
    private Long questionnaireId;

    private Boolean hasOwnAnswer;
    private String ownAnswer;

    private Boolean hasSeveralCorrectAnswer;
    private List<Long> correctAnswers;
}
