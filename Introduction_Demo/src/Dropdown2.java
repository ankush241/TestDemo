import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Dynamic Dropdown
		
		driver.findElement(By.id("from")).sendKeys("CCU");
		//driver.findElement(By.id("from")).sendKeys(Keys.DOWN);
		 //driver.findElement(By.id("from")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> dd = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement options : dd)
		{
			//System.out.println(options.getText());
			if(options.getText().equalsIgnoreCase("Kolkata, Netaji Subhash Chandra Bose International Airport, CCU, India, IN"))
			{
				options.click();
				break;
			}
		}
		
		driver.findElement(By.id("to")).sendKeys("BLR");
		Thread.sleep(2000);
		List<WebElement> dd1 = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement option1 : dd1)
		{
			if(option1.getText().equalsIgnoreCase("Bengaluru, Kempegowda International Airport, BLR, India, IN"))
			{
				option1.click();
				break;
			}
		}

	}

}
