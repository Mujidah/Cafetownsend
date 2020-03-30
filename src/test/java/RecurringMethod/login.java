package RecurringMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.loginPage;

public class login {
    public WebDriver driver;

    public login(WebDriver driver){
        this.driver = driver;
    }

    public void successfulLogin() throws IOException {
    	
        loginPage login = new loginPage(driver);
        login.enterUsername("Luke");
        login.enterPassword("Skywalker");
        login.clickLogin();

    }
}
