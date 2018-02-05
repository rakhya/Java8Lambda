package com.rakhya.gsu.java8lambda;

public class Animal {

	private String name;
	private String type;
	private int weight;
	
	public Animal(String name, String type, int weight) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", weight=" + weight + "]";
	}
	
	
}
