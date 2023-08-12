package screen.AndroidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utilities.Driver.appiumDriver;

public class ApiDemosScreen  {
    public ApiDemosScreen()  {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public WebElement apiDemosTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preference;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement views;



}
