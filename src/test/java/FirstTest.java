import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class FirstTest {

	  WebDriver driver=null;

	@Test
	public void main(){
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

	}