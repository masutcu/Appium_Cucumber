package screen.AndroidScreen;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import static utilities.Driver.appiumDriver;

public class PreferenceDependenciesScreen  {
    public PreferenceDependenciesScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/button2")
    public WebElement cancelButton;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement textBox;

}
