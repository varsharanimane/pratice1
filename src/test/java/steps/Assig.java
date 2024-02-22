package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assig {
	WebDriver driver;

	@Given("User is open the chrome browser and navigate to gov website")
	public void user_is_open_the_chrome_browser_and_navigate_to_gov_website() {
		WebDriverManager.chromedriver().setup();//to set the path
		driver=new ChromeDriver();//creating obje3ct for chromedriver
		
		driver.get("https://www.india.gov.in/user/register");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	   
	    
	}

	@When("User is entering account information {string},{string}")
	public void user_is_entering_account_information(String Username, String emailadress) throws InterruptedException {
		driver.findElement(By.id("edit-name")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.id("edit-mail")).sendKeys(emailadress);
		Thread.sleep(2000);
	    
	}

	@When("User is entering personal information {string},{string},{string},{string},")
	public void user_is_entering_personal_information(String Firstname, String Lastname, String Country, String State) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-first-name-und-0-value']")).sendKeys(Firstname);
		Thread.sleep(2000);
		driver.findElement(By.id("edit-profile-main-field-last-name-und-0-value")).sendKeys(Lastname);
		Thread.sleep(2000);
		WebElement drp= driver.findElement(By.id("edit-profile-main-field-country-und"));
		Select dropdown=new Select(drp);
		dropdown.selectByVisibleText(Country);
		WebElement drp1= driver.findElement(By.id("edit-profile-main-field-state-und-hierarchical-select-selects-0"));
		Select dropdown1=new Select(drp1);
		dropdown1.selectByVisibleText(State);
	   
	}

	@When("User is enter {string}, {string},{string}")
	public void user_is_enter(String PIN_Code, String Education, String text) throws InterruptedException {
		driver.findElement(By.id("edit-profile-main-field-pin-code-und-0-value")).sendKeys(PIN_Code);
	    Thread.sleep(2000);
	    WebElement drp2= driver.findElement(By.id("edit-profile-main-field-education-und"));
	    Select dropdown2=new Select(drp2);
		dropdown2.selectByVisibleText(Education);
		//driver.findElement(By.id("edit-profile-main-field-education-und")).sendKeys(Education);
		Thread.sleep(2000);
		driver.findElement(By.id("edit-captcha-response")).sendKeys(text);
		Thread.sleep(2000);

	  
	}

	@When("User click on check box and User click on create new account")
	public void user_click_on_check_box_and_user_click_on_create_new_account() throws InterruptedException {
		driver.findElement(By.id("edit-profile-main-field-subscribe-to-our-newslett-und-yes")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);

	    
	}

	@Then("error notification is displyed")
	public void error_notification_is_displyed() {
		System.out.println("Error");
		driver.quit();

	    
	}


}
