package excelPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TempClass {
 
	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
		driver.get("https://twitter.com/login?lang=en"); //Removing some characters of URL to avoid posting URL  
		driver.findElement(By.className("js-dropdown-toggle")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='supported_languages']/li[8]/a")).click();
 
		Thread.sleep(5000);
		driver.close();
	}
}