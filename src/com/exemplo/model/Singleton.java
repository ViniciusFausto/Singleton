package com.exemplo.model;

public class Singleton {
	private static Singleton instance;
	private static int count = 0;
	
	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		count++;
		return instance;
	}
	
	public int getCount() {
		return count;
	}

}
