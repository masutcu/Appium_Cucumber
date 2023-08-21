package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import screen.AndroidScreen.*;
import utilities.ReusableMethods;

public class FirstClassSteps extends ReusableMethods {
    Screens screen = new Screens();


    @Given("kullanici ana ekranda")
    public void kullanici_ana_ekranda() throws InterruptedException {

        WebElement element1 = screen.mainScreen().mainScreenTitle;
        Assert.assertTrue(ReusableMethods.isElementPresent(element1));
    }

    @And("kullanici API Demos butununa tikladi")
    public void kullanici_api_demos_butununa_tikladi() throws InterruptedException {


        WebElement bt = screen.mainScreen().apiDemosButton;
        ReusableMethods.tapOn(bt);
    }

    @Then("kullanici API Demos ekraninda")
    public void kullanici_api_demos_ekraninda() throws InterruptedException {


        WebElement Dt = screen.apiDemosScreen().apiDemosTitle;

        Assert.assertTrue(ReusableMethods.isElementPresent(Dt));

    }

    @Then("kullanici Preference butununa tikladi")
    public void kullanici_preference_butununa_tikladi() throws InterruptedException {

        WebElement pr = screen.apiDemosScreen().preference;
        ReusableMethods.tapOn(pr);
    }

    @Then("kullanici Preference ekraninda")
    public void kullanici_preference_ekraninda() throws InterruptedException {

        WebElement pt = screen.preferenceScreen().preferenceScreenTitle;
        ReusableMethods.isElementPresent(pt);
    }

    @Then("kullanici Preference dependencies tikladi")
    public void kullanici_preference_dependencies_tikladi() throws InterruptedException {

        WebElement pd = screen.preferenceScreen().preferenceDependencies;

        ReusableMethods.tapOn(pd);
    }

    @Then("kullanici WiFi check box secmis olacak")
    public void kullanici_wi_fi_check_box_secmis_olacak() {

        if (screen.preferenceDependenciesScreen().checkBox.getAttribute("checked").equals("false")) {

            WebElement ch = screen.preferenceDependenciesScreen().checkBox;
            ReusableMethods.tapOn(ch);
        }

    }

    @Then("kullanici WiFi Settings tikladi")
    public void kullanici_wi_fi_settings_tikladi() {
        WebElement wifi = screen.preferenceDependenciesScreen().wifiSettings;
        ReusableMethods.tapOn(wifi);

    }

    @Then("WiFi setting popup geldi")
    public void wi_fi_setting_popup_geldi() throws InterruptedException {

        WebElement cB = screen.preferenceDependenciesScreen().cancelButton;
        Assert.assertTrue(ReusableMethods.isElementPresent(cB));
    }

    @Then("kullanici {string} yazdi")
    public void kullanici_yazdi(String text) {
        WebElement box = screen.preferenceDependenciesScreen().textBox;
        ReusableMethods.enterText(box, text);
    }

    @Then("kullanci ok butonuna tikladi")
    public void kullanci_ok_butonuna_tikladi() {
        WebElement ok = screen.preferenceDependenciesScreen().okButton;

        ReusableMethods.tapOn(ok);
    }


    @And("kullanici swich buttonuna tiklar")
    public void kullaniciSwichButtonunaTiklar() {

        WebElement sa = screen.preferenceScreen().switchButton;

        ReusableMethods.tapOn(sa);
    }

    @Then("kullanici checkboxin tikli olup olmadigina bakar tikli degil ise tiklar")
    public void kullanicicheckboxintikliolupolmadiginabakartiklidegiltiklar() {
        WebElement cb = screen.switchScreen().checkBOX;

        if(cb.getAttribute("checked").equals("false")){
        ReusableMethods.tapOn(cb);}




    }


    @And("kullanici swich buttonuna kapaliysa acar")
    public void kullaniciSwichButtonunaKapaliysaAcar() {
        WebElement dd = screen.switchScreen().switch1;
        if(dd.getAttribute("checked").equals("false")){
            ReusableMethods.tapOn(dd);
        }


    }


    @And("kullanici swich buttonuna aciksa kapatir")
    public void kullaniciSwichButtonunaAciksaKapatir() {
        WebElement dd1 = screen.switchScreen().switch1;
        if(dd1.getAttribute("checked").equals("true")){
            ReusableMethods.tapOn(dd1);
        }
    }

    @And("kullanici views buttonuna tiklar")
    public void kullaniciViewsButtonunaTiklar() {
        WebElement cd = screen.apiDemosScreen().views;

        ReusableMethods.tapOn(cd);
    }


}
