package ui;

import net.serenitybdd.screenplay.targets.Target;

public class OzPage {
    public static Target book(String book) {
        return Target.the("new books")
                .locatedBy("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/div/ul/li[3]/a");
    }

    public static Target seeBook(String book) {
        return Target.the( "best sellers")
                .locatedBy("/html/body/div[1]/div/div[3]/main/div[2]/div[2]/div/div[1]/div[1]/div[1]/a/span[2]");
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
                .locatedBy("/html/body/div[1]/div/div[3]/div/div/div[1]/form/div[12]/button");
    }

    public static Target SEARCH_RESULT_MURAKAMI = Target
            .the("books Murakami")
            .locatedBy("//ul[@id=\"goods-table\"]");
}
