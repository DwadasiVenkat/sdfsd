package Risban;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class NewTest 
{
	public static WebDriver driver;
	
	
	@BeforeSuite
	  public void Browser() 
	  {
		  Repositry.Browser_launch();
		  Reporter.log("Browser launched successfuly");
		  
	  }
	
	@Test(priority=0)
		public void Login()
	{
		Repositry.Login();
		Repositry.Login_Button();
		Repositry.Homepage_Verification(); 
	}
	
	@Test(priority=1)
		public void details() throws Exception
		{
//		Thread.sleep(1024);
			Repositry.From_Details();
		}
 
  
 
}
