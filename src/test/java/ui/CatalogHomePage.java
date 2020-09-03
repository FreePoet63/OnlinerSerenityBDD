package ui;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class CatalogHomePage extends PageObject {
    Online online;

    @Step
    public void openOnline() {
        online.open();
    }
    @Step
    public void onlineProduct() {
        online.openProduct();
    }
    @Step
    public void onlineOpenProduct() {
        online.openProd();
    }
    @Step
    public void openParamProd() {
        online.paramProd();
    }
    @Step
    public void openSetProd() {
        online.openSet();
    }
    @Step
    public void openLabelProd() {
        online.openLabel();
    }
    @Step
    public void openField() {
        online.openField();
    }
    @Step
    public void openCoffee() {
        online.openCoffee();
    }
    @Step
    public void typeCoffee() {
        online.typeCoffee();
    }
    @Step
    public void tunCoffee() {
        online.tunCoffee();
    }
    @Step
    public void priceMachine() {
        online.priceMachine();
    }
    @Step
    public void clickButton() {
        online.clickButton();
    }

}

