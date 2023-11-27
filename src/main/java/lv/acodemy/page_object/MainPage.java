package lv.acodemy.page_object;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

    ChromeDriver driver;

    public MainPage(ChromeDriver driver) {
        this.driver = driver;
    }

    private final By addStudentButton = By.id("addStudentButton");

    public void openAddStudentForm() {
        driver.findElement(addStudentButton).click();


    }
}