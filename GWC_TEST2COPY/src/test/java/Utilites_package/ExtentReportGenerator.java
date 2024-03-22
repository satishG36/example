package Utilites_package;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {


	public static ExtentReports generateReport() {
		
		
		String Reportpath  = "C:\\Users\\admin\\eclipse-workspace\\GWC_TEST001\\TestReports\\GWC_report";
		
		ExtentSparkReporter repoter = new ExtentSparkReporter(Reportpath);
		
		repoter.config().setDocumentTitle("GWC_WEB_Aplication");
		
		repoter.config().setReportName("Login_GWC");
		
		repoter.config().setTheme(Theme.DARK);
		
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(repoter);
		
		extent.setSystemInfo("Aplication type", "WEB_APPLICATION"); 
		
		extent.setSystemInfo("application name", "GWC_WIFI");
		
		extent.setSystemInfo("Browser","Chrome browser");
		
		extent.setSystemInfo("QA","SATISH GAWARE");
		
		extent.setSystemInfo("OS", "Windows");
		
		return extent;
		

	}
	
}
