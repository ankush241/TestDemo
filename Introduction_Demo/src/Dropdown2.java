import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Dynamic Dropdown
		
		driver.findElement(By.id("from")).sendKeys("Kolkata");
		Thread.sleep(2000);
		List<WebElement> dd = driver.findElements(By.id("hfFrom"));
		for(WebElement options : dd)
		{
			if(options.getText().equalsIgnoreCase("Kolkata, Netaji Subhash Chandra Bose International Airport, CCU, India, IN"))
			{
				options.click();
				break;
			}
		}

	}

}
