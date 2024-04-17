package ProfileDriverSetup;


import org.openqa.selenium.WebDriver;
 
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class SetupDriver {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions options1;
	public static WebDriver chromedriver() {
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.nobroker.in/");
		return driver;
	}
	public static WebDriver edgedriver() {
		WebDriverManager.edgedriver().setup();
		options1=new EdgeOptions();
		driver=new ChromeDriver(options);
		driver.get("//https://www.nobroker.in/");
		return driver;
	}
}