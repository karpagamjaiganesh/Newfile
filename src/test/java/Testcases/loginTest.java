package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtil.baseClass;
import commonUtils.loginTestdata;
import pageObjects.loginObj;

public class loginTest extends baseClass{
	
	@Test(dataProviderClass=loginTestdata.class,dataProvider="logindata")
	public static void login(String username, String password) throws InterruptedException
	{
		
		PageFactory.initElements(driver,loginObj.class );
		loginObj loginobj = new loginObj();
        loginobj.enterUsername(username);
		loginobj.enterpwd(password);
		loginobj.loginbtn();
		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String expected = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	//	Assert.assertEquals(actual, expected);
		
	}
	
	

}
