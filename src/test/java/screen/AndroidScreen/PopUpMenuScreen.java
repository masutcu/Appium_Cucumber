package screen.AndroidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import static utilities.Driver.appiumDriver;
public class PopUpMenuScreen {
    public PopUpMenuScreen()  {

        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath= "//android.widget.Button")
    public WebElement makeAPopUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search']")
    public WebElement searchPup;

}
