package screen.AndroidScreen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static utilities.Driver.appiumDriver;

public class DragAndDropeScreen {
    public DragAndDropeScreen()  {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(30)),this);


    }
    @AndroidFindBy(id ="com.touchboarder.android.api.demos:id/drag_dot_1")
    public WebElement firstDot;
    @AndroidFindBy(id ="com.touchboarder.android.api.demos:id/drag_dot_2")
    public WebElement secondtDot;
    @AndroidFindBy(id ="com.touchboarder.android.api.demos:id/drag_dot_3")
    public WebElement thirdDot;
    @AndroidFindBy(id ="com.touchboarder.android.api.demos:id/drag_dot_hidden")
    public WebElement hiddenDot;

}
