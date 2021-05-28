package com.designpattern.entities;

import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Singleton Pattern
 * 
 * @author taila
 *
 */
public class Downloader {
	
	private ConsoleLogger consoleLogger = new ConsoleLogger();
	
	// Eager version
	private static Downloader downloader;

	private Downloader() {
		
	}
	
	public void startDownloading() {
		consoleLogger.writeNotify(String.valueOf("Dowloading data from the web..."));
	}
	
	// Lazy version
	public static Downloader getInstance() {
		
		if (downloader == null) {
			downloader = new Downloader();
		}
		return Downloader.downloader;
	}
}
