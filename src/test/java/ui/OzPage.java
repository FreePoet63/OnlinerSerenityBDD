package ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://Oz.by")
public class OzPage extends PageObject {
    public static Target book(String book) {
        return Target.the("new books")
                .locatedBy("//a[text()=\"Книги\"]");
    }

    public static Target catalog(String product) {
        return Target.the("products coffee")
                .locatedBy("//a[contains(text(), \"Сладости, напитки\")]");
    }

    public static Target openProduct(String coffee) {
        return Target.the("type coffee")
                .locatedBy("//a[contains(text(), \"Молотый кофе \")]");
    }

    public static Target chooseCoffee(String coffee) {
        return Target.the("Lavazza")
                .locatedBy("//a[text()=\"Lavazza\"]");
    }

    public static Target seeBook(String book) {
        return Target.the( "best sellers")
                .locatedBy("//span[text()=\"Бестселлеры\"]");
    }

    public static Target seeAutor(String autor) {
        return Target.the( "entry field")
                .locatedBy("//input[@id=\"fm-input-ac-id_people\"]");
    }

    public static Target takeBook(String autor) {
        return Target.the("choise Murakami")
                .locatedBy("//ul[@id = \"ui-id-1\"]");
    }

    public static Target takeProduct(String autor) {
        return Target.the( "button")
                .locatedBy("//button[text()=\"Применить\"]");
    }

    public static Target fromPrice(String fromPrice) {
        return Target.the("from price")
                .locatedBy("//input[@id=\"inp1_r_cost\"]");
    }

    public static Target toPrice(String toPrice) {
        return Target.the("to price")
                .locatedBy("//input[@id=\"inp2_r_cost\"]");
    }

    public static Target SEARCH_RESULT_PRODUCT = Target
            .the("result products")
            .locatedBy("//h3[@class=\"product-card__title\"]");

    public static Target COOKIE_BANNER_CLOSE_BUTTON = Target
            .the("cookie")
            .locatedBy("//button[contains(text(), \"Отклонить\")]");

    public static Target typeGrinding(String grinding) {
        return Target.the("midium")
                .locatedBy("//a[text()=\"Средний\"]");
    }
}
