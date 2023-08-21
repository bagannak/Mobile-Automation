package org.example;

import driver.DriverCreator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ClientSignupTests {

    @Test
    public void clientShouldBeAbleToSignupSuccessfully() throws MalformedURLException {
        //Arrange
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("deviceName", "Pixel_6");
//        desiredCapabilities.setCapability("automationName", "UiAutomator2");
//        desiredCapabilities.setCapability("app", "app/ul-coach.apk");


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 6");
        caps.setCapability("udid", "emulator-5554"); // You can get it from 'adb devices' command
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "/Users/testvagrant/Downloads/ul-coach.apk"); // Replace with your app's path
        caps.setCapability("appPackage", "com.ultralesson.coach");
        caps.setCapability("appActivity", "com.ultralesson.coach.MainActivity");
//        caps.setCapability("noReset", true);

        AppiumDriver mobileDriver = new DriverCreator().createDriverContext(caps);

        mobileDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            LauncherScreen launcherScreen = new LauncherScreen(mobileDriver); // Assume mobileDriver is created and handy.
        launcherScreen.navToClientSignup();
        launcherScreen.navToLogin();
        User client = new User("testuser04@gmail.com","testuser@04");

        //Act
//        SignupScreen signupScreen = new SignupScreen(mobileDriver);
//        HomeScreen homeScreen = signupScreen.signup(client);

        SigninScreen signinScreen = new SigninScreen(mobileDriver);
        HomeScreen homeScreen =signinScreen.signin(client);

        ProfileScreen profileScreen = homeScreen.navToProfile();
//        User clientProfile = profileScreen.getProfileDetails();

        // Assert
//        Assert.assertEquals(clientProfile.getEmail(), client.getEmail());
//        Assert.assertEquals(clientProfile.getFullName(), client.getFullName());

        // Assume we have called a date utility to supply Today's Date
//        Assert.assertEquals(clientProfile.getMembershipStartDate(), "Today's Date");

    }
}
