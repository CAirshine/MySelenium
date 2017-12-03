package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		try {
			driver.get("https://www.qiushibaike.com/article/119803473");
			System.out.println(driver.findElement(By.xpath("//div[@class=\"content\"]")).getText());

		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
}
