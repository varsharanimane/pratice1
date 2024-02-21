package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Simpleform_step {
	WebDriver driver;
	@Given("User opens the browser and navigate to V{int} Traning website")
	public void user_opens_the_browser_and_navigate_to_V_Traning_website(Integer v1) {
	    // Write code here that turns the phrase above into concrete actions
	     ChromeDriverManager.chromedriver().setup();//to set the path
		driver=new ChromeDriver();//creating obje3ct for chromedriver
		
		driver.get("https://v1.training-support.net/selenium/simple-form");//to retrive the url
		
	}

	@When("User enter First name,Last name,email")
	public void user_enter_First_name_Last_name_email() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys("varsha");
		driver.findElement(By.id("lastName")).sendKeys("mane");
		driver.findElement(By.id("email")).sendKeys("varshamane@gmail.com");
	  
	}

	@When("Contact number ,Message")
	public void contact_number_Message() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("number")).sendKeys("7744955710");
		driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("Hello");
	    
	}

	@When("User click on submit")
	public void user_click_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	  
	}

	@Then("A confirmation pop-up is displayed")
	public void a_confirmation_pop_up_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicked on submit");
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		driver.quit();
		
	    
	}


}
