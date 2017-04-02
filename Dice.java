package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		System.out.println("*********Firefox browser started**********");

		driver.get("https://www.dice.com");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath(".//*[@id='Login_1']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath(".//*[@id='Email_1']")).sendKeys("sugandhgoud4@gmail.com");

		driver.findElement(By.xpath(".//*[@id='Password_1']")).sendKeys("######");

		driver.findElement(By.xpath(".//*[@id='LoggedIn_1']")).click();

		driver.findElement(By.xpath(".//*[@id='LoginBtn_1']")).click();

		System.out.println("***********Login successfull***********");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@id='job']")).sendKeys("QA Tester");

		driver.findElement(By.xpath("//*[@id='location']")).sendKeys("United States");

		driver.findElement(By.xpath(".//*[@id='searchJob']/div/div[4]/span[4]/input")).click();

		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary.btn-block.dice-btn.mB5")).click();

		System.out.println("**********Sucessfully Opened Dice jobs*********");

		driver.findElement(By.xpath(".//*[@id='position0']")).click();

		driver.findElement(By.xpath("body")).sendKeys(Keys.CONTROL + "t");
	}

}
