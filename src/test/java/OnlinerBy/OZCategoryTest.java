package OnlinerBy;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ui.NavigateToAutor;
import ui.NavigateToOz;
import ui.TheBooksMurakami;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class OZCategoryTest {
    private Actor Natasha = Actor.named("Natasha");

    @Managed
    WebDriver browser;
    private String Книги;
    private String Мураками;

    @Before
    public void openbrowseTheWebNatasha() {
        Natasha.can(BrowseTheWeb.with(browser));
    }
    @Test
    public void openTheWebPage() {
        Natasha.attemptsTo(NavigateToOz.books(Книги));
        Natasha.attemptsTo(NavigateToAutor.of("мураками"));
        Natasha.should(seeThat(TheBooksMurakami.displayed(), hasItem(containsString("Норвежский лес"))));
    }
}

