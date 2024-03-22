package testcases_001;

import org.testng.annotations.Test;

import POM_Package.Login_POM;

public class test002Test extends Base_class {

	

	@Test( )
	public void test2() throws Exception {

try {		
		Login_POM log = new Login_POM(driver);
		log.setEmail(username);
		Thread.sleep(1000);
	
		log.setpass(Pass);
		Thread.sleep(1000);
	
		log.loginbtn();
		Thread.sleep(3000);
		
		 String url = driver.getCurrentUrl();
	     //System.out.println("Current URL: " + url);
	     
	    // String title = driver.getTitle();)
	    // System.out.println("Current URL: " + title);
	     
	     String title = driver.getTitle();
	    
	     try {
	    	 String expectedURl = "https://devic.elemprin.com/#/dashboard/v1";
		if(url.equals(expectedURl)){
			System.out.println("1st Test Case Passed: "+ "get correct URL");
		} else {
			  System.out.println("-------------------");
	        System.out.println("Test case failed: not get URL"); // Print failure message if URL doesn't match
	        System.out.println("Expected URL: "+expectedURl);
	        System.out.println("Current URL: " + url);
	        System.out.println("-------------------");
		}
	     }catch(Exception e) {
	    	 System.out.println(e);
	     }
		  try 
		  {
			  String ExpectedTitle ="GWC-Dashboard";
		if(title.equals(ExpectedTitle)){
			System.out.println("2nd Test Case Passed: " + "get correct Title");
		} else {
			  System.out.println("-------------------");
	        System.out.println("Test case failed: not get Title"); // Print failure message if URL doesn't match
	        System.out.println("Current Title: " +title);
	        System.out.println("Expected Title: " +ExpectedTitle);
	        
	        System.out.println("-------------------");
		}
		}
		  catch(Exception  e) {
			System.out.println(e);
		}
	
}catch(Exception e) {
	System.out.println(e);
}
}
		
		
	
	
	
	
}
