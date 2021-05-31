package com.uarbekov.questionnaire.repository;

import com.uarbekov.questionnaire.model.Questionnaire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface QuestionnaireRepository {

    @Select("select nextval('seq_question_type_id')")
    Long nextId();

    void create(@Param("q") Questionnaire questionnaire);
}
