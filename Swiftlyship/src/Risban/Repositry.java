package Risban;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.swing.plaf.metal.OceanTheme;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
public class Repositry
{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;
	public static XSSFCell Cell;
	public static XSSFRow Row;
	public static void Browser_launch()
	
	{
		driver=new FirefoxDriver();
		driver.get(Inputdata.url);
		driver.manage().window().maximize();
	}
	
	public static void textbox(WebElement xpath,String inputdata)
	{
		
		if (((WebElement) xpath).isDisplayed() && ((WebElement) xpath).isEnabled()) 
		{
		((WebElement) xpath).clear();
		((WebElement) xpath).sendKeys(inputdata);	
		}
		else 
		{
			System.out.println("no object found");
		}
	}
	
	
	
	public static void button(WebElement text)
	{
		if (((WebElement) text).isDisplayed() && ((WebElement) text).isEnabled()) 
		{
			((WebElement) text).click();
			Reporter.log("Button verified");
		}
	}
	
	public static void page_verification(String url,String title,String pagesource)
	{
		String Actual_url=driver.getCurrentUrl();
		String Actual_title=driver.getTitle();
		String Actuall_pagesource=driver.getPageSource();
		if (Actual_url.equals(url)) 
		{
			Reporter.log("Page URL verified successfully");
			if (Actual_title.contains(title)) 
			{
				Reporter.log("page title verified successfuly");
				if (Actuall_pagesource.contains(pagesource)) 
				{
					Reporter.log("Page source verified successfully");
				} else 
				{
					Reporter.log("Page sorce not verified");
				}
				
			}
			else 
			{
				Reporter.log("page title not verified");
			}
		}
		else 
		{
			Reporter.log("Page URL not verified");
		}
	}
	public static void Homepage_Verification()
	{
		Elements.Logo(driver).click();
		page_verification(Inputdata.url, Inputdata.Mainpage_Title, Inputdata.Page_source);
	}
	
	
	public static void Login()
	{
		Elements.Login(driver).click();
		textbox(Elements.User_name(driver), Inputdata.User_Name);
		textbox(Elements.Password(driver), Inputdata.Password);
//		setExcelFile("D:\\Sastry Workspace\\Swiftlyship\\Data and Report.xlsx","Sheet1");
//		setCellData("Username and password verified successfully", 1, 1);
	}
	
	public static void Login_Button()
	{

		Repositry.button(Elements.Submit(driver));
		
	
	}
	
	public static void dropdown(WebElement box,String data)
	{
		Select select=new Select((WebElement) box);
		box.click();
		select.selectByValue((String) data);
	}
	
	public static void From_Details() throws Exception
	{
		wait=new WebDriverWait(driver, 25);
		Select sel=new Select(Elements.From_Country(driver));
		sel.selectByVisibleText(Inputdata.F_Country);
		textbox(Elements.From_Postcode(driver), Inputdata.F_Postal);
		textbox(Elements.From_state(driver), Inputdata.F_State);
	}
	
	public static void To_Details()
	{
		Select select=new Select(Elements.To_Country(driver));
		select.selectByVisibleText(Inputdata.T_Country);
		textbox(Elements.To_Postcode(driver), Inputdata.T_Postal);
		textbox(Elements.To_City(driver), Inputdata.T_State);
	}
	
	public static void Parcel_Details()
	{
		textbox(Elements.Weight(driver), Inputdata.P_Weight);
		dropdown(Elements.Weight_Unit(driver), Inputdata.P_Weight_Unit);
		
		textbox(Elements.Length(driver), Inputdata.P_Length);
		dropdown(Elements.Length(driver), Inputdata.P_Length_Unit);
		
		textbox(Elements.Width(driver), Inputdata.P_Width);
		dropdown(Elements.Width_Unit(driver), Inputdata.P_Width_unit);
		
		textbox(Elements.Height(driver), Inputdata.P_Height);
		dropdown(Elements.Height_Unit(driver), Inputdata.P_Height_Unit);
	
	}
	
	public static void Quoteme()
	{
		Elements.Click_Printer(driver).click();
		Repositry.button(Elements.Quote_me(driver));
	}
	
	
	public static void setExcelFile(String Path,String SheetName){

			try {
			Path="D:\\Sastry Workspace\\Swiftlyship\\Data and Report.xlsx";
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			} 
			catch (Exception e)
			{
				e.getMessage();
			}
			}
	 public static String getCellData(int RowNum, int ColNum){

			try{
   			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
   			String CellData = Cell.getStringCellValue();
   			return CellData;
   			}
			catch (Exception e)
			{
				return e.getMessage();
			}

	    }
	 public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

				Row=ExcelWSheet.getRow(RowNum);
				Cell = Row.getCell(ColNum);
				if (Cell == null) {
					Cell = Row.createCell(ColNum);
					Cell.setCellValue(Result);
					} else 
					{
						Cell.setCellValue(Result);
					}

   				FileOutputStream fileOut = new FileOutputStream("D:\\Sastry Workspace\\Swiftlyship\\Data and Report.xlsx");
   				ExcelWBook.write(fileOut);
   				fileOut.flush();
					fileOut.close();
					}catch(Exception e){
						throw (e);

				}

			}



		
	}

