package com.example.demo.repo;

import com.example.demo.domain.SurveyRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurveyRecordRepo extends MongoRepository<SurveyRecord,Integer> {
}
