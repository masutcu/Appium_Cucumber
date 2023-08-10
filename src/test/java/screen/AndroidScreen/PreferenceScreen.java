package screen.AndroidScreen;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import static utilities.Driver.appiumDriver;

public class PreferenceScreen {
    public PreferenceScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preferenceScreenTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public WebElement preferenceDependencies;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9. Switch']")
    public WebElement switchButton;



}
