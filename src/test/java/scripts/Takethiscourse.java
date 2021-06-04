package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.SeleniumPage;
import POM.SkillraryLoginPage;
import POM.Takethiscoursepage;
import generlib.BaseClass;

public class Takethiscourse extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serchTextbox(propertyFile.getPropertyfile("coursename"));
		s.serachbutton();
		
		SeleniumPage sel=new SeleniumPage(driver);
		sel.corejavacourse();
		
		Takethiscoursepage t=new Takethiscoursepage(driver);
		utilies.switchFrame(driver);
		t.playbutton();
		Thread.sleep(15000);
		t.pausebutton();
		utilies.switchback(driver);
		Thread.sleep(3000);
		t.takethiscoursebtn();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),propertyFile.getPropertyfile("loginpageurl"));
		
		
		
		
	}

}
