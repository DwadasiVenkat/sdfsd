package Risban;

import org.automationtesting.excelreport.Xl;
import org.testng.annotations.Test;

public class GenerateReport {
	

	public static void main(String[] args) throws Exception 
	{
		Xl.generateReport("excel");
	}

}
