package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Exefolder\\chromedriver.exe");
		
	ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
		
       
		WebDriver driver = new ChromeDriver();
		
        //WebDriver driver = new FirefoxDriver();
	     
        driver.get("https://olarqa.performancematters.com/ola/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("flsunshine");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//input[@placeholder='Student Login']")).sendKeys("4423683183");
		
		driver.findElement(By.xpath("//input[@id='ola-password']")).sendKeys("sunshine");
		
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block'][1]")).click();
		
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	      //driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS) ;
		
		          Thread.sleep(6000);
		
		driver.findElement(By.xpath("//td[text()='Test for Abhilash']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary  pmf-instructions-done ']")).click();
		
		System.out.println("Page title is: " + driver.getTitle());	
		
		
		//driver.find_Element_id_by("clientCode").send_key("");
	}
}
