package bluestone.JiraScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4goldmineErrormessage {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//div[@class='hp-gms-top']")).click(); // goldmine 10+1 scheme
		
		driver.findElement(By.id("tahLpSubmit")).click(); // start now
		
		System.out.println(driver.findElement(By.id("amount_error")).getText());
		System.out.println(driver.findElement(By.id("Email_error")).getText());
		
		driver.close();
		
	}

}
