package Risban;

import org.openqa.selenium.By;

public class Locators 
{
	//Login Button
	public static By login_button=By.xpath("//a[contains(.,'login')]");
	
	//Login Details
	public static By email_address=By.xpath("//input[@class='required email']");
	public static By Password=By.xpath("//input[@name='pwd']");
	public static By Submit_button=By.xpath("//input[@name='submit']");
	
	//Clicking on the logo for getting into the homepage
	public static By Logo=By.xpath("//img[@src='http://risbanltd.neowebservices.co.uk/themes/risban/images/logo.png']");
	
	//Customer address
	
	public static By From_Country=By.xpath(".//*[@id='homesearch']/div[2]/div[1]/div/select");
	public static By From_Post=By.xpath("//input[@placeholder='Post Code']");
	public static By From_City=By.xpath("//input[@name='from_city']");
	public static By To_Country=By.xpath("//input[@class='select2-input select2-focused']");
	public static By To_Post=By.xpath("//input[@name='to']");
	public static By To_City=By.xpath("//input[@name='to_city']");
	
	//Parcel Details
	
	public static By Weight=By.xpath("//input[@name='weight[]']");
	public static By Weight_Unit=By.xpath("//select[@name='weightunits']");
	public static By Length=By.xpath("//input[@name='length[]']");
	public static By Lenght_Unit=By.xpath("//select[@name='lengthunits']");
	public static By Width=By.xpath("//input[@name='width[]']");
	public static By Width_Unit=By.xpath("//select[@name='widthunits']");
	public static By Height=By.xpath("//input[@name='height[]']");
	public static By Height_Unit=By.xpath("//select[@name='heights']");
	
	
	//Click on Printer
	public static By Printer=By.xpath("//input[@name='printer']");
	
	//Click on Quote me
	public static By Quote_me=By.xpath("//input[@value='Quote Me']");
	
	//Booking
	public static By Book=By.xpath("//button[@class='bookquote']");
	
	//Sender Details
	public static By S_Fname=By.xpath("//input[@name='sender_firstname']");
	public static By S_Lname=By.xpath("//input[@name='sender_lastname']");
	public static By S_Email=By.xpath("//input[@name='sender_email']");
	public static By S_Phone=By.xpath("//input[@name='sender_mobile']");
	public static By S_Landline=By.xpath("//input[@name='sender_landline']");
	public static By S_Postcode=By.xpath("//input[@id='sourceaddress']");
	public static By S_Address1=By.xpath("//input[@id='sender_addressline1']");
	public static By S_Address2=By.xpath("//input[@id='sender_addressline2']");
	public static By S_City=By.xpath("//input[@id='sender_city']");
	public static By S_State=By.xpath("//input[@id='sender_county']");
	public static By S_Post_code=By.xpath("//input[@id='sender_postcode']");
	public static By R_Fname=By.xpath("//input[@name='receiver_firstname']");
	public static By R_Lname=By.xpath("//input[@name='receiver_lastname']");
	public static By R_Email=By.xpath("//input[@name='receiver_email']");
	public static By R_Phone=By.xpath("//input[@name='receiver_mobile']");
	public static By R_Landline=By.xpath("//input[@name='receiver_landline']");
	public static By R_Address1=By.xpath("//input[@id='receiver_addressline1']");
	public static By R_Address2=By.xpath("//input[@id='receiver_addressline2']");
	public static By R_City=By.xpath("//input[@id='receiver_city']");
	public static By R_State=By.xpath("//input[@id='receiver_county']");
	public static By R_Postcode=By.xpath("//input[@id='receiver_postcode']");
	
	//Click on next button
	public static By Next=By.xpath("//button[@class='next']");
	

	
	
	
	

}
