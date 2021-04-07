package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//first step:open the browser(chrome)
		System.setProperty("webdriver.chrome.driver","D:\\Chrome version\\89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String beforetitle = driver.getTitle();
		System.out.println(beforetitle);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String aftertitle = driver.getTitle();
		System.out.println(aftertitle);
		
		if(beforetitle.equals(aftertitle))
		{
			System.out.println("Before and After titles are same so proceed to logout");
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			Thread.sleep(3000);
			driver.close();
		}
		else {
			System.out.println("Title is not same");
			driver.close();
		}

	}

}
