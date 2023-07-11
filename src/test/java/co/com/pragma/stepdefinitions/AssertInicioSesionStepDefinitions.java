package co.com.pragma.stepdefinitions;

import co.com.pragma.interactions.ClicLogin;
import co.com.pragma.questions.ValidarErroresLogin;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.pragma.hooks.TheActor.pragma;
import static co.com.pragma.interactions.ClicLogin.clicLogin;
import static co.com.pragma.questions.ValidarErroresLogin.NoIngresarDatos;
import static co.com.pragma.questions.ValidarErroresLogin.NumeroExcedido;
import static co.com.pragma.task.abrirnavegador.AbrirNavegador.abrirNavegador;
import static co.com.pragma.task.iniciarsesion.IngresarALogin.ingresarALogin;
import static co.com.pragma.task.iniciarsesion.IniciarSesion.ingresaAIniciaSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AssertInicioSesionStepDefinitions {

    @Dado("Que la usuaria avanza hasta la pantalla de login")
    public void queLaUsuariaAvanzaHastaLaPantallaDeLogin() {
        pragma.attemptsTo(abrirNavegador(),
                ingresarALogin());
    }

    @Cuando("no ingrese credenciales {} y {}")
    public void noIngreseCredencialesY(String correo, String contrasena) {
        pragma.attemptsTo(ingresaAIniciaSesion(correo, contrasena));
        pragma.attemptsTo(ClicLogin.clicLogin());
    }
    @Entonces("deberia ver un mensaje de error indicando que se debe ingresar informacion")
    public void deberiaVerUnMensajeDeErrorIndicandoQueSeDebeIngresarInformacion() {
        pragma.should(seeThat(NoIngresarDatos(),equalTo("Warning: No match for E-Mail Address and/or Password.")));
    }

    @Cuando("ingreso un {} no registrado y una {}")
    public void ingresoUnNoRegistradoYUna(String correo, String contrasena) {
        pragma.attemptsTo(ingresaAIniciaSesion(correo, contrasena));
        pragma.attemptsTo(ClicLogin.clicLogin());
    }

    @Entonces("deberia ver un mensaje de error indicando que los datos no coinciden")
    public void deberiaVerUnMensajeDeErrorIndicandoQueLosDatosNoCoinciden() {
        pragma.should(seeThat(NoIngresarDatos(),equalTo("Warning: No match for E-Mail Address and/or Password.")));
    }

    @Cuando("el usuario ingrese un {} y {} errados varias veces")
    public void elUsuarioIngreseUnYErradosDiezVeces(String correo, String contrasena) {
        pragma.attemptsTo(ingresaAIniciaSesion(correo, contrasena));

        int intentos = 0;
        while (intentos < 10) {
            pragma.attemptsTo(clicLogin());
            String mensajeError = ValidarErroresLogin.DatosErroneos().answeredBy(pragma);
            if (mensajeError.equals("Warning: No match for E-Mail Address and/or Password.")) {
                intentos++;
            } else {
                pragma.should(seeThat(NumeroExcedido(), equalTo("Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.")));
                break;
            }
        }

    }

//    @Entonces("deberia ver un mensaje de error indicando que se ha excedido el limite de intentos")
//    public void deberiaVerUnMensajeDeErrorIndicandoQueSeHaExcedidoElLimiteDeIntentos() {
//        pragma.should(seeThat(NumeroExcedido(),equalTo("Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.")));
//    }


}
