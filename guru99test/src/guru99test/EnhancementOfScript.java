package guru99test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnhancementOfScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys("mngr142992");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("gUqevem");
		
		WebElement loginbutton=driver.findElement(By.name("btnLogin"));
		loginbutton.click();
		
		
		
		WebElement logout=driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a"));
		
		if(logout.isDisplayed()){
			System.out.println("Login successful");
		}else{
			System.out.println("Login not sucessful");
	}

}
}