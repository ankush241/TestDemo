import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setAcceptInsecureCerts(true);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement w = driver.findElement(By.id("nav-link-accountList"));
		Actions a =new Actions (driver);
		a.moveToElement(w).build().perform();
		
		WebElement w1 = driver.findElement(By.id("nav-search-bar-form"));
		a.moveToElement(w1).click().sendKeys("Hello").build().perform();
		
		System.out.println(driver.getTitle());
		
		

	}

}
