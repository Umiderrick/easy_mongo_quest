package  com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

/**
 * 问题库
 */
public class Question {

	@Id
	private int id;

	private String content;

	/**
	 * 题目类型
	 */
	private int type;

	/**
	 * 分数
	 */
	private int mark;

	private int valiFlag;

	private String remarks;

	private boolean specialFlag;

	//数据库存储只存Id
	private List<Integer> itemIds;

	//生成试卷过程中
	@Transient
	private List<Item> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getValiFlag() {
		return valiFlag;
	}

	public void setValiFlag(int valiFlag) {
		this.valiFlag = valiFlag;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isSpecialFlag() {
		return specialFlag;
	}

	public void setSpecialFlag(boolean specialFlag) {
		this.specialFlag = specialFlag;
	}

	public List<Integer> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<Integer> itemIds) {
		this.itemIds = itemIds;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
