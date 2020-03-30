package appTests;

import base.baseClass;
import org.testng.annotations.Test;
import RecurringMethod.login;
import java.io.IOException;
import pages.viewEmployees;

public class viewEmployeesTest extends baseClass {

    @Test
    public void viewEmployee() throws IOException{
        System.out.println("Testing view employees");
        launchUrl();
        login login = new login(driver);
        login.successfulLogin();
        viewEmployees employee = new viewEmployees(driver);
        employee.verifyEmployees();
    }
}
