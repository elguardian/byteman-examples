package com.github.elguardian.byteman.examples.threads;

public class ThreadsRaceCondition {

	
	public void start() {
		Data data = new Data();
		Thread a = new Thread(new SetVarRunnable(data, "A"));
		Thread b = new Thread(new SetVarRunnable(data, "B"));
		a.start();
		b.start();
		System.out.println(data.getVar());
	}
	
}
