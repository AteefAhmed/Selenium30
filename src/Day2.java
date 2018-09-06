import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day2 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ateef.ahmed\\Desktop\\Selenium Training\\IE server interface\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		// WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ateef.ahmed\\Desktop\\ateef\\Chrome driver\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("http://plstr/tradestone/login.do");
		
		//Login to OMS
		driver.findElement(By.xpath("//*[@id=\"LOCK\"]/center/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[2]/input")).sendKeys("mmgrt1");
		driver.findElement(By.xpath("//*[@id=\"LOCK\"]/center/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("mmgrtx2"); 
		driver.findElement(By.xpath("//*[@id=\"LOCK\"]/center/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).click();
		
		// create meeting id
		//driver.findElement(By.xpath("//*[@id=\"text\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create / Search for Meeting #")).click();
		driver.findElement(By.xpath("//*[@id=\"newrecord\"]/img")).click();
		driver.findElement(By.xpath("//*[@id='F0']")).sendKeys("NewID1");
		driver.findElement(By.xpath("//*[@id=\"ntopg\"]/a[2]/img")).click();
		
		// back to dashboard
		driver.findElement(By.xpath("//*[@id=\"TSSHEADER\"]/td[2]/table/tbody/tr[2]/td[1]/label")).click();
		
		// Create master item
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create a Master Item")).click();
		driver.findElement(By.xpath("//*[@id=\"F0\"]")).sendKeys("NewMI1");
		driver.findElement(By.xpath("//*[@id=\"F1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"F1\"]")).sendKeys("Newid1");
		//driver.findElement(By.xpath("//*[@id=\"DATA_TABLE\"]/tbody/tr[6]/td[2]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"F3\"]")).clear();
		driver.findElement(By.xpath("//*[@id='sf']")).click();
		driver.findElement(By.xpath("//*[@id=\"DATA_TABLE\"]/tbody/tr[8]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sf\"]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"DATA_TABLE\"]/tbody/tr[12]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"tablet\"]/tbody/tr[2]/td/p/table/tbody/tr/td/a")).click();
		
		
	}

}
