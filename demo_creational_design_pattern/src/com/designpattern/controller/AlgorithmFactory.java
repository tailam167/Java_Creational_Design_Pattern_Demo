package com.designpattern.controller;

import com.designpattern.entities.DefaultPath;
import com.designpattern.entities.ShortessPath;
import com.designpattern.entities.SpanningTree;
import com.designpattern.handler.AlgorithmFactoryInterface;

/**
 * Apply Factory Pattern
 * 
 * @author taila
 *
 */
public class AlgorithmFactory {

	public static final int SHORTESS_PATH = -1;
	public static final int DEFAULT_VALUE = 0;
	public static final int SPANNING_TREE = 1;

	public static AlgorithmFactoryInterface createAlgorithm(int type) {

		switch (type) {
		case SHORTESS_PATH:
			return new ShortessPath();
		case SPANNING_TREE:
			return new SpanningTree();
		default:
			return new DefaultPath();
		}
		
	}
}
