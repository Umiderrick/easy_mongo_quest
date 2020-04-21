package com.example.demo.manager;

import com.example.demo.domain.Answer;
import com.example.demo.domain.Questionnaire;
import com.example.demo.domain.SurveyRecord;
import com.example.demo.repo.QuestionaireRepo;
import com.example.demo.repo.SurveyRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.demo.domain.SurveyRecord.ENABLE;

@Service
public class QuestionManager {

    @Autowired
    private QuestionaireRepo questionaireRepo;
    @Autowired
    private SurveyRecordRepo surveyRecordRepo;


    /* 通过Id生成整套问卷信息*/
    public Questionnaire generate(int id){
        Optional<Questionnaire> qustOpt=  questionaireRepo.findById(id);
        if(qustOpt.isPresent()){
            Questionnaire questionnaire = qustOpt.get();
            return questionnaire;
        }
       return null;
    }



    //@Todo: 待确认是否一个请求完成所有题目答案
    public SurveyRecord doAnswer(List<Answer> answerList,String orgCode,String userId){
        SurveyRecord surveyRecord = new SurveyRecord();
        //@Todo: 主键生成器?
        surveyRecord.setQuestionnaireId(1);
        surveyRecord.setOrgCode(orgCode);
        surveyRecord.setUserId(userId);
        surveyRecord.setStatus(ENABLE);
        surveyRecord.setAnswers(answerList);
        return surveyRecordRepo.save(surveyRecord);
    }


}
