package co.com.pragma.task.registrar;

import co.com.pragma.userinterfaces.home.HomePage;
import co.com.pragma.userinterfaces.iniciosesion.IniciaSesionPage;
import co.com.pragma.userinterfaces.registro.RegistroPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pragma.hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {

    String nombre;
    String apellido;
    String telefono;
    String correo;
    String contrasena;
    String confirmar_contrasena;

    public Registro(String nombre, String apellido, String correo, String telefono, String contrasena, String confirmar_contrasena){
        this.nombre= nombre;
        this.apellido= apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.confirmar_contrasena = confirmar_contrasena;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        pragma.attemptsTo(Enter.theValue(nombre).into(RegistroPage.PIMER_NOMBRE),
                Enter.theValue(apellido).into(RegistroPage.APELLIDO),
                Enter.theValue(correo).into(IniciaSesionPage.CAMPO_CORREO),
                Enter.theValue(telefono).into(RegistroPage.TELEFONO),
                Enter.theValue(contrasena).into(IniciaSesionPage.CAMPO_CONTRASENA),
                Enter.theValue(confirmar_contrasena).into(RegistroPage.CONFIRMAR_CONTRASENA));
        pragma.attemptsTo(Click.on(RegistroPage.ACEPTAR_POLITICA),
                Click.on(RegistroPage.BOTON_CONTINUAR));
    }
    public static Registro registro(String nombre, String apellido, String telefono, String correo, String contrasena, String confirmar_contrasena){
        return instrumented(Registro.class, nombre, apellido, telefono, correo, contrasena, confirmar_contrasena);
    }
}
