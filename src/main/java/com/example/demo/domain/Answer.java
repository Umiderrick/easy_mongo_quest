package com.example.demo.domain;

import java.util.List;

public class Answer {


	private int questionId;

	private String value;

	/**
	 * 答案内容类型：文本、选项、图片、网页链接
	 */
	private QustionTypeEnum type;

	/**
	 * 如果是图片链接，允许有多个URLS
	 * 
	 */
	private List<String> urls;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public QustionTypeEnum getType() {
		return type;
	}

	public void setType(QustionTypeEnum type) {
		this.type = type;
	}

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public Answer() {
	}

	public Answer(int questionId, String value, QustionTypeEnum type) {
		this.questionId = questionId;
		this.value = value;
		this.type = type;
	}
}
