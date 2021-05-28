package com.designpattern.entities;

/**
 * Apply Singleton Pattern
 * 
 * @author taila
 *
 */
public enum SingletonClass {
	
	INSTANCE;
	
	private int counter;

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
