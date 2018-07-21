package guru99TestNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnhancementOfScript {
	
	@Test
	public void testEnhancement(){
		System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
		

		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys("mngr142992");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("gUqevem");
		
		WebElement loginbutton=driver.findElement(By.name("btnLogin"));
		loginbutton.click();
		
	}

}
