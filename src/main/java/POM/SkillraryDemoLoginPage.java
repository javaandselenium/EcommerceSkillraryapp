package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	@FindBy(name="addresstype")
	private WebElement testingdd;

	public WebElement getTestingdd() {
		return testingdd;
	}

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement selenium;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtraining() {
		selenium.click();
	}
	
	

}
