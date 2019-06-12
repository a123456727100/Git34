package com.lazysingleton;

public class EagerSingleton {
		
	private static EagerSingleton intance = new EagerSingleton();
	
	private  EagerSingleton() {};
	
	public static EagerSingleton getintance() {
		
		return intance ;
	}

}
