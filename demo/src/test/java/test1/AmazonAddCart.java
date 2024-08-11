package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Acer\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//*[text()='Search Amazon.in']
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 15 Pro Max (256 GB) - Blue Titanium");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).submit();
		driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Blue Titanium")).click();
		Thread.sleep(8000);
		//WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		//Thread.sleep(10000);
		//addToCart.click();
		driver.findElement(By.xpath("(//input[@id='buy-now-button'])[1]")).click();
		//Select quantity = new Select(driver.findElement(By.id("quantity")));
		//quantity.selectByIndex(1);
		//driver.close();
				
	}

}
