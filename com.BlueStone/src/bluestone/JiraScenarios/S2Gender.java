package bluestone.JiraScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S2Gender {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		driver.findElement(By.xpath("//span//a[text()='Rings']")).click();
		
		WebElement gender = driver.findElement(By.xpath("//span[text()='Gender']"));
		
		act.moveToElement(gender).perform();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()=' Women ']")).click();
		
		WebElement wCount = driver.findElement(By.xpath("//span[@class='total-designs']"));
		System.out.println("Rings for women  -  " + wCount.getText());
		
		driver.close();

	}

}
