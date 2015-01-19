package com.github.elguardian.byteman.examples;

import static com.github.elguardian.byteman.examples.Constants.SCRIPT_DIR;
import junit.framework.Assert;

import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.elguardian.byteman.examples.BindingsClass;


@RunWith(BMUnitRunner.class)
public class BindingsExampleTest {
	
	@Test
	@BMScript(dir=SCRIPT_DIR, value="rules_bindings")
	public void test() throws Exception {
		BindingsClass bindingsClass = new BindingsClass();
		bindingsClass.setBool(Boolean.FALSE);
		Assert.assertTrue(true);
	}
	
}
