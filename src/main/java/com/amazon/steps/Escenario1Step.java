package com.amazon.steps;


import com.amazon.pageObject.Escenario1PageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class Escenario1Step {
    Escenario1PageObject escenario1PageObject = new Escenario1PageObject();
    @Step
    public void abrirnavegador(){
        WebDriverManager.chromedriver().setup();
        escenario1PageObject.open();
    }

    @Step
    public void clickAudi() {

        escenario1PageObject.getDriver().findElement(escenario1PageObject.getBtnAudi()).click();
    }


    @Step
    public void clickAñadirAudi() {

        escenario1PageObject.getDriver().findElement(escenario1PageObject.getBtnAñadirAud()).click();
    }

    @Step
    public void clickAñadiralcarro() {

        escenario1PageObject.getDriver().findElement(escenario1PageObject.getBtnagrecarr()).click();
    }

    @Step
    public void clickAudif2() {

        escenario1PageObject.getDriver().findElement(escenario1PageObject.getBtnAñadr2Audi()).click();
    }
    @Step

    public void validarText() {
        Assert.assertThat(escenario1PageObject.getDriver().findElement(escenario1PageObject.getTxtCarro2())
                .isDisplayed(), Matchers.is(true));

    }


}
