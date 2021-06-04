package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocartPage {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocartbtn;

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	public AddTocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbutton() {
		addtocartbtn.click();
	}
	
	

}
