package Risban;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testable 
{
  @BeforeSuite
  public void Browserlaunch()
  {
	  Repositry.Browser_launch();
	  Reporter.log("Browser launched successfuly");
  }
}
