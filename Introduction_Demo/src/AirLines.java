import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirLines {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.className("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).sendKeys("KOL");
		List<WebElement> primary = driver.findElements(By.xpath("//input[@id='fromCity']"));
		
		for (WebElement option : primary)
		{
			if(option.getText().equalsIgnoreCase("Kolkata"))
			{
				option.click();
				break;
			}
		}
		
	}

}
