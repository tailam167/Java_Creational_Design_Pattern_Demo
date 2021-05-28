package com.designpattern.entities;

/**
 * Apply Builder Pattern
 * 
 * @author taila
 *
 */
public class Person {

	private String name;
	private String email;
	private String address;
	private int age;
	private String university;

	public Person(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.age = builder.age;
		this.university = builder.university;
	}

	public static class Builder {

		private final String name;
		private final String email;
		private String address;
		private String university;
		private int age;

		public Builder(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setUniversity(String university) {
			this.university = university;
			return this;
		}

		public Person buildPerson() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person: [name = " + this.name + ", " + "email = " + this.email + ", " + "address = " + this.address
				+ ", age = " + this.age + ", university = " + this.university + "]";
	}

}
