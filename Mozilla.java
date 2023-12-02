package Mozilla;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Mozilla {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vitta\\Desktop\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.quit();
	}
}
