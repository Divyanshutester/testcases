package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserAction {
			
public static void main(String args[]) throws InterruptedException{
				
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Acer\\Downloads\\chromedriver.exe");
				
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				/*
			    ((WebElement) driver.findElements(By.xpath("//input[@type='text']"))).sendKeys("Mobile");
				
				// Enter your login email id //
		        driver.findElement(By.id("ap_email")) 
		            .sendKeys("xyz@gmail.com"); 
				Thread.sleep(5000);
		  
		        // Enter your login password //
		        driver.findElement(By.id("ap_password")) 
		            .sendKeys("xyz12345");
		        Thread.sleep(5000);
		  
		        driver.findElement(By.className("a-button-input")) 
		            .click();
		        Thread.sleep(5000);
						
				driver.navigate().refresh();
				Thread.sleep(5000);
				*/
				// getTitle() to obtain page title
				System.out.println("Page title is : " + driver.getTitle());
					

	}

}
