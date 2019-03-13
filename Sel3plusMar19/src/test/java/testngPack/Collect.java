package testngPack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
				
			driver=new ChromeDriver();
			
			//implicit wait statement
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			//Explicit wait statement
			//WebDriverWait w=new WebDriverWait(driver,20);
			//w.until(ExpectedConditions.presenceOfElementLocated(By .name("password")));
			
			driver.get("https://google.co.in/");
			//to maximize the browser window
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());	
			//driver.findElement(By .linkText("REGISTER")).click();
			//WebElement count_lst=driver.findElement(By .name("country"));
		List<WebElement> lst_coll=driver.findElements(By .tagName("a"));
		System.out.println(lst_coll.size());		
		for(int i=0;i<=lst_coll.size()-1;i++) {
			String lnk_name=lst_coll.get(i).getText();
			System.out.println(lnk_name);
			if(lnk_name.equalsIgnoreCase("Business")) {
				lst_coll.get(i).click();
				System.out.println(driver.getTitle());
				driver.findElement(By .xpath("//*[@id=\"advertise\"]/div/div[2]/div[1]/a")).click();
				//to get all the browser tabs opened by selenium webdriver
				Set<String> wnd_hand=driver.getWindowHandles();
			    System.out.println(wnd_hand.size());
			    //to iterate on set collection
			    /*for(int j=0;j<=wnd_hand.size()-1;j++) {
			    	wnd_hand.g
			    }*/
			  Iterator<String> ita=wnd_hand.iterator();
		/*	while(ita.hasNext()==true) {
				String str=ita.next().toString();
				driver.switchTo().window(str)
				if(driver.getTitle().equalsIgnoreCase("Google PPc"))
			}*/
			  String str=ita.next().toString();
			  System.out.println(str);
			  //to switch the browser window from current tab
			      //driver.switchTo().window(str);
			      System.out.println(driver.getTitle());
			      String str1=ita.next().toString();
			      System.out.println(str1);
				  //to switch the browser window from current tab
				      driver.switchTo().window(str1);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.findElement(By .xpath("/html/body/header/nav/div[2]/a[1]")).click();
				break;		
				
			}
			
			
		}
		
		
		
		

	}

}
