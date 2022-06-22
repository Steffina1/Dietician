
package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Capture Elements belonging to this page

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Actions that can be performed on 
}