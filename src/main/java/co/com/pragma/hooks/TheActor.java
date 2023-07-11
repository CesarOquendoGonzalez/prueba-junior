package co.com.pragma.hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TheActor {

    public static Actor pragma;
    @Managed
    public WebDriver hisBrowser;

    @Before
    public void setTheActor() {
        pragma = Actor.named("pragma");
        pragma.can(BrowseTheWeb.with(hisBrowser));
        WebDriverManager.chromedriver().setup();
    }
}

