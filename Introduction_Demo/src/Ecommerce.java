import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ecommerce {
	
	Actions action;
	
	// Search By this Function
	public Ecommerce(WebDriver driver)
	{
		action= new Actions(driver);
	}
	// After Search this Function will Press Enter
	public void pressEnter(WebDriver driver)
	{
		action.sendKeys(Keys.ENTER).build().perform();
	}
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor Executor = (JavascriptExecutor) driver;
		Executor.executeScript("window.scrollBy(0,2000)", "");
	}
	public void performMouseHover(WebElement element)
	{
		action.moveToElement(element).build().perform();
	}
	public void clickElement(WebElement element,WebDriver driver)
	{
		JavascriptExecutor Executor = (JavascriptExecutor) driver;
		Executor.executeScript("argument[0].click()", element);
	}

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Ecommerce obj = new Ecommerce(driver);
		WebElement inputsearch = driver.findElement(By.id("twotabsearchtextbox"));
		inputsearch.sendKeys("Shirt");
		obj.scrollDown(driver);
		
	}

}
