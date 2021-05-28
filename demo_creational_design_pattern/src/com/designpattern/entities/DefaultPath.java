package com.designpattern.entities;

import com.designpattern.handler.AlgorithmFactoryInterface;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Factory Pattern
 * 
 * @author taila
 *
 */
public class DefaultPath implements AlgorithmFactoryInterface {
	
	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void solve() {
		consoleLogger.writeNotify("Solving The Default Path...");
	}

}
