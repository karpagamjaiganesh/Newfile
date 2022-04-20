package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseUtil.baseClass;

public class verifyTitle extends baseClass {
	
	@Test(priority=2)
	public static void titleverify()
	{
		String expected ="Login - PHPTRAVELS";
		String actual =driver.getTitle();
		System.out.println("Title is"+ actual);
		//Assert.assertEquals(actual, expected);
	}

}
