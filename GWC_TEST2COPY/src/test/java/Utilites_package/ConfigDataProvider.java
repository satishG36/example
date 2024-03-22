package Utilites_package;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties Pro;
	public ConfigDataProvider () {
		
		try {	
			
			
			String Path = "C:\\Users\\admin\\eclipse-workspace\\GWC_TEST001\\ConfigProperties\\ConfigData";
			File file = new File(Path);

			FileInputStream fis = new FileInputStream(file);
		
			Pro = new Properties();

			Pro.load(fis);
		
		}
		catch (Exception e) {
	
			System.out.println(e);
			
		}
		}
	public String getURL() {	
		return Pro.getProperty("URL");
	}
	
	public String getUsername() {
		return Pro.getProperty("Email");
	}
	public String getPass() {
		return Pro.getProperty("Password");
	}
	
	
}
