package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Takethiscoursepage {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//button[text()=' TAKE THIS COURSE ']")
	private WebElement takethiscourse;
	
	public Takethiscoursepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbutton() {
		playbtn.click();
	}
	public void pausebutton() {
		pausebtn.click();
	}
	public void takethiscoursebtn() {
		takethiscourse.click();
	}

}
