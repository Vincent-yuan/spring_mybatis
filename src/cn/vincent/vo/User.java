package cn.vincent.vo;

import java.io.Serializable;

public class User implements Serializable {

	private int id;
	private String name;
	private int age;
	private int rileId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRileId() {
		return rileId;
	}
	public void setRileId(int rileId) {
		this.rileId = rileId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", rileId=" + rileId + "]";
	}
	
	
}
