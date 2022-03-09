package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TshirtOrder {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println("Browser and URL launched");
		WebElement ts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		ts.click();
		System.out.println("Clicked T-shirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(3000);
		System.out.println("Size L selected");
		Actions a = new Actions(driver);
		WebElement ad = driver.findElement(By.xpath("//img[contains(@title,'Faded Short')]"));
		a.moveToElement(ad).perform();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		System.out.println("Added to Cart");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement np = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		js.executeScript("arguments[0].scrollIntoView();", np);
		np.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("thiyagu18051994@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Thiyagu@1008");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		Thread.sleep(2000);
		System.out.println("Sign In Sucessfull");
		js.executeScript("window.scrollBy(0, 1000)");
		WebElement np2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		js.executeScript("arguments[0].scrollIntoView;", np2);
		np2.click();
		Thread.sleep(2000);
		System.out.println("Address confirmed");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		System.out.println("Shipping Confimed");
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Decti = new File("C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium\\ScreenShot\\T-shirtBooking5.png");
		FileUtils.copyFile(source, Decti);
		System.out.println("Bookings Done");
		
	
	}
	

}
