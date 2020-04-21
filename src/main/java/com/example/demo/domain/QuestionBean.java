package  com.example.demo.domain;

import java.util.List;

/**
 * 不存在数据库
 * 描述1个Question在Questionnaire中的关系
 * 大题目或者题干{}
 * 子题目列表[{},{}]
 */
public class QuestionBean {

	/**
	 * 题号 如:第一题听力
	 * 题号 如:第一题 第一小题 看图答题
	 */

	private String orderNo;

	private String title;

	private Question question;

	private List<Question> children;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public List<Question> getChildren() {
		return children;
	}

	public void setChildren(List<Question> children) {
		this.children = children;
	}
}
