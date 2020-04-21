package com.example.demo.repo;

import com.example.demo.domain.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepo extends MongoRepository<Question,Integer> {
}
