package ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("https://Oz.by")
public class Online extends PageObject {

    public void openProduct() {
        WebElementFacade element = $("//a[contains(text(), \"Техника, электроника\")]");
        Actions actions1111 = new Actions(getDriver());
        actions1111.moveToElement(element).build().perform();
    }
    public void openProd() {
        $("//a[contains(text(), \"Кофеварки\")]").click();
    }
    public void paramProd() {
        List<WebElement> elementus = getDriver().findElements(By.xpath("//ul[@id=\"ul_id_producer\"]/li"));
        elementus.get(0).click();
    }
    public void openSet() {
        List<WebElement> elementius = getDriver().findElements(By.xpath("//ul[@id=\"ul_ti1\"]/li"));
        elementius.get(0).click();
    }
    public void openLabel() {
        $("//input[@id=\"inp1_f1\"]").type("0.6");
        $("//input[@id=\"inp2_f1\"]").type("2");
    }
    public void openField() {
        $("//input[@id=\"inp1_ti3\"]").type("2");
        $("//input[@id=\"inp2_ti3\"]").type("6");
    }
    public void openCoffee() {
        List<WebElement> elementaw = getDriver().findElements(By.xpath("//ul[@id=\"ul_ti2\"]/li"));
        elementaw.get(0).click();
    }
    public void typeCoffee() {
        List<WebElement> ellle = getDriver().findElements(By.xpath("//ul[@id=\"ul_v3\"]/li"));
        ellle.get(0).click();
    }
    public void tunCoffee() {
        List<WebElement> elCoffee = getDriver().findElements(By.xpath("//ul[@id=\"ul_v4\"]/li"));
        elCoffee.get(2).click();

    }
    public void priceMachine() {
        $("//input[@id=\"inp1_r_cost\"]").type("30");
        $("//input[@id=\"inp2_r_cost\"]").type("320");
    }
    public void clickButton() {
        $("//button[contains(text(), \"Применить\")]").click();
    }


}
