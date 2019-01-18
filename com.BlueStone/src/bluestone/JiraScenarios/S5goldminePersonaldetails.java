package bluestone.JiraScenarios;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S5goldminePersonaldetails {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//div[@class='hp-gms-top']")).click(); // goldmine 10+1 scheme
		
		driver.findElement(By.id("amount")).sendKeys("2500");
		driver.findElement(By.id("Email")).sendKeys("goldmain@mail.com");
		
		driver.findElement(By.id("tahLpSubmit")).click(); // start now
		
		System.out.println(driver.findElement(By.xpath("//span[@class='subscription-amount']")).getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//div[@id='email-registration-form']")).getText());
			
		driver.close();						
	}


}
