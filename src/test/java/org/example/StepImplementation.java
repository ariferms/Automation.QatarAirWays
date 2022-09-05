package org.example;

import Method.Methods;
import com.thoughtworks.gauge.Step;
import driver.Driver;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.StartApp;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends Methods {
    Methods methods;

    public StepImplementation() {

        methods = new Methods();
    }

    HomePage homePage = new HomePage();
    StartApp startApp = new StartApp();



    @Step("Qatar Airways uygulaması açılır ve açıldığı kontrol edilir")
    public void loginControl() {
        startApp.appStarControl();
    }

    @Step("<duration> saniye bekle")
    public void waitForSkip(int duration) {
        methods.waitBySeconds(duration);
    }

    @Step("1. skip butonunu bul ve tıkla")
    public void skip1() {
        homePage.clikToSkipOne();
    }

    @Step("2. skip butonunu bul ve tıkla")
    public void skip2() {
        homePage.clikToSkipTwo();
    }

    @Step("Decline butonunu bul ve tıkla")
    public void skipDecline() {
        homePage.clikToDecline();
    }

}
