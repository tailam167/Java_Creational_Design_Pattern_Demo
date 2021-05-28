package com.designpattern.handler;

import java.util.List;

import com.designpattern.entities.Animal;

/**
 * Apply Data Access Object (DTO)
 * 
 * @author taila
 *
 */
public interface AnimalDAO {
	public void insert(Animal animal);
	public void remove(Animal animal);
	public List<Animal> getAnimals();
}
