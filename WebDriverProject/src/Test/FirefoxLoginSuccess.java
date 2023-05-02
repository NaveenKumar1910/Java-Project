package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLoginSuccess {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// step 1: Launch Firefox browser and open simplilearn

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");

		// step 1.2: Maximize the browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		// step 1.3: Get the title of a page

		// WebElement title = driver.findElement(By.tagName("title"));
		// System.out.println("The title of the page is " + title.getText()); (this
		// method dint work)

		System.out.println("The title of the page is " + driver.getTitle());

		// step 2: click on login button
		WebElement Loginlink = driver.findElement(By.className("login"));
		String location = Loginlink.getAttribute("href");
		System.out.println("The link will take you to Simplilearn LMS" + location);
		Loginlink.click();
		Thread.sleep(6000);

		// step 3: enter the username
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("naveenchatti49@gmail.com");

		// step 4: enter the password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Shiva@naveen1234");

		// step 5: click the login Button
		WebElement loginButton = driver.findElement(By.name("btn_login"));
		loginButton.click();

		// step 5: validate username and pasword
		System.out.println("Login Successful " + driver.getTitle());

	}

}
