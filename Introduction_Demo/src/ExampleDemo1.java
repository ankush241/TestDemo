import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ExampleDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver (options);
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement w = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(w).build().perform();
		
		driver.findElement(By.xpath("//a[.='Contact']")).click();
		
		WebElement print = driver.findElement(By.className("icon-box"));

		System.out.println(print);
	}

}
