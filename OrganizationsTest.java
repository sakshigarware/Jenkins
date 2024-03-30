package Basic;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrganizationsTest {

	@Test
	public void CreateOrganizationTest() {
		WebDriver d = new ChromeDriver();
		d.get("http://localhost:8888/");
	}
}
