package com.github.elguardian.byteman.examples;

import java.io.IOException;

public class SimpleClass {
	private String var;
	
	public SimpleClass() {
		var = "holaTryOne";
	}
	
	public void tryOne() throws Exception {
		System.out.println(var);
		String tmp = var;
		System.out.println(tmp);
		var = "writing";
		tryTwo(tmp);
	}
	
	public void tryTwo(String arg) throws IOException {
		System.out.println(arg);
	}
	
	public Object tryThree() {
		synchronized (this) {
			var = "my first sync block";
		}
		
		synchronized (this) {
			var = "my second sync block";
		}
		return null;
	}
	
	public void tryFour() throws Exception {
		throw new Exception();
	}
		
}
