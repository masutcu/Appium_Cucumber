package stepDef;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import screen.AndroidScreen.Screens;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.sound.midi.Sequence;
import javax.xml.transform.Source;

import static utilities.Driver.appiumDriver;


public class viewSteps extends ReusableMethods {
    Screens screen = new Screens();



    @Then("kullanici views ekraninda")
    public void kullaniciViewsEkraninda() {
        WebElement ss=screen.viewsScreen().Views;

        Assert.assertTrue(ReusableMethods.isElementPresent(ss));

    }

    @And("kulanici drag and drop buttonuna tikladi")
    public void kulaniciDragAndDropButtonunaTikladi() {
        WebElement dss=screen.viewsScreen().DragandDrop;
        ReusableMethods.tapOn(dss);
    }

    @When("kullanici birinci topu ikici topun ustune brakti")
    public void kullaniciBirinciTopuIkiciTopunUstuneBrakti() {

       Assert.assertTrue(ReusableMethods.isElementPresent(screen.dragAndDropScreen().firstDot));
        Assert.assertTrue(ReusableMethods.isElementPresent(screen.dragAndDropScreen().secondtDot));
        Assert.assertTrue(ReusableMethods.isElementPresent(screen.dragAndDropScreen().thirdDot));


        ReusableMethods.dragAndDrop(appiumDriver,screen.dragAndDropScreen().firstDot,screen.dragAndDropScreen().secondtDot);







    }

    @Then("kullanici dorduncu top gorecek")
    public void kullaniciDorduncuTopGorecek() {
 ReusableMethods.isElementPresent(screen.dragAndDropScreen().hiddenDot);
    }

    @And("kullanici Expandable List buttonuna tiklar")
    public void kullaniciExpandableListButtonunaTiklar() {

        ReusableMethods.tapOn(screen.viewsScreen().Expandable);
    }

    @Then("kullanici Custom Adapter butonuna tikladi")
    public void kullaniciCustomAdapterButonunaTikladi() {
        ReusableMethods.tapOn(screen.viewsScreen().CustomAdapter);
    }

    @And("kullanici People Names buttonuna uzun tikladi")
    public void kullaniciPeopleNamesButtonunaUzunTikladi() {

        ReusableMethods.longTap(appiumDriver,screen.viewsScreen().PeopleNames);
    }

    @And("Scroll")
    public void scroll() {
        ReusableMethods.scroll(appiumDriver);
    }
}
