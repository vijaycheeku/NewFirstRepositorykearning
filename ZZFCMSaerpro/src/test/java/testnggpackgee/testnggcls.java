package testnggpackgee;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import excellpackage.excellclssie;

public class testnggcls {
	WebDriver driver;
  @Test(groups= {"smoke"})
  public void Login() throws Exception 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Chrome Jar\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://cemstest.shriramvalue.me/cems_offline_mig/csms.ui/");
		driver.manage().window().maximize();
	  Set<String> s1=	driver.getWindowHandles();
	  Iterator<String>it=s1.iterator();
			  String p1=it.next();
	  String c1=it.next();
		driver.switchTo().window(c1);
		driver.manage().window().maximize();
	  Thread.sleep(5000);	  
	  
  }
  
  
  @Test(groups= {"smoke"})
  public void Functionalityies() throws Exception
  {
	 excellclssie.inputss(driver);
	  
  }
  
  @Test(groups= {"retest"})
  public void Logout()
  {
	  
	  driver.quit();
  }
  
  

}
