package guru99mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillTheCaption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.manage().window().maximize();

		WebElement mobile=driver.findElementByXPath("//*[@id='nav']/ol/li[1]/a");
		mobile.click();

		WebElement AddToCart=driver.findElementByXPath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span");
		AddToCart.click();

		WebElement checkout=driver.findElementByXPath("//*[@id='top']/body/div/div/div[2]/div/div/div/div[1]/ul/li/button/span/span");
		checkout.click();

		WebElement proceed=driver.findElementByXPath("//*[@id='onepage-guest-register-button']/span/span");
		proceed.click();

		WebElement FirstName=driver.findElementById("billing:firstname");
		FirstName.sendKeys("Aravind");

		WebElement LastName=driver.findElementById("billing:lastname");
		LastName.sendKeys("Armstrong");


		WebElement MailId=driver.findElementByXPath("//*[@id='billing:email']");
		MailId.sendKeys("aaarmstrong41@gmail.com");

		WebElement Address=driver.findElementByName("billing[street][]");
		Address.sendKeys("keelavaasal");

		WebElement city=driver.findElementByName("billing[city]");
		city.sendKeys("Thanjavur");

		WebElement state=driver.findElementByXPath("//*[@id='billing:region_id']");
		Select firstdropdown=new Select(state);
		firstdropdown.selectByValue("2");



		WebElement country=driver.findElementByXPath("//*[@id='billing:region_id']");
		Select seconddropdown=new Select(country);
		seconddropdown.selectByValue("AF");

		WebElement Telephone=driver.findElementByXPath("//*[@id='billing:telephone']");
		Telephone.sendKeys("9092983372");

		WebElement ClickContinue=driver.findElementByXPath("//*[@id='billing-buttons-container']/button/span/span");
		ClickContinue.click();
	}

}
