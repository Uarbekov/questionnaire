package com.uarbekov.questionnaire.service;

import com.uarbekov.questionnaire.model.Questionnaire;
import com.uarbekov.questionnaire.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionnaireService {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public Questionnaire create(Questionnaire questionnaire) {
        Long id = questionnaireRepository.nextId();
        questionnaire.setId(id);
        questionnaireRepository.create(questionnaire);
        return questionnaire;
    }
}
