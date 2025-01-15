package ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

/**
 * TheCoffee class
 *
 * @author razlivinsky
 * @since 15.01.2025
 */
public class TheCoffee implements Question<List<String>>{

    public static Question<List<String>> displayed() {
        return new TheCoffee();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text
                .of(OzPage.SEARCH_RESULT_PRODUCT)
                .viewedBy(actor)
                .asList();
    }
}