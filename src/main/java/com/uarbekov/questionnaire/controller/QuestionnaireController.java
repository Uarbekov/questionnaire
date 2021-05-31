package com.uarbekov.questionnaire.controller;

import com.uarbekov.questionnaire.model.Questionnaire;
import com.uarbekov.questionnaire.questionnaire.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.ok("salam");
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Questionnaire questionnaire) {
        return ResponseEntity.ok(service.create(questionnaire));
    }
}
