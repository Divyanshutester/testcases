package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Acer\\Downloads\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.youtube.com/");
		driver.navigate().refresh();
		driver.getTitle();
		
		driver.close();

	}

}
