package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

public class SigninScreen {
    private AppiumDriver appiumDriver;

    public SigninScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public HomeScreen signin(User clint){
        appiumDriver.findElements(MobileBy.className("android.widget.EditText")).get(0).sendKeys(clint.getEmail());
        appiumDriver.findElements(MobileBy.className("android.widget.EditText")).get(1).sendKeys(clint.getPassword());
        appiumDriver.findElement(MobileBy.xpath("//android.widget.TextView[@text='LOGIN']")).click();
        return new HomeScreen(appiumDriver);

    }
}
