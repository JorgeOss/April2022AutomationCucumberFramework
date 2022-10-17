package pages;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkyBluePage {
public WebDriver driver;
	public void SkyBluePage(WebDriver driver) {
		this.driver = driver;
	}
	
//	WebElements
	
	 @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set SkyBlue Background')]")
		WebElement SkyBlueBackgroundButton;
	
	 

	 
	 public void changeColorBlueButton() {
		SkyBlueBackgroundButton.click();
		System.out.println("Clicked on Sky Blue button");

		
	 }
	 
	
}
	 

	

