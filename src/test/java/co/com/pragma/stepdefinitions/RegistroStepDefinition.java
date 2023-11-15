package co.com.pragma.stepdefinitions;

import co.com.pragma.task.registrar.Registro;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.pragma.hooks.TheActor.pragma;
import static co.com.pragma.questions.ValidarRegistro.validarRegistro;
import static co.com.pragma.questions.ValidarUsuarioLogueado.validarUsuarioLogueado;
import static co.com.pragma.task.abrirnavegador.AbrirNavegador.abrirNavegador;
import static co.com.pragma.task.iniciarsesion.IngresarALogin.ingresarALogin;
import static co.com.pragma.task.registrar.IngresarARegistro.ingresarARegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegistroStepDefinition {

    @Dado("Que estoy en la pagina principal de Opencart e ingreso al registro")
    public void queEstoyEnLaPaginaPrincipalDeOpencartEIngresoAlRegistro() {
        pragma.attemptsTo(abrirNavegador(),
                ingresarARegistro());
    }

    @Cuando("ingreso los datos necesarios para realizar el registro {}, {}, {},{},{},{}")
    public void ingresoLosDatosNecesariosParaRealizarElRegistro(String nombre, String apellido, String correo, String telefono, String contrasena, String confirmar_contrasena) {

        pragma.attemptsTo(Registro.registro(nombre, apellido, correo, telefono, contrasena, confirmar_contrasena));
    }

    @Entonces("deberia poder ver un mensaje indicando que que la cuenta fue creada")
    public void deberiaPoderVerUnMensajeIndicandoQueQueLaCuentaFueCreada() {
        pragma.should(seeThat(validarRegistro(),equalTo("Congratulations! Your new account has been successfully created!")));
    }
}
