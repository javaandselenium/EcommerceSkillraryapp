package generlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile propertyFile=new Propertyfile();
	public WebDriverUtilies utilies=new WebDriverUtilies();
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(propertyFile.getPropertyfile("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
			Screenshot s=new Screenshot();
			s.getscreenshot(driver, name);
		}
		driver.quit();
	}}
	
	


