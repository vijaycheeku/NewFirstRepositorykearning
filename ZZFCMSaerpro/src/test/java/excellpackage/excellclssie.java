package excellpackage;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class excellclssie
{
public static void inputss(WebDriver driver) throws Exception
{
			excellclssie obj1=new excellclssie();
			String UN=obj1.readingexcel(1, 0);
			String PWD=obj1.readingexcel(1, 1);
			driver.findElement(By.id("txtusername")).sendKeys(UN);
			driver.findElement(By.id("txtpassword")).sendKeys(PWD);
			driver.findElement(By.name("btnSubmit")).click();
		 
		
		
}	
	
	public String readingexcel(int r,int c) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\Desktop\\Excel\\Excelforonlinescreen.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String s1=wb.getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
		return s1;
				
		
	}
}
