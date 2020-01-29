package step_defination_29;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_defination_29jan {
    WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d4.05.02\\Desktop\\ChromeDriver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://localhost:8083/TestMeApp/");
	}

	@When("User Navigate to Login page")
	public void user_Navigate_to_Login_page() {
    driver.findElement(By.linkText("SignIn")).click();
	 
	}

	@When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("Login")).click();
	
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	  System.out.println("Login Successfully");
	  Assert.assertTrue(driver.findElement(By.linkText("SignOut")).isDisplayed());
	  driver.findElement(By.linkText("SignOut")).click();
	}

}
