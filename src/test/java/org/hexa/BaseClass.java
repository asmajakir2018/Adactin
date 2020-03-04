package org.hexa;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
	public static WebDriver driver;
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IQBHAL\\eclipse-workspace\\Samp\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);	
	}
	public void fill(WebElement ele, String s1) {
		ele.sendKeys(s1);
	}
	public void click(WebElement ele) {
		ele.click();
		
	}
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	public void dropdown(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
}



