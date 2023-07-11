package co.com.pragma.task.iniciarsesion;

import co.com.pragma.userinterfaces.iniciosesion.IniciaSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pragma.hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    String correo;
    String contrasena;

    public IniciarSesion(String correo, String contrasena){
        this.correo= correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        pragma.attemptsTo(
                Enter.theValue(correo).into(IniciaSesionPage.CAMPO_CORREO),
                Enter.theValue(contrasena).into(IniciaSesionPage.CAMPO_CONTRASENA));
    }
    public static IniciarSesion ingresaAIniciaSesion(String correo, String contrasena){
        return instrumented(IniciarSesion.class, correo, contrasena);
    }
}
