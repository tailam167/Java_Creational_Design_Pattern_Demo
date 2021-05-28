package com.designpattern.entities;

/**
 * Apply Data Access Object (DTO)
 * 
 * @author taila
 *
 */
public class Animal {

	private String name;
	private String type;
	private String gender;
	private int age;

	public Animal(String name, String type, String gender, int age) {
		this.name = name;
		this.type = type;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal: [name = " + name + "," + " type = " + type + "," + " gender = " + gender + "," + " age = " + age
				+ "]";
	}
}
