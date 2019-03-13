package testngPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestReading  {
	
	@Test
	public void testRead() throws Exception {
	
    //to load excel file
	File f=new File("C:\\Users\\suman.palle\\Desktop\\Selenium\\Data.xlsx");	
	FileInputStream fis=new FileInputStream(f);	
	//to initiate the workbook
	XSSFWorkbook xb=new XSSFWorkbook(fis);	
	//to initiate the worksheet
	XSSFSheet ws= xb.getSheetAt(0);
	String str=ws.getRow(0).getCell(0).getStringCellValue();
	System.out.println(str);	
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();		
		
		//to maximize the browser window
				
		//to get the row count
	int r_cnt=ws.getLastRowNum();
	System.out.println(r_cnt);	
	for(int i=1;i<=r_cnt;i++) {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String str1=ws.getRow(i).getCell(0).getStringCellValue();
		String str2=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(str1+" "+str2);
		driver.findElement(By .name("userName")).sendKeys(str1);
		driver.findElement(By .name("password")).sendKeys(str2);;
		//driver.findElement(By .name("login")).click();
		ws.getRow(i).createCell(2).setCellValue("Pass");
		   //writing back to excel
		
		FileOutputStream fout=new FileOutputStream(f);
		xb.write(fout);
	
	
	
	
	}
	
	
	xb.close();
driver.close();
	}
}
