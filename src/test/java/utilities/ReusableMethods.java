package utilities;


import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static utilities.Driver.appiumDriver;


public class ReusableMethods {

//         public static void tapOnElementWithText(String text) {
//            List<WebElement> mobileElementList =appiumDriver.findElements(AppiumBy.xpath("android.widget.TextView"));
//            for (WebElement page: mobileElementList) {
//                if (page.getText().equals(text)){
//                    page.click();
//                }else{
//                    scrollWithUiScrollable(text);
//                }
//                break;
//            }
//        }

//ikinci alternatif bir method
//        public static void clickOnElementWithText(String elementText) throws InterruptedException {
//            Thread.sleep(4000);
//            List<WebElement> webElements = appiumDriver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='"+elementText+"']");
//            if (webElements.size()>0){
//                webElements.get(0).click();
//            }else scrollWithUiScrollable(elementText);
//        }


    public static boolean isElementPresent(String text) {
        boolean elementFound = false;
        List<WebElement> mobileElementList = appiumDriver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='" + text + "']"));
        for (WebElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, Duration.ofSeconds(10));
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tapOn(WebElement element) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        element.click();
    }

    public static void enterText(WebElement element, String text) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        element.sendKeys(text);
    }

    public static void enterText(WebElement element, String text, boolean needClear) {
        waitToBeClickable(element, Duration.ofSeconds(10));
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }

    public static boolean isElementPresent(WebElement mobileElement) {
        boolean elementFound = false;
        waitToBeVisible(mobileElement, Duration.ofSeconds(10));
        if (mobileElement.isDisplayed()) {
            elementFound = true;
        }
        return elementFound;
    }

    public static void waitToBeVisible(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitToBeClickable(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

//    public static void scrollWithUiScrollable(String elementText) {
//        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
//        tapOn(driver.findElementByXPath("//android.widget.TextView[@text='" + elementText + "']"));
//    }

//    public static void scrollDownToBeVisible(MobileElement element) {
//
//    }
//
//    public static void scrollUpToBeVisible(MobileElement element) {
//
//    }
//
//    public static void swipeFromElementToElement(MobileElement el1, MobileElement el2) {
//
//    }
////attribute check


}
