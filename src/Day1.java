import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver", "C:\\Users\\ateef.ahmed\\Desktop\\ateef\\Chrome driver\\geckodriver.exe");
 WebDriver driver = new FirefoxDriver();
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ateef.ahmed\\Desktop\\Selenium Training\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
 driver.get("http://www.google.com/gmail/");
 driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ateefahmedr");
 
 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ahmedboss");
 //driver.findElement(By.xpath("//*[@id=\"forgotPassword\"]/content/span")).click();
 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
 driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}

}
