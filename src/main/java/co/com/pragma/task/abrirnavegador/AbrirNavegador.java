package co.com.pragma.task.abrirnavegador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AbrirNavegador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("http://opencart.abstracta.us/"));
    }

    public static AbrirNavegador abrirNavegador() {

        return instrumented (AbrirNavegador.class);
    }
}
