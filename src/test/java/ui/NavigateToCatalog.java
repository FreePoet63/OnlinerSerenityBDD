package ui;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static ui.OzPage.COOKIE_BANNER_CLOSE_BUTTON;

/**
 * NavigateToCatalog class
 *
 * @author razlivinsky
 * @since 15.01.2025
 */
public class NavigateToCatalog implements Task {
    private String product;
    OzPage online;

    public NavigateToCatalog (String product) {
        this.product = product;
    }

    public static Performable products(String product) {
        return Instrumented.instanceOf(NavigateToCatalog.class).withProperties(product);
    }

    @Override
    @Step("{0} navigates the #product")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(online),
                Click.on(COOKIE_BANNER_CLOSE_BUTTON));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(OzPage.catalog(product).resolveFor(actor)).perform();
    }
}