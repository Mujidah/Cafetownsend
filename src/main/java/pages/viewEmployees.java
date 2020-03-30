package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class viewEmployees {
    public WebDriver driver;

    public viewEmployees(WebDriver driver){
        this.driver = driver;
    }

    By logout = By.xpath("//html[1]/body[1]/div[1]/header[1]/div[1]/p[1]");
    By employee1 = By.xpath("//*[contains(text(),'Mjay Mjay')]");
    By employee2 = By.xpath("//*[contains(text(),'Mj Mj')]");

    public void verifyLogout(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout));
        driver.findElement(logout).isDisplayed();
        System.out.println("Logout button displayed");
    }

    public void logout(){
        driver.findElement(logout).click();
        System.out.println("Logging out...");
    }

    public void verifyEmployees(){
        driver.findElement(employee1).isDisplayed();
        driver.findElement(employee2).isDisplayed();
        System.out.println("Employees displayed");
    }

}
