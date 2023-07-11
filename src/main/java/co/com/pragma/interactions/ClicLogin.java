package co.com.pragma.interactions;

import co.com.pragma.userinterfaces.iniciosesion.IniciaSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pragma.hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicLogin implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        pragma.attemptsTo(Click.on(IniciaSesionPage.BTN_LOGIN));
    }
    public static ClicLogin clicLogin(){
        return instrumented (ClicLogin.class);
    }

}
