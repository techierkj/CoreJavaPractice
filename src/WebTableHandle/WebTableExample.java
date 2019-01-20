package WebTableHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");

		// Find rows, and column pattern
		// *[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		// *[@id="leftcontainer"]/table/tbody/tr[2]/td[1]
		// *[@id="leftcontainer"]/table/tbody/tr[4]/td[1]
		// *[@id="leftcontainer"]/table/tbody/tr[1]/td[2] -row
		// *[@id="leftcontainer"]/table/tbody/tr[1]/td[3] -row

		// Get Rows Count
		List<WebElement> alRows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println(alRows.size());

		// Get Column Count
		List<WebElement> alColumn = driver.findElements(By.xpath("// *[@id='leftcontainer']/table/tbody/tr[1]/td"));
		System.out.println(alColumn.size());

		// to get 3rd row's 2nd column data

		// Fetch the data of Nth Row
		for (int i = 1; i < alRows.size(); i++) {
			for (int j = 1; j < alColumn.size(); j++) {

				String a = driver
						.findElement(By.xpath("// *[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(a + " ");
			}
			System.out.println();

		}
		driver.close();
	}
}
