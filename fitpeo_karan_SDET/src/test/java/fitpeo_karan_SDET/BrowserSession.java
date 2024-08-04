package fitpeo_karan_SDET;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSession {
	public WebDriver driver;
	public void startBrowserSession(String testName){
    //Launching the browser according to the environment
    if (ApplicationsSettings.BROWSER_NAME.equalsIgnoreCase("chrome")) {
        //Using WebDriverManager to launch the browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Chrome Browser started");
        driver.manage().window().maximize();
    } else if (ApplicationsSettings.BROWSER_NAME.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        System.out.println("FireFox Browser started");
    } else {
        System.out.println("Only Chrome and FireFox supported. Please specify browser in src/test/resouces/environment.properties file");
    }
    driver.get(ApplicationsSettings.URL_PATH);

}}
