package Basic;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactTest {

	@Test
	public void CreateOrganizationTest() {
		
			WebDriver d = new ChromeDriver();
			d.get("http://ajio.com/");
		
	}
}
