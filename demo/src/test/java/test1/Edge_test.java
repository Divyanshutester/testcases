package test1;

import java.lang.invoke.SwitchPoint;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edge_test {

	private static final String iframe = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Set the driver path
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\Acer\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		driver.get("https://www.msn.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("sports")).click();
		System.out.println("clicked");
		//*[@id="sports"]
		/*
		 * iframe = WebDriverWait(driver,
		 * 30).until(expected_conditions.presence_of_element_located(By.xpath(
		 * "//*[@id=\"mostpopular\"]'/iframe'")));
		 * iframe.location_once_scrolled_into_view; driver.SwitchPoint.frame(iframe);
		 * Thread.sleep(5000); WebElement newslink = driver.findElement(By.xpath(
		 * "//*[@id=\"contentcard_L_-354344135\"]//div[2]/div[2]/span/a"));
		 * newslink.click(); driver.switch_to.default_content();
		 * 
		 * //driver.findElement(By.xpath(null//*[@id="contentcard_AA1nKJUP"]/div/div[1]/
		 * div)); //driver.close();
		 */
	}

}
