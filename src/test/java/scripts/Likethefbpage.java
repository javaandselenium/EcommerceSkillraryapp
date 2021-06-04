package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.FaceBookpage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import POM.TestingPage;
import generlib.BaseClass;

public class Likethefbpage extends BaseClass{

	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException  {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillrarydemoapplication();
	
	utilies.switchingTabs(driver);
	
	SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
	utilies.dropDown(d.getTestingdd(),propertyFile.getPropertyfile("coursedd"));
	
	TestingPage t=new TestingPage(driver);
	t.facebookicons();
	
	FaceBookpage f=new FaceBookpage(driver);
	f.Likebtn();
	
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(),propertyFile.getPropertyfile("Facebooktitle"));
	
	
	
	}
}
