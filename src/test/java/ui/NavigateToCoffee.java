package ui;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

/**
 * NavigateToCoffee class
 *
 * @author razlivinsky
 * @since 15.01.2025
 */
public class NavigateToCoffee implements Task {
    private String coffee;
    private String fromPrice;
    private String toPrice;

    public NavigateToCoffee(String coffee, String fromPrice, String toPrice) {
        this.coffee = coffee;
        this.fromPrice = fromPrice;
        this.toPrice = toPrice;
    }

    public static Performable of(String coffee, String fromPrice, String toPrice) {
        return Instrumented.instanceOf(NavigateToCoffee.class)
                .withProperties(coffee, fromPrice, toPrice);

    }

    @Override
    @Step("{0} navigates the #coffee")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OzPage.openProduct(coffee)),
                Click.on(OzPage.chooseCoffee(coffee)),
                Scroll.to(OzPage.typeGrinding(coffee)),
                JavaScriptClick.on(OzPage.typeGrinding(coffee)),
                Enter.theValue(fromPrice)
                        .into(OzPage.fromPrice(fromPrice))
                        .thenHit(Keys.ENTER),
                Enter.theValue(toPrice)
                        .into(OzPage.toPrice(toPrice))
                        .thenHit(Keys.ENTER),
                Scroll.to(OzPage.takeProduct(coffee)),
                JavaScriptClick.on(OzPage.takeProduct(coffee)));
    }
}