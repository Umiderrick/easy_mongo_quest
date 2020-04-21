package  com.example.demo.domain;

import org.springframework.data.annotation.Id;

/**
 * 问题的选项
 * 
 */
public class Item {

	@Id
	private int id;

	/**
	 * 单选 1、多选 2
	 */
	private int type;

	private String key;

	private String value;

	/**
	 * 分数
	 */
	private int mark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Item() {
	}

	public Item(int id, int type, String key, String value, int mark) {
		this.id = id;
		this.type = type;
		this.key = key;
		this.value = value;
		this.mark = mark;
	}
}
