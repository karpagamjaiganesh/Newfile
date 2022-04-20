package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseUtil.baseClass;

public class homePageObjects extends baseClass {

	@FindBy(partialLinkText ="Home")
	@CacheLookup
	static WebElement homebtn;
	
	@FindAll({
	@FindBy(id="hotels_city")})
	@CacheLookup
	static WebElement selectcity;
	
	public static void homelink()
	{
		homebtn.click();
		
	}

	public static void selectCity()
	{
		
		Select sel = new Select(selectcity);
		List<WebElement> cities = sel.getOptions();
		System.out.println("no of cities "+cities.size());
		/*for (int i = 0; i <cities.size(); i++) {
			String citynames =cities.get(i).getText();
			System.out.println(citynames);
		} */
		}
	
	
}
