package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_New {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
								
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Acer\\Downloads\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in");				
				WebElement textBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
				textBox.sendKeys("ipad");
				WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search-submit-text']"));
				searchButton.click();
				/*Thread.sleep(8000);
				driver.findElement(By.linkText("Apple iPad (10th Generation): "+ "with A14 Bionic chip, 27.69 cm (10.9″) Liquid Retina Display, 256GB, Wi-Fi 6, "
						+ "12MP front/12MP Back Camera, Touch ID, All-Day Battery Life – Silver")).click();
				Thread.sleep(8000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,100)");*/
				Thread.sleep(8000);
				WebElement addToCart = driver.findElement(By.xpath("(//*[text()='Add to cart'])[1]"));
				addToCart.click();
			
	}

}
