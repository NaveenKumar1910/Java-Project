package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbloginTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1: launch fb url in a browser
		System.setProperty("webDriver.chrome.driver", "chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		// step 1.1: Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS); 
		
		
		// step 2: enter email or phone no.
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("abc.xyz.com");
		
		
		// step 3: enter password 
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("hogle nin nouna");
		
		
		// step 4: click on login button
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
		
		// step 5: click on yes continue
		//WebElement yes = driver.findElement(By.className(""));
		//yes.click();
		
		
		
		// step 5: validate username and password
		// step 6: click on forget password
		// step 7: close the driver
		
		// driver.close();
		

	}

}
