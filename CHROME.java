package Chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CHROME {
	public static void main(String[] args) {
		System.out.println("hai");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitta\\Desktop\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
}
