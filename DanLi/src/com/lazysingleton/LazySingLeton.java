package com.lazysingleton;

public class LazySingLeton {
	
	private static LazySingLeton intance = null ;
	
	private LazySingLeton() {};
	
	public static LazySingLeton getintance() {
		if(intance == null) {
			synchronized (intance) {
				if(intance == null) {
					intance = new LazySingLeton();
				}
			}
		}
		return intance ;
	}

}
