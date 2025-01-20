package com.example.app8;

import java.util.ArrayList;

public class Person {
	private String firstName;
	private int age;
	private Double weight;
	private ArrayList<Integer> list;
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

}
