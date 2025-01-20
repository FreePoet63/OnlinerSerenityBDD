package ui;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static ui.OzPage.COOKIE_BANNER_CLOSE_BUTTON;

public class NavigateToOz implements Task {
    private String book;
    OzPage online;

    public NavigateToOz (String book) {
        this.book = book;
    }

    public static Performable books(String book) {
        return Instrumented.instanceOf(NavigateToOz.class).withProperties(book);
    }

    @Override
    @Step("{0} navigates the #books")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(online),
                Click.on(COOKIE_BANNER_CLOSE_BUTTON),
                Click.on(OzPage.book(book)),
                Click.on(OzPage.seeBook(book)));
    }
}
