package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Acer\\Downloads\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in//");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Iphone+15");
		searchbox.submit();
		//driver.findElement(By.xpath("//*[id=\'nav-search-submit-button']")).click();
		driver.findElement(By.linkText("Apple iPhone 15 Plus (128 GB) - Blue")).click();
		WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		addToCart.click();
		//Select quantity = new Select(driver.findElement(By.id("quantity")));
		//quantity.selectByIndex(1);
		driver.close();
					
		
	}

}
