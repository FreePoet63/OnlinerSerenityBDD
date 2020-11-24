package OnlinerBy;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ui.CatalogHomePage;

import java.util.concurrent.TimeUnit;


@RunWith(SerenityRunner.class)
public class OnlinerCategoryTest {

    @Managed(driver = "firefox")
    WebDriver driver;

    @Steps
    CatalogHomePage page;


    @Test
    public void openOnliner() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://Oz.by");
        page.onlineProduct();
        page.onlineOpenProduct();
        page.openParamProd();
        page.openSetProd();
        page.openLabelProd();
        page.typeCoffee();
        page.tunCoffee();
        page.priceMachine();
        page.clickButton();


    }


}