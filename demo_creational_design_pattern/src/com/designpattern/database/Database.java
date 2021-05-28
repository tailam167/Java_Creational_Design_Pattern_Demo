package com.designpattern.database;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.entities.Animal;
import com.designpattern.handler.AnimalDAO;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Data Access Object (DTO)
 * 
 * @author taila
 *
 */
public class Database implements AnimalDAO {
	
	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();
	
	private List<Animal> animalList;

	public Database() {
		this.animalList = new ArrayList<>();
	}

	@Override
	public void insert(Animal animal) {
		animalList.add(animal);
		consoleLogger.writeInfor("<<Added new animal>>");
	}

	@Override
	public void remove(Animal animal) {
		consoleLogger.writeNotify("Removing...");
		animalList.remove(animal);
		consoleLogger.writeInfor("Removed --> " + animal);
	}

	@Override
	public List<Animal> getAnimals() {
		for (Animal animal : animalList) {
			System.out.println(animal);
		}
		return this.animalList;
	}

}
