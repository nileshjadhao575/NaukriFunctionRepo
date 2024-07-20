package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjectModel.NaukriPage;

public class NaukriStepDefination {

	public WebDriver driver;
	public NaukriPage obj;

	@Given("when user is on home page")
	public void when_user_is_on_home_page() {
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("user click job button")
	public void user_click_job_button() {
		obj = new NaukriPage(driver);
		obj.jobBT();

	}

	@When("user click skills and enters skills")
	public void user_click_skills_and_enters_skills() {
		obj.enterSkills();

	}

	@When("user click select experience")
	public void user_click_select_experience() {
		obj.selectExp();
	}

	@When("user click location and enter city")
	public void user_click_location_and_enter_city() {
		obj.enterlocation();
	}

	@Then("user click on search buttton")
	public void user_click_on_search_buttton() {
		obj.searchBt();
	}

	@Then("user sucessfully land on page")
	public void user_sucessfully_land_on_page() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}

}
