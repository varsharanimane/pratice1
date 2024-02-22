package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookextra {
	WebDriver driver;
	@Given("User enter the chrome browser and navigate the facebook page")
	public void user_enter_the_chrome_browser_and_navigate_the_facebook_page() {
	    
		WebDriverManager.chromedriver().setup();//to set the path
		driver=new ChromeDriver();//creating obje3ct for chromedriver
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("User enter {string},{string}")
	public void user_enter(String email_address, String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(email_address);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(3000);
	  
		
	}

	@When("User is click on log in")
	public void user_is_click_on_log_in() throws InterruptedException {
	   driver.findElement(By.linkText("Log in")).click();
	   Thread.sleep(3000);
		
	}

	@Then("Invalid user name is diplyed")
	public void invalid_user_name_is_diplyed() {
		System.out.println("error msg ");
		driver.quit();

}

}
