package hooks;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.awt.desktop.QuitEvent;
import java.io.IOException;
import java.net.Socket;
import java.time.Duration;

import static utilities.Driver.*;

public class Hook {


    public static AppiumDriverLocalService appiumServer; //= AppiumDriverLocalService.buildDefaultService();

    @Before
    public void setUp() throws InterruptedException {
        //it starts appium server
        forceStopAppiumServer();
       do {
           AppiumServiceBuilder builder = new AppiumServiceBuilder();
           builder
//                        .withAppiumJS(new File("C:\\Users\\Mustafa\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//                        .usingDriverExecutable(new File("C:\\Users\\Mustafa\\.appium\\node_modules\\appium-reporter-plugin\\node_modules\\util-deprecate\\node.js"))
                   .withIPAddress("127.0.0.1")
                   .usingPort(4723)
                   .withTimeout(Duration.ofSeconds(30));
           try {
               appiumServer = AppiumDriverLocalService.buildService(builder);
           } catch (Exception e) {
               System.out.println("Calismadi");
           }

           Thread.sleep(8000);
           try {

               appiumServer.start();
           } catch (Exception e) {
               System.out.println("calismadi");
           }



       }while (!(isAppiumServerRunning("localhost",4723)));

       getAppiumDriver();
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        final byte[] screenshot = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
     appiumDriver.quit();

    }

    public void forceStopAppiumServer() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }






}
