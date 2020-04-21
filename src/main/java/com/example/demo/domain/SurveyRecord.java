package com.example.demo.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 问卷调查的记录
 */
public class SurveyRecord implements Serializable {


	public static final byte ENABLE= 1;
	public static final byte DISABLE= 0;

	private int id;

	private int questionnaireId;

	private String userId;

	private long surveyTime;

	private String orgCode;

	private int status;

	private String type;

	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionnaireId() {
		return questionnaireId;
	}

	public void setQuestionnaireId(int questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getSurveyTime() {
		return surveyTime;
	}

	public void setSurveyTime(long surveyTime) {
		this.surveyTime = surveyTime;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
