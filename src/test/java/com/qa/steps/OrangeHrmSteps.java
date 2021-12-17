package com.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmSteps {
	
	WebDriver driver;
	
	
	@Given("as a user we launch the particular url {string}")
	public void as_a_user_we_launch_the_particular_url(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
	}
	
	@When("as a user we send the username {string} and password {string}")
	public void as_a_user_we_send_the_username_and_password(String username,String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		
	}
	
	
	@And("as a user we click the login button")
	public void as_a_user_we_click_the_login_button() {
		
		WebElement findElement = driver.findElement(By.id("btnLogin"));
		findElement.click();
	}
	
	
	
	@Then("as a user we verifies title and url of the Orange HRM")
	public void as_a_user_we_verifies_title_and_url_of_the_Orange_HRM() {
		
		
	}
	
	
	
	}