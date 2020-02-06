package br.com.resinet.hub_tdd.Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report {

    private static ExtentReports extent;
    private static ExtentTest test;

 

    public static void iniciaReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/ExtentScreenshot.html", true);
    }

 

    public static void fechaReport() {
        extent.flush();
    }

 

    public static ExtentTest getTest() {
        return test;
    }

 

    public static ExtentReports getExtent() {
        return extent;
    }
}