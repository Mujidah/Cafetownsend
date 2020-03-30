package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
    public WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    By username = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[1]/input[1]");
    By password = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[2]/input[1]");
    By emailError = By.xpath("//*contains(text(),'Email is required')");
    By passwordError = By.xpath("//*contains(text(),'Email is required')");
    By invalidCredentialsError = By.xpath("//*contains(text(),'Invalid username or password!')");
    By login = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/button[1]");


    public void enterUsername(String text){
        driver.findElement(username).sendKeys(text);
        System.out.println("Username entered");
    }

    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
        System.out.println("Password entered");
    }
    
    public void clickLogin(){
        driver.findElement(login).click();
        System.out.println("Login button clicked");
    }
    
    public void verifyNoEmailError(){
        driver.findElement(emailError).isDisplayed();
        System.out.println("Email prompt displayed");
    }
    
    public void verifyNoPasswordError(){
        driver.findElement(passwordError).isDisplayed();
        System.out.println("Password prompt displayed");
    }

    public void verifyInvalidCredentialsError(){
        driver.findElement(invalidCredentialsError).isDisplayed();
        System.out.println("Invalid credentials displayed");
    }
    
    public void verifyUsernameField(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).isDisplayed();
        System.out.println("Logged out successfully");
    }

}
