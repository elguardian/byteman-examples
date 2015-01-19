package com.github.elguardian.byteman.examples.threads;

public class SetVarRunnable implements Runnable {

	private String var;
	private Data data;

	public SetVarRunnable(Data data, String var) {
		this.data = data;
		this.var = var;
	}
	
	public void run() {
		data.setVar(var);		
	}
}
