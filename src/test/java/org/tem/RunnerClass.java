package org.tem;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(SampleProject.class, A.class, B.class);	
		System.out.println("Total testcase runtime:"+ rc.getRunTime());
		System.out.println("Total testcase runcount:"+ rc.getRunCount());
		System.out.println("Total testcase failed:"+ rc.getFailureCount());
		System.out.println("Ignore testcase:"+ rc.getIgnoreCount());
		List<Failure> f = rc.getFailures();
		for (Failure fails : f) {
			System.out.println(fails);
		}
		

}
}