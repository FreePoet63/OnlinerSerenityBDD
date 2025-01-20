package OnlinerBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ui.NavigateToAutor;
import ui.NavigateToOz;
import ui.TheBooksMurakami;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class OzBookTest {
    private Actor Natasha = Actor.named("Natasha");

    @Managed
    private String Книги;
    private String Мураками;

    @Before
    public void openBrowserTheWebNatasha() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver browser = new FirefoxDriver();
        Natasha.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
    }

    @Test
    public void openTheWebPage() {
        Natasha.attemptsTo(NavigateToOz.books(Книги));
        Natasha.attemptsTo(NavigateToAutor.of("мураками"));
        Natasha.should(seeThat(TheBooksMurakami.displayed(), hasItem(containsString("Норвежский лес"))));
    }
}

