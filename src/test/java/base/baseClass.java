package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class baseClass {
    public WebDriver driver;

    @BeforeClass
    public WebDriver setupApp() throws IOException {
    	File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\data.properties");
        FileInputStream fileInput = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileInput);

        String browser = prop.getProperty("Browser");
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
            this.driver = new ChromeDriver();
            System.out.println("Opened chrome browser");
        } else if (browser.equals("Internet Explorer")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
            this.driver = new InternetExplorerDriver();
            System.out.println("Opened IE browser");
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
            this.driver = new FirefoxDriver();
            System.out.println("Opened Firefox browser");
        } else System.out.println("Browser not supported");

        return driver;
    }

    public void launchUrl() throws IOException {
    	
    	File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\data.properties");
        FileInputStream fileInput = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileInput);
        
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        System.out.println("Launched Url");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }

}
