package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxCalls {

	static public void main(String[] args)
{
		// TODO Auto-generated method stub
		
		/**
		 * This program is written to test Ajax Calls
		 */
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.manipalprolearn.com/");
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys("big");
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Big']"))).click();
		
	
		
		
		
	//WebDriverWait(driver, /*seconds=*/3); 	
		

	}

}
