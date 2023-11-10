package com.example.ssurvey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ssurvey.domain.Survey;
import com.example.ssurvey.repository.SurveyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;
    
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }
    
    public Survey getSurveyById(Integer surveyNo) {
        Optional<Survey> optionalSurvey = surveyRepository.findById(surveyNo);
        return optionalSurvey.orElse(null);
    }
    
//    public List<Survey> getSurveysByCategory(String category) {
//        return surveyRepository.findBySurveyCategory(category);
//    }
    
}
