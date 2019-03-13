package testngPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableData {
	
	@Test
	public void test() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			driver=new ChromeDriver();		
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			//to maximize the browser window
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());	
			driver.findElement(By .linkText("Cruises")).click();
			
			WebElement ita_tab=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
			List<WebElement> rows_coll=ita_tab.findElements(By .tagName("tr"));
			System.out.println(rows_coll.size());
			for(WebElement row:rows_coll) {
			       List<WebElement> col_coll=row.findElements(By .tagName("td"));
			    for(int c=0;c<=col_coll.size()-1;c++) {
			    	if(col_coll.get(c).getText().equalsIgnoreCase("Inside Passage")) {
			    		System.out.println(col_coll.get(0).getText());
			    		
			    	}
			    }
			    for(WebElement col:col_coll) {
			    	
			    	
			    }
				//System.out.println(row.getText());
				
			}
	}

}
