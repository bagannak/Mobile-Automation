package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import models.User;
import org.openqa.selenium.By;

public class SignupScreen {
    private AppiumDriver appiumDriver;

    // The signup screen contains several elements that will be represented as MobileElements.
    // The locators for these elements should be defined only once.


//    By signupBtn = By.className("android.view.ViewGroup");
    public SignupScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    // The signup screen page allows the user to type email, password, fullname
    public HomeScreen signup(User client) {
        appiumDriver.findElements(MobileBy.className("android.widget.EditText")).get(0).sendKeys(client.getEmail());
        appiumDriver.findElements(MobileBy.className("android.widget.EditText")).get(1).sendKeys(client.getPassword());
        appiumDriver.findElements(MobileBy.className("android.widget.EditText")).get(2).sendKeys(client.getFullName());
        appiumDriver.findElements(MobileBy.className("android.view.ViewGroup")).get(0).click();

        // Return the HomeScreen as it navigates to HomeScreen on clicking signup.
        return new HomeScreen(appiumDriver);
    }
}