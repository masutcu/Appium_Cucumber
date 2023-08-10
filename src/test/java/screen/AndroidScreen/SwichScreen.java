package screen.AndroidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.appiumDriver;

public class SwichScreen {

    public SwichScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBOX;

    @AndroidFindBy(xpath = "//android.widget.Switch[1]")
    public WebElement switch1;

    @AndroidFindBy(xpath = "//android.widget.Switch[2]")
    public WebElement switch2;
}
