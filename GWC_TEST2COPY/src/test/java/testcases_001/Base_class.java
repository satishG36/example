package testcases_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilites_package.ConfigDataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	WebDriver driver;
	
	ConfigDataProvider data =  new ConfigDataProvider();
	
	String url = data.getURL();
	String username = data.getUsername();
	String Pass  = data.getPass();
	
	@Parameters("browser")

	@BeforeClass
	public void launchBrowser(@Optional("chrome")String browser) throws Exception 
	{
		
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
