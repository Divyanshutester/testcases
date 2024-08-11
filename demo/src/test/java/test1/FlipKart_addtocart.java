package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Acer\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Mi A series 80 cm (32 inch) HD Ready LED Smart Google TV 2023 Edition with HD |Dolby Audio | DTS:HD | ...");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.linkText("Mi A series 80 cm (32 inch) HD Ready LED Smart Google TV 2023 Edition with HD |Dolby Audio | DTS:HD | ...")).click();
					
	}

}
