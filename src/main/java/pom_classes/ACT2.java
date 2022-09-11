package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACT2 {
//Declaration
	@FindBy(xpath="//a[@class='userProfileLink username ']")private WebElement UID;
	//initialization
	public ACT2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Declaration
	public String verifyUID() {
		String actID=UID.getText();
		return actID;
		
	}
}
