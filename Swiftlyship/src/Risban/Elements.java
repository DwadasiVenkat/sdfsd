package Risban;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements
{
	public static WebElement Login(WebDriver driver)
	{
		return driver.findElement(Locators.login_button);
	}
	public static WebElement User_name(WebDriver driver)
	{
		return driver.findElement(Locators.email_address);
	}
	public static WebElement Password(WebDriver driver)
	{
		return driver.findElement(Locators.Password);
	}
	public static WebElement Submit(WebDriver driver)
	{
		return driver.findElement(Locators.Submit_button);
	}
	public static WebElement Logo(WebDriver driver)
	{
		return driver.findElement(Locators.Logo);
	}
	public static WebElement From_Country(WebDriver driver)
	{
		return driver.findElement(Locators.From_Country);
	}
	public static WebElement From_Postcode(WebDriver driver)
	{
		return driver.findElement(Locators.From_Post);
	}
	public static WebElement From_state(WebDriver driver)
	{
		return driver.findElement(Locators.From_City);
	}
	public static WebElement To_Country(WebDriver driver)
	{
		return driver.findElement(Locators.To_Country);
	}
	public static WebElement To_Postcode(WebDriver driver)
	{
		return driver.findElement(Locators.To_Post);
	}
	public static WebElement To_City(WebDriver driver)
	{
		return driver.findElement(Locators.To_City);
	}
	public static WebElement Weight(WebDriver driver)
	{
		return driver.findElement(Locators.Weight);
	}
	public static WebElement Weight_Unit(WebDriver driver)
	{
		return driver.findElement(Locators.Weight_Unit);
	}
	public static WebElement Length(WebDriver driver)
	{
		return driver.findElement(Locators.Length);
	}
	public static WebElement Length_Unit(WebDriver driver)
	{
		return driver.findElement(Locators.Lenght_Unit);
	}
	public static WebElement Width(WebDriver driver)
	{
		return driver.findElement(Locators.Width);
	}
	public static WebElement Width_Unit(WebDriver driver)
	{
		return driver.findElement(Locators.Width_Unit);
	}
	public static WebElement Height(WebDriver driver)
	{
		return driver.findElement(Locators.Height);
	}
	public static WebElement Height_Unit(WebDriver driver)
	{
		return driver.findElement(Locators.Height_Unit);
	}
	public static WebElement Click_Printer(WebDriver driver)
	{
		return driver.findElement(Locators.Printer);
	}
	public static WebElement Quote_me(WebDriver driver)
	{
		return driver.findElement(Locators.Quote_me);
	}
	public static WebElement Book_Quote(WebDriver driver)
	{
		return driver.findElement(Locators.Book);
	}
	public static WebElement Sender_First_Name(WebDriver driver)
	{
		return driver.findElement(Locators.S_Fname);
	}
	public static WebElement Sender_Lastname(WebDriver driver)
	{
		return driver.findElement(Locators.S_Lname);
	}
	public static WebElement Sender_email(WebDriver driver)
	{
		return driver.findElement(Locators.S_Email);
	}
	public static WebElement Sender_Phone(WebDriver driver)
	{
		return driver.findElement(Locators.S_Phone);
	}
	public static WebElement Sender_postal(WebDriver driver)
	{
		return driver.findElement(Locators.S_Postcode);
	}
	public static WebElement Sender_Add1(WebDriver driver)
	{
		return driver.findElement(Locators.S_Address1);
	}
	public static WebElement Sender_Add2(WebDriver driver)
	{
		return driver.findElement(Locators.S_Address2);
	}
	public static WebElement Sender_City(WebDriver driver)
	{
		return driver.findElement(Locators.S_City);
	}
	public static WebElement Sender_State(WebDriver driver)
	{
		return driver.findElement(Locators.S_State);
	}
	public static WebElement Sender_Post(WebDriver driver)
	{
		return driver.findElement(Locators.S_Post_code);
	}
	
	
	
	
	public static WebElement Receiver_First_Name(WebDriver driver)
	{
		return driver.findElement(Locators.R_Fname);
	}
	public static WebElement Receiver_Lastname(WebDriver driver)
	{
		return driver.findElement(Locators.R_Lname);
	}
	public static WebElement Receiver_email(WebDriver driver)
	{
		return driver.findElement(Locators.R_Email);
	}
	public static WebElement Receiver_Phone(WebDriver driver)
	{
		return driver.findElement(Locators.R_Phone);
	}
	public static WebElement Receiver_postal(WebDriver driver)
	{
		return driver.findElement(Locators.R_Postcode);
	}
	public static WebElement Receiver_Add1(WebDriver driver)
	{
		return driver.findElement(Locators.R_Address1);
	}
	public static WebElement Receiver_Add2(WebDriver driver)
	{
		return driver.findElement(Locators.R_Address2);
	}
	public static WebElement Receiver_City(WebDriver driver)
	{
		return driver.findElement(Locators.R_City);
	}
	public static WebElement Receiver_State(WebDriver driver)
	{
		return driver.findElement(Locators.R_State);
	}
	public static WebElement Receiver_Post(WebDriver driver)
	{
		return driver.findElement(Locators.R_Postcode);
	}
	
	public static WebElement Next_Buttom(WebDriver driver)
	{
		return driver.findElement(Locators.Next);
	}
}
