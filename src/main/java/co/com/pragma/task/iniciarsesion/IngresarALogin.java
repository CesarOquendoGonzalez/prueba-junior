package co.com.pragma.task.iniciarsesion;

import co.com.pragma.userinterfaces.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pragma.hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarALogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        pragma.attemptsTo(Click.on(HomePage.BTN_MY_ACCOUNT),
                Click.on(HomePage.BTN_LOGIN));
    }
    public static IngresarALogin ingresarALogin(){
        return instrumented(IngresarALogin.class);
    }
}
