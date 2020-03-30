package appTests;

import base.baseClass;
import RecurringMethod.login;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.viewEmployees;
import java.io.IOException;

public class loginTest extends baseClass{

    @Test(priority = 1)
    public void loginwithNoDetails() throws IOException{
    	System.out.println("Logging in with no username and password");
        launchUrl();
        loginPage login = new loginPage(driver);
        login.clickLogin();
        login.verifyNoEmailError();
        login.verifyNoPasswordError();
    }
    
    @Test(priority = 2)
    public void loginwithInvalidDetails() throws IOException{
    	System.out.println("Logging in with no username and password");
        launchUrl();
        loginPage login = new loginPage(driver);
        login.enterUsername("Mjay");
        login.enterPassword("Mjay");
        login.clickLogin();
        login.verifyInvalidCredentialsError();
    }

    @Test(priority = 3)
    public void testLoginSuccessfully() throws IOException{
    	System.out.println("Logging in with valid username and password");
        launchUrl();
        login login = new login(driver);
        login.successfulLogin();
        viewEmployees employee = new viewEmployees(driver);
        employee.verifyLogout();
    }
}
