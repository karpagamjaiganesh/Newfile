package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import baseUtil.baseClass;

public class loginObj extends baseClass {
	
	@FindBy(name = "txtUsername")
	@CacheLookup()
	static WebElement username;

	@FindBy(name = "txtPassword")
	@CacheLookup()
	static WebElement password;

	@FindBy(name = "Submit")
	@CacheLookup()
	static WebElement loginbtn;

	public static void enterUsername(String uname) {
		username.sendKeys(uname);

	}

	public static void enterpwd(String pwd) {
		password.sendKeys(pwd);
	}

	public static void loginbtn() {
		loginbtn.click();
	}

}
