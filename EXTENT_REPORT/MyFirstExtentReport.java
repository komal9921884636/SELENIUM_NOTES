package com.extent.reports;

import javax.swing.DesktopManager;
import javax.swing.plaf.DesktopIconUI;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyFirstExtentReport {

	public static void main(String[] args) {
		
        ExtentReports reports=new ExtentReports();
     
        ExtentSparkReporter spark=new ExtentSparkReporter("E:\\CoreJavaProjects\\Selenium-Demo\\test-output\\reports\\ExtentRep.html");
        
        reports.attachReporter(spark);
        
        ExtentTest test1= reports.createTest("Test 1", "This is First Test Case");
        test1.pass("Test 1 is passed");
        
        ExtentTest test2= reports.createTest("Test 2", "This is second Test Case");
        test2.fail("Test 2 is failed");
        
        reports.createTest("Test 3", "This is second Test Case").log(Status.WARNING, "Warning message");
        
        reports.createTest("Test 4", "This is second Test Case").info("Info Message for Test 4 ");
        
        reports.flush();
        
	}

}
