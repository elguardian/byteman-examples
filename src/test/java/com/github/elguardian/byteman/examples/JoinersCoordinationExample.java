package com.github.elguardian.byteman.examples;

import static com.github.elguardian.byteman.examples.Constants.SCRIPT_DIR;

import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.elguardian.byteman.examples.threads.ThreadsRaceCondition;

@RunWith(BMUnitRunner.class)
public class JoinersCoordinationExample {
	
	@Test
	@BMScript(dir = SCRIPT_DIR, value = "rules_joiners")
	public void test() {
		new ThreadsRaceCondition().start();
	}
}
