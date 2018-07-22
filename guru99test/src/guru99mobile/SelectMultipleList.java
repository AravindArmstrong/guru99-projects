package guru99mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://DEVIBALA//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.manage().window().maximize();
		
		WebElement AdvancedSearch=driver.findElementByXPath("//*[@id='top']/body/div/div/div[3]/div/div[3]/ul/li[3]/a");
		AdvancedSearch.click();
		
		WebElement Name=driver.findElementByName("name");
		Name.sendKeys("Aravind Armstrong");
		
		WebElement Description=driver.findElementByXPath("//*[@id='description']");
		Description.sendKeys("hey there");
		
		WebElement Shortdescription=driver.findElementByName("short_description");
		Shortdescription.sendKeys("hello");
		
		WebElement SKU=driver.findElementByName("sku");
		SKU.sendKeys("welcome");
		
		WebElement Prize=driver.findElementByXPath("//*[@id='price']");
		Prize.sendKeys("20");
		
		WebElement TaxClass=driver.findElementByXPath("//*[@id='tax_class_id']/option[1]");
		Select dropdown=new Select(TaxClass);
		dropdown.selectByVisibleText("Taxable Goods");
		dropdown.selectByVisibleText("Shipping");
		
		WebElement Search=driver.findElementByXPath("//*[@id='form-validate']/div[2]/button/span/span");
		Search.click();
		
		

	}

}
