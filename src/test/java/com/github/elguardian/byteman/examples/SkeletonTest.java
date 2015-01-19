package com.github.elguardian.byteman.examples;

import static com.github.elguardian.byteman.examples.Constants.SCRIPT_DIR;
import junit.framework.Assert;

import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.elguardian.byteman.examples.SimpleClass;


@RunWith(BMUnitRunner.class)
public class SkeletonTest {
	
	@Test
	@BMScript(dir=SCRIPT_DIR, value="skeleton")
	public void testSimpleTrace() throws Exception {
		SimpleClass simpleClass = new SimpleClass();
		simpleClass.tryOne();
		Assert.assertTrue(true);
	}
	
}
