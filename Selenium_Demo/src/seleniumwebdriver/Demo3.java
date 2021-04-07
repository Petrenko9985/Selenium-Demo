package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome version\\89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		WebElement username = driver.findElement(By.name("userName"));
		if(username.isEnabled()) {
			username.clear();
			username.sendKeys("sunil");
		}
		if(username.isDisplayed()) {
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.clear();
			pwd.sendKeys("sunil");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
		}	
		
		driver.findElement(By.xpath("//*[@href='reservation.php']")).click();
		driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
}
}
		
