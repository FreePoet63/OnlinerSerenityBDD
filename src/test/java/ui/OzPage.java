package ui;

import net.serenitybdd.screenplay.targets.Target;

public class OzPage {
    public static Target book(String book) {
        return Target.the("new books")
                .locatedBy("//a[text()=\"Книги\"]");
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

    public static Target takeBookMurakami(String autor) {
        return Target.the( "button")
                .locatedBy("//button[text()=\"Применить\"]");
    }

    public static Target SEARCH_RESULT_MURAKAMI = Target
            .the("books Murakami")
            .locatedBy("//ul[@id=\"goods-table\"]");
}
