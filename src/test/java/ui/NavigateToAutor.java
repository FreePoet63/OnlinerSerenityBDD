package ui;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToAutor implements Task {
    private String autor;

    public NavigateToAutor(String autor) {
        this.autor = autor;
    }

    public static Performable of(String autor) {
        return Instrumented.instanceOf(NavigateToAutor.class).withProperties(autor);
    }

    @Override
    @Step("{0} navigates the #autor")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                 Enter.theValue(autor)
                .into(OzPage.seeAutor(autor))
                .thenHit(Keys.ENTER),
                Click.on(OzPage.seeAutor(autor)),
                Click.on(OzPage.takeBook(autor)),
                Scroll.to(OzPage.takeProduct(autor)),
                JavaScriptClick.on(OzPage.takeProduct(autor)),
                WaitUntil.the(OzPage.SEARCH_RESULT_PRODUCT, isVisible()).forNoMoreThan(12).seconds());
    }
}
