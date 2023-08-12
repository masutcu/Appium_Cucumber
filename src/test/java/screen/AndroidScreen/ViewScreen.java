package screen.AndroidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.appiumDriver;

public class ViewScreen {
    public ViewScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement Views;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public WebElement DragandDrop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
    public WebElement Expandable;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
    public WebElement CustomAdapter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
    public WebElement PeopleNames;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement Vvviews;

}
