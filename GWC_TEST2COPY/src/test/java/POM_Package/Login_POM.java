package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {
	
	WebDriver  localdriver;
	
	public Login_POM(WebDriver remotedriver) {
	
	localdriver = remotedriver;
	PageFactory.initElements(remotedriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='loginFormEl']")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[1]")
	private WebElement login;
	
	@FindBy(how = How.XPATH, using = "//input[@class='p-inputtext p-component p-element gwc-input ng-pristine ng-invalid ng-touched']")
	private WebElement email2;
	
	public void setEmail(String EmailID) {
		email.sendKeys(EmailID);
	}
	
	public void setpass(String userpass) {
		password.sendKeys(userpass);
	}
	
	public void loginbtn() {
		login.click();
	}
	public void setEmail2(String EmailIDs) {
		email.sendKeys(EmailIDs);
	}
	
}