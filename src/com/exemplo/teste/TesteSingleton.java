package com.exemplo.teste;

import com.exemplo.model.Singleton;

public class TesteSingleton {
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		//Memory Address
		System.out.println(instance1);
		System.out.println(instance2);
		
		//Count Value
		System.out.println(instance1.getCount());
		System.out.println(instance2.getCount());
		
	}
}
