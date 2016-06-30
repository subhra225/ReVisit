package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class PopupPractice {

	public static void main(String[] args) 
	{
		/**
		 * This program is written in order to test the windows
		 * alert popup
		 */
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		driver.findElement(By.name("taskSelected[17]")).click();
		driver.findElement(By.xpath("//td/input[@value='Delete Selected Tasks']")).click();
		driver.findElement(By.xpath("//td/input[@value='Delete Task & Time Reports']")).click();*/
		
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement fname= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(fname);
		System.out.println(driver.findElement(By.tagName("p")).getText());
				driver.findElement(By.xpath("//body/button[text()='Try it']")).click();
		Alert al= driver.switchTo().alert();
		al.accept();
		driver.switchTo().defaultContent();
		
				
				//driver.findElement(By.xpath("//div[@id='w2ui-popup']")); 	
		
		

	}
	

}
