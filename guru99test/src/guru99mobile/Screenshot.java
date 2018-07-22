package guru99mobile;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");

WebElement Google=driver.findElement(By.id("lst-ib"));
Google.sendKeys("Armstrong"+Keys.ENTER);



File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));

	
	}
}


