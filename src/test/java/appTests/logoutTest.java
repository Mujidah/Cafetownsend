package appTests;


import base.baseClass;
import org.testng.annotations.Test;
import RecurringMethod.login;
import pages.viewEmployees;
import pages.loginPage;

import java.io.IOException;

public class logoutTest extends baseClass {

    @Test
    public void logout() throws IOException{
        System.out.println("Testing logout");
        launchUrl();
        login login = new login(driver);
        login.successfulLogin();
        viewEmployees employee = new viewEmployees(driver);
        employee.verifyLogout();
        employee.logout();
        loginPage logIn = new loginPage(driver);
        logIn.verifyUsernameField();
    }
}
