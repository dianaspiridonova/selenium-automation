import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceDemoTest {

    ChromeDriver driver = new ChromeDriver();

    private final String APP_URL = "https://www.saucedemo.com/v1/";

    @Test
    public void createSauceTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(APP_URL);


        WebElement usernameInputField = driver.findElement(By.id("user-name"));
        usernameInputField.sendKeys("standard_user");

        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();System.out.println();


    }

    @Test
    public void createSauceTest2() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(APP_URL);

        WebElement usernameInputField = driver.findElement(By.id("user-name"));
        usernameInputField.sendKeys("standard_user");

        WebElement passwordInputField = driver.findElement(By.id("password"));
        passwordInputField.sendKeys("");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();System.out.println();
        System.out.println();







    }


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
