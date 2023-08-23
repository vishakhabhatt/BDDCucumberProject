package stepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;


public class StepDefination extends Base {

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
	//  System.setProperty("webdriver.chrome.driver", "D:\\QE16_Software\\chromedriver_114\\chromedriver_win32\\chromedriver.exe");
	 //   driver=new ChromeDriver();
	    
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(chromeOptions);
		
	//	ChromeOptions chromeOptions = new ChromeOptions();
	//	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver();
	  
	  ad=new AdminPage(driver);//create object of AdminPage JAva class
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
		 
	   driver.get(url);
       Thread.sleep(2000);

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
	    
		ad.setUsername(email);
		Thread.sleep(2000);

	   ad.setPassword(password);
		Thread.sleep(2000);

	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
	   ad.clickOnLogin();
		Thread.sleep(2000);

	}


	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}

}
