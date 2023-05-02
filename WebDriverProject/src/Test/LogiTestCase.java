package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogiTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// step 1: Launch chrome browser and open simplilearn

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		WebElement Loginlink = driver.findElement(By.linkText("Log in"));
		String location = Loginlink.getAttribute("href");
		System.out.println("The link will take you to Simplilearn LMS" + location);
		Loginlink.click();

		// step 3: enter the username
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("saayisbidthene@hell.com");

		// step 4: enter the password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("satthog@F1234");

		// step 4.1: clicking on remember me
		WebElement rememberme = driver.findElement(By.className("rememberMe"));
		rememberme.click();

		// step 5: click the login Button
		WebElement loginButton = driver.findElement(By.name("btn_login"));
		loginButton.click();

		// step 5: validate username and password
		// System.out.println("Login Successfull " + driver.getTitle());

		// Note: 5th step is used only when you use exact credentials to login

		// step 6: validate username and password
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password youu have entered invalid";
		System.out.println("The login Dint Happen Successfully " + errorMsg);
		if (error.isDisplayed() && errorMsg.equals(expErrorMsg)) {
			System.out.println("Test Case passed");
		} else {
			System.out.println("Test case failed");

		}

		// step 6.1: Finding the no. links in the current page
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no. Links = " + AllLinks.size());
		
		for (WebElement link : AllLinks) {
			System.out.println(link.getAttribute("href"));
		}
		

		// step 7: Clicking on forgot password
		WebElement forgetPswd = driver.findElement(By.className("forgot-link"));
		forgetPswd.click();

		// step 8: closing the browser
		driver.close(); 

	}

}
