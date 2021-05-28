package com.designpattern;

import com.designpattern.controller.AlgorithmFactory;
import com.designpattern.entities.Downloader;
import com.designpattern.entities.SingletonClass;
import com.designpattern.handler.AlgorithmFactoryInterface;
import com.designpattern.logger.ConsoleLogger;

/**
 * Demo Apply Creational Design Pattern
 * 
 * @author taila
 *
 */
public class App {

	public static void main(String[] args) {

		// Create Logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeInfor("<CREATIONAL DESIGN PATTERN>");

		/**
		 * Apply Singleton Pattern: restricts the instantiation of a class to one
		 * object. This is useful when exactly one object is needed to coordinate
		 * actions across the system
		 */
		System.out.println("Singleton Pattern Part I");
		Downloader downloader1 = Downloader.getInstance();
		downloader1.startDownloading();

		Downloader downloader2 = Downloader.getInstance();
		downloader2.startDownloading();

		System.out.println("Singleton Pattern Part II");
		SingletonClass.INSTANCE.setCounter(10);
		consoleLogger.writeNotify(String.valueOf(SingletonClass.INSTANCE.getCounter()));

		/**
		 * Apply Factory Pattern: help to create loosely coupled. Should not program to
		 * an implementation. Should program to an interface but every time we use 'new'
		 * keyword we do so. Instantiating a class that is definitely an implementation.
		 * Typing out code to a concrete class means that make our application more
		 * fragile and less flexible. If we program to an interface, our system will
		 * work for any class implementing that interface (polymorphism). Help our code
		 * to avoid closed for modification. Should separate the part in our code that
		 * will change. Have to encapsulate object creation.
		 */
		AlgorithmFactoryInterface algorithmFactoryInterface1 = AlgorithmFactory
				.createAlgorithm(AlgorithmFactory.SHORTESS_PATH);
		algorithmFactoryInterface1.solve();
		System.out.println("Completed Algorithm 1: " + algorithmFactoryInterface1);

		AlgorithmFactoryInterface algorithmFactoryInterface2 = AlgorithmFactory
				.createAlgorithm(AlgorithmFactory.SPANNING_TREE);
		algorithmFactoryInterface2.solve();
		System.out.println("Completed Algorithm 2: " + algorithmFactoryInterface2);

		AlgorithmFactoryInterface algorithmFactoryInterface3 = AlgorithmFactory.createAlgorithm(2);
		algorithmFactoryInterface3.solve();
		System.out.println("Completed Algorithm 3: " + algorithmFactoryInterface3);

		/**
		 * Apply Builder Pattern: Should apply for resolving problem that relates to
		 * lots of parameters, hard to follow and hard not to confuse parameters. Help
		 * to be not extensible means that when we have to add one more optional
		 * parameters, we have to create a new constructor --> Telescoping constructor
		 * appear. Could be immutable property means that we should consider parallel
		 * execution. The best is to use objects that can not be modified after they
		 * have been created "immutable objects" --> so there will not be any problems
		 * because of concurrent updates by multiple threads
		 */
		

		/**
		 * Apply Data Access Object (DTO) Pattern:
		 * 
		 */
	}
}
