
package pageClasses;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	public class MyPatientsPage {	

		// Capture Elements belonging to this page

		public void MyPatientPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Actions that can be performed on 

	}