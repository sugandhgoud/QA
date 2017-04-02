package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;

	@Given("Open firefox and start application")

	public void Open_fireFix_and_start_application() {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
	}

	@When("Enter valid username and valid password")
	public void Enter_valid_username_and_valid_password() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("sugandhgoud@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("*******");

	}

	@Then("User should be able to login successfully")
	public void User_should_be_able_to_login_successfully() {
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	}
}
