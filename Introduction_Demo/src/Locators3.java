import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("rahul");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahul");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[1]/span[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		
		Thread.sleep(1000);
		
		String st= driver.findElement(By.xpath("//*[@id='container']/div[2]/form/p")).getText();
		
		System.out.println(st);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("rahul");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("7439695030");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();
		
		
		String st1= driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/p")).getText();
		System.out.println(st1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("rahul");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='container']/div[2]/form/div[1]/span[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		
		String st2= driver.findElement(By.xpath("//*[@id='root']/div/div/div/h2")).getText();
		System.out.println(st2);
		
	}

}
