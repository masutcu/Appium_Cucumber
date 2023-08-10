package screen.AndroidScreen;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.Given;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.time.Duration;

import static utilities.Driver.appiumDriver;

public class MainScreen {
    public MainScreen()  {

        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView)")
    public WebElement mainScreenTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public WebElement apiDemosButton;


}
