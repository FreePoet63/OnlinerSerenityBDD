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
import ui.NavigateToCatalog;
import ui.NavigateToCoffee;
import ui.TheCoffee;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class OzCoffeeTest {
    private Actor Natasha = Actor.named("Natasha");

    @Managed
    private String Кофе;
    private String fromPrice = "10";
    private String toPrice = "27";

    @Before
    public void openBrowserTheWebNatasha() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver browser = new FirefoxDriver();
        Natasha.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
    }

    @Test
    public void openTheWebPage() throws InterruptedException {
        Natasha.attemptsTo(NavigateToCatalog.products(Кофе));
        Natasha.attemptsTo(NavigateToCoffee.of(Кофе, fromPrice, toPrice));
        Natasha.should(seeThat(TheCoffee.displayed(), hasItem(containsString("Lavazza. Qualita Rossa"))));
    }
}