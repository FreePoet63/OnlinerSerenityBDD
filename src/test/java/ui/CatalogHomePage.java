package ui;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class CatalogHomePage extends PageObject {
    Online online;

    @Step
    public void openCatalog() {
        online.openCatalog();
    }

    @Step
    public void openProduct() {
        online.openProduct();
    }

    @Step
    public void chooseKettle() {
        online.chooseKettle();
    }

    @Step
    public void selectLitre() {
        online.selectLitre();
    }

    @Step
    public void housingMaterial() {
        online.housingMaterial();
    }

    @Step
    public void additionalFeatures() {
        online.additionalFeatures();
    }

    @Step
    public void priceKettle() {
        online.priceKettle();
    }

    @Step
    public void clickButton() {
        online.clickButton();
    }

    @Step
    public void resultSearchKettle() {
        online.listKettle();
    }
}

