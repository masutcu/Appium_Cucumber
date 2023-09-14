package utilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.time.Duration;

import static hooks.Hook.appiumServer;

public class Driver {

    public  static AppiumDriver appiumDriver;
    public static AppiumDriver getAppiumDriver() {

        int port = 4723;
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://127.0.0.1:4723/");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {


            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            desiredCapabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty("appPath"));
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
            desiredCapabilities.setCapability("shouldTerminateApp", true);

           // System.out.println("desiredCapabilities = " + desiredCapabilities);

            if (ConfigReader.getProperty("platformName").equals("android")) {
                //if you do not provide app path so you should provide "appPackage" and "appActivity"

                desiredCapabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
                desiredCapabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");

                assert appiumServerURL != null;

                try {
                    System.out.println("DİkKATTTTTT   burada baslatmaya calisyoruz");
                    appiumDriver = new AndroidDriver(appiumServerURL, desiredCapabilities);
                    appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
                    System.out.println("appiumDriver = " + appiumDriver);
                } catch (Exception e) {
                    System.out.println("Lanet Driver Baslatilamadi");
                }


            } else if (ConfigReader.getProperty("platformName").equals("iOS")) {
                //if you do not provide app path so you should use "bundleId"
                desiredCapabilities.setCapability("bundleId", ConfigReader.getProperty("iosBundleId"));
                assert appiumServerURL != null;
                appiumDriver = new IOSDriver(appiumServer.getUrl(), desiredCapabilities);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }
        return appiumDriver;
    }


    public static boolean isAppiumServerRunning(String host, int port) {
        try (Socket socket = new Socket(host, port)) {
            return true;
        } catch (IOException e) {
            return false;
        }


    }

    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }

    }
}

