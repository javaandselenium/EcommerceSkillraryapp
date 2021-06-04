package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.AddTocartPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import generlib.BaseClass;

public class AddingCoursetocart extends BaseClass {

	@Test
	public void tc1() throws InterruptedException, FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		
		utilies.switchingTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,d.getCoursebtn());
		d.seleniumtraining();
		
		AddTocartPage a=new AddTocartPage(driver);
		utilies.doubleClick(driver,a.getPlusbtn());
		a.addtocartbutton();
		utilies.alertPopup(driver);
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),propertyFile.getPropertyfile("addtocarttitle"));
	}
	
}
