import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitySelection {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\TestDemo\\chromedriver.exe");
//	      WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.goibibo.com/");
		 driver.manage().window().maximize();
		 Actions action = new Actions(driver);
		   action.sendKeys(Keys.ESCAPE).build().perform();
		  // driver.findElement(By.className("logSprite icClose")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.className("sc-eLwHnm hHxEGr fswWidgetPlaceholder")).sendKeys("Chennai");
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		 

		 driver.findElement(By.id("(//p[contains(@class,'sc-eLwHnm hHxEGr fswWidgetPlaceholder')])[1]")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("(//p[contains(@class,'sc-eLwHnm hHxEGr fswWidgetPlaceholder')])[1]")).sendKeys(Keys.ENTER);
		 driver.close();
	}

}
