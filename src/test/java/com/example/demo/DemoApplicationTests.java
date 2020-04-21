package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.*;
import com.example.demo.manager.QuestionManager;
import com.example.demo.repo.ItemRepo;
import com.example.demo.repo.QuestionRepo;
import com.example.demo.repo.QuestionaireRepo;
import net.minidev.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {


    @Autowired
    QuestionaireRepo questionaireRepo;

    @Test
    public void testQuestionaire() {
        Questionnaire questionnaire =new Questionnaire();
        questionnaire.setId(1);
        questionnaire.setName("中考语文第一次模拟考试");
        questionnaire.setSubject("海淀区");
        questionnaire.setType(1);
        ArrayList<QuestionBean> questionBeans = new ArrayList<>();
        QuestionBean firstBean = new QuestionBean();
        firstBean.setOrderNo("第一大题");
        firstBean.setTitle("听力");
        Optional<Question> q1 = questionRepo.findById(1);
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(q1.get());
        firstBean.setChildren(questions);
        questionBeans.add(firstBean);
        QuestionBean secondBean =new QuestionBean();
        secondBean.setOrderNo("第二大题");
        secondBean.setTitle("填空");
        Optional<Question> q2 = questionRepo.findById(2);
        ArrayList<Question> questions2 = new ArrayList<>();
        questions2.add(q2.get());
        secondBean.setChildren(questions2);
        questionBeans.add(secondBean);
        questionnaire.setQuestionBean(questionBeans);
        questionaireRepo.save(questionnaire);
        System.err.println(questionaireRepo.findAll().size());
    }

    @Autowired
    ItemRepo itemRepo;
    @Test
    public void testItemSave() {
        Item itemA =new Item(1,1,"A","北京",4);
        Item itemB =new Item(2,1,"B","上海",0);
        Item itemC =new Item(3,1,"C","广州",0);
        Item itemD =new Item(4,1,"D","成都",0);
        List<Item> items = Arrays.asList(itemA, itemB, itemC, itemD);
        itemRepo.saveAll(items);

    }

    @Autowired
    QuestionRepo questionRepo;
    @Test
    public void testQuestionSave() {
        List<Item> typeOne = itemRepo.findByType(1);
        Question question =new Question();
        question.setContent("中国的首都是哪里");
        question.setId(3);
        question.setItemIds(typeOne.stream().map(Item::getId).collect(Collectors.toList()));
        question.setItems(typeOne);
        question.setMark(4);
        question.setSpecialFlag(false);
        question.setType(1);
//        Question question =new Question();
//        question.setContent("最喜欢的护肤品品牌");
//        question.setId(2);
//        question.setMark(5);
//        question.setSpecialFlag(true);
//        question.setType(2);
        questionRepo.save(question);
        System.err.println(JSON.toJSONString(question));
    }

    @Autowired
    QuestionManager questionManager;
    @Test
    public void testAnswer() {
        List<Answer> answers =new ArrayList<>();
        Answer a =new Answer(1,"1",QustionTypeEnum.OPT);
        Answer b =new Answer(2,"海蓝之谜",QustionTypeEnum.TEXT);
        answers.add(a);
        answers.add(b);
        SurveyRecord surveyRecord = questionManager.doAnswer(answers,"LS","18610915534");
        System.err.println(JSON.toJSONString(surveyRecord));
    }
}
