import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		/*for(int i=1;i<7;i++)
		{
			driver.findElement(By.id("ddladult1")).click();
		}*/
		
		
		
		//driver.findElement(By.id("btnbooking")).click();
		
	}

}
