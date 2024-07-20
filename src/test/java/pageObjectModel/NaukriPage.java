package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriPage {

	public WebDriver driver;

	public NaukriPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "(//li[@class='nI-gNb-menuItems'])[1]")
	WebElement jobBT;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement enterSkilss;

	@FindBy(xpath = "//li[@class='tuple-wrap ']")
	List<WebElement> selectQA;

	@FindBy(xpath = "//div[@class='dropdownMainContainer']")
	WebElement selectExp;

	@FindBy(xpath = "//li[@index='3']")
	WebElement Exp3;

	@FindBy(xpath = "//input[@placeholder='Enter location']")
	WebElement enterLocation;

	@FindBy(xpath = "//li[@class='tuple-wrap ']")
	List<WebElement> selectCity;

	@FindBy(xpath = "//div[@class='qsbSubmit']")
	WebElement search;

	public void jobBT() {
		jobBT.click();
	}

	public void enterSkills() {
		enterSkilss.sendKeys("qa");

		for (WebElement skill : selectQA) {
			if (skill.getText().equalsIgnoreCase("qa automation")) {
				skill.click();
				break;
			}
		}
	}

	public void selectExp() {
		selectExp.click();
		Exp3.click();
	}

	public void enterlocation() {
		enterLocation.sendKeys("pu");

		for (WebElement city : selectCity) {
			if (city.getText().equalsIgnoreCase("pune")) {
				city.click();
				break;
			}
		}
	}

	public void searchBt() {
		search.click();
	}

}
