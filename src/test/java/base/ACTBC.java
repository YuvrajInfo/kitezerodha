package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACTBC {
public WebDriver driver;
public void initilizeBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	//maximize
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
