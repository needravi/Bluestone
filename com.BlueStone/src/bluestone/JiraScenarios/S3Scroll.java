package bluestone.JiraScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S3Scroll {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.bluestone.com");
		
		// Scroll Y axis 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
								
		WebElement topicon = driver.findElement(By.xpath("//span[@class='logo-icon']"));
		Thread.sleep(3000);
		if(topicon.isDisplayed()) {
			topicon.click();
			System.out.println("topicon displayed and clicked");
		}
		else {					 
		System.out.println("topicon not dispalyed");
		}

		driver.close();

	}

}
