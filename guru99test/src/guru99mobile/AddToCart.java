package guru99mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://live.guru99.com/index.php/");


WebElement mobile=driver.findElementByXPath("//*[@id='nav']/ol/li[1]/a");
mobile.click();

WebElement AddToCart=driver.findElementByXPath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span");
AddToCart.click();


WebElement output=driver.findElementByXPath("//*[@id='top']/body/div/div/div[2]/div/div/div/ul/li/ul/li/span");
String text=driver.findElementByXPath("//*[@id='top']/body/div/div/div[2]/div/div/div/ul/li/ul/li/span").getText();

if(output.isDisplayed()){
	System.out.println(text);
}else{
	System.out.println("cannot add to cart");
}

	}

}
