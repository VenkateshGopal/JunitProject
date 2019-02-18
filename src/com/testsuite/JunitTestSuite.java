package com.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.testcases.MessageFailTestCase;
import com.testcases.MessageTestCase;
import com.testcases.TestEmployeeDetails;

import junit.framework.TestResult;
import junit.framework.TestSuite;


@RunWith(Suite.class)
@Suite.SuiteClasses({MessageTestCase.class, MessageFailTestCase.class})


public class JunitTestSuite {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * TestSuite suite = new
	 * TestSuite(MessageTestCase.class,TestEmployeeDetails.class); TestResult result
	 * = new TestResult(); suite.run(result);
	 * System.out.println("No of Test Cases :" + result.runCount());
	 * 
	 * // MessageFailTestCase.class
	 * 
	 * }
	 */

}
