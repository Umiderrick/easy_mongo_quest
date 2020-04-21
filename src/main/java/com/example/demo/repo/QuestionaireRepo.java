package com.example.demo.repo;

import com.example.demo.domain.Questionnaire;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionaireRepo extends MongoRepository<Questionnaire,Integer> {
}
