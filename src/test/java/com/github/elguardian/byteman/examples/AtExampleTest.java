package com.github.elguardian.byteman.examples;

import static com.github.elguardian.byteman.examples.Constants.SCRIPT_DIR;
import junit.framework.Assert;

import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.elguardian.byteman.examples.SimpleClass;


@RunWith(BMUnitRunner.class)
public class AtExampleTest {
	
	@Test(expected=Exception.class)
	@BMScript(dir=SCRIPT_DIR, value="rules_at")
	public void test() throws Exception {
		SimpleClass simpleClass = new SimpleClass();
		simpleClass.tryOne();
		simpleClass.tryTwo("my arguments");
		simpleClass.tryThree();
		simpleClass.tryFour();
		Assert.assertTrue(true);
	}
	
}
