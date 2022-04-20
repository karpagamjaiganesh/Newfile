package commonUtils;

import org.testng.annotations.DataProvider;

public class loginTestdata {
	
	@DataProvider(name ="logindata")
	public static String[][] getdata()
	{
		String[][] data={{"Admin","admin123"}};
		//{"user@gmail.com","test123"},
		//{"user123@gmail.com","test456"}};
		return data;
		
	
		}

}
