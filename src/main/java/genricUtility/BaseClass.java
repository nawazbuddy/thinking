package genricUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	       
	public WebDriver driver;
	PropertyFile       po=   new PropertyFile();
	@Parameters("browpara")
	@BeforeClass
	public void launch(String browpara) throws Exception
	{
		
	
		if(po.propertiesFile(browpara).equalsIgnoreCase("chrome")) {
		
	
		 driver=new ChromeDriver();
		
			System.out.println("chrome lunch");
	}
		if(po.propertiesFile(browpara).equalsIgnoreCase("firefox")) {
			
			
			 driver=new FirefoxDriver();
			
				System.out.println("firefoxlunch");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void closei() {
		driver.close();
	}
	

}
