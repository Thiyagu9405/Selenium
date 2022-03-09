package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		d.findElement(By.name("firstname")).sendKeys("Thiyagu");
		d.findElement(By.name("lastname")).sendKeys("R");
		d.findElement(By.name("reg_email__")).sendKeys("thiyagu9405@gmail.com");
		d.findElement(By.name("reg_passwd__")).sendKeys("thiyaguR");
		WebElement date = d.findElement(By.id("day"));
		Select sd = new Select(date);
		sd.selectByIndex(17);
		WebElement month = d.findElement(By.id("month"));
		Select sm = new Select(month);
		sm.selectByIndex(4);
		WebElement year = d.findElement(By.id("year"));
		Select sy = new Select(year);
		sy.selectByVisibleText("1994");
		d.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		d.findElement(By.name("websubmit")).click();
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File sf = ts.getScreenshotAs(OutputType.FILE);
		File df = new File("C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium\\ScreenShot\\FBscreen.png");
		FileUtils.copyFile(sf, df);
		
	}

}
