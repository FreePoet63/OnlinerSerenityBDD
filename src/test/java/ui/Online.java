package ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@DefaultUrl("https://Oz.by")
public class Online extends PageObject {

    public void openCatalog() {
        WebElementFacade element = $("//a[contains(text(), \"Техника, электроника\")]");
        Actions actions1111 = new Actions(getDriver());
        actions1111.moveToElement(element).build().perform();
    }

    public void openProduct() {
        $("//a[contains(text(), \"Электрочайники, термопоты \")]").click();
    }

    public void chooseKettle() {
        /*List<WebElement> elementius = getDriver().findElements(By.xpath("//ul[@id=\"ul_ti1\"]/li"));
        elementius.get(0).click();*/
        $("//a[text()=\"Чайник\"]").click();
    }

    public void selectLitre() {
        $("//input[@id=\"inp1_f1\"]").type("0.5");
        $("//input[@id=\"inp2_f1\"]").type("2");
    }

    public void housingMaterial() {
        List<WebElement> elementaw = getDriver().findElements(By.xpath("//ul[@id=\"ul_ti2\"]/li"));
        elementaw.get(1).click();
    }

    public void additionalFeatures() {
        List<WebElement> ellle = getDriver().findElements(By.xpath("//ul[@id=\"ul_v3\"]/li"));
        ellle.get(0).click();
    }

    public void priceKettle() {
        $("//input[@id=\"inp1_r_cost\"]").type("30");
        $("//input[@id=\"inp2_r_cost\"]").type("90");
    }

    public void clickButton() {
        $("//button[contains(text(), \"Применить\")]").click();
    }

    public void listKettle() {
        List<WebElement> listElements = getDriver().findElements(By.xpath("//ul[@id=\"goods-table\"]"));
        List<String> listItems = listElements.stream().map(e -> e.getText()).collect(Collectors.toList());
        assertThat(listItems, hasItem(containsString("Электрочайник")));
    }
}
