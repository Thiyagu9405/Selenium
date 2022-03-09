package SeleniumPrograms;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiyagarajan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
//     	d.get("https://www.facebook.com/n");
//     	d.findElement(By.id("email")).sendKeys("thiyagu9405@gmail.com");
//     	d.findElement(By.name("pass")).sendKeys("Thiyagu");
//     	Thread.sleep(3000);
//     	WebElement fe = d.findElement(By.xpath("(//a[@role='button'])[2]"));
//     	fe.click();
     	d.get("https://www.w3schools.com/html/html_tables.asp");
     	List<WebElement> fs = d.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
     	for (WebElement we : fs) {
		System.out.println(we.getText());	
		}
     	
     	
	
	}
}
