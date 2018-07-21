package guru99TestNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidPasswordName {
	
	@Test
	public void InvalidPassword(){
		System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
	
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys("0100101");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("lkjdfgkbn");
		
		WebElement loginbutton=driver.findElement(By.name("btnLogin"));
		loginbutton.click();
		
		driver.switchTo().alert().accept();
	}

}
