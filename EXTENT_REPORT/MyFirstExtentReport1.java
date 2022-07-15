// log level Demo Example

package com.extent.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyFirstExtentReport1 {

	public static void main(String[] args) {
		
        ExtentReports reports=new ExtentReports();
     
        ExtentSparkReporter spark=new ExtentSparkReporter("E:\\CoreJavaProjects\\Selenium-Demo\\test-output\\reports\\ExtentRep.html");
        
        reports.attachReporter(spark);
        
        reports.createTest("Test 1", "This is First Test Case").log(Status.INFO, "Info1")
         .log(Status.INFO, "Info1")
         .log(Status.FAIL, "Fail")
         .log(Status.PASS, "Pass 1")
         .log(Status.PASS, "Pass 2")
        .log(Status.WARNING, "Warning 1")
         .log(Status.WARNING, "Warning")
         .log(Status.SKIP, "Skip ");
         
        reports.flush();
        
	}

}
