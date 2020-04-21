package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Objects;

/**
 * 问卷
 */
public class Questionnaire {

	@Id
	private int id;

	private String name;

	private String subject;

	private int type;

	private List<QuestionBean> questionBean;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<QuestionBean> getQuestionBean() {
		return questionBean;
	}

	public void setQuestionBean(List<QuestionBean> questionBean) {
		this.questionBean = questionBean;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Questionnaire that = (Questionnaire) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Questionnaire{" +
				"id=" + id +
				", name='" + name + '\'' +
				", subject='" + subject + '\'' +
				", type=" + type +
				", questionBean=" + questionBean +
				'}';
	}
}
