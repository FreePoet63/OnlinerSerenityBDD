package ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
                .ofEach(OzPage.SEARCH_RESULT_PRODUCT)
                .answeredBy(actor)
                .stream()
                .map(Objects::toString)
                .collect(Collectors.toList());
    }
}