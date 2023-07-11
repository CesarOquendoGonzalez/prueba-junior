package co.com.pragma.stepdefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.pragma.hooks.TheActor.pragma;
import static co.com.pragma.interactions.ClicLogin.clicLogin;
import static co.com.pragma.questions.ValidarUsuarioLogueado.validarUsuarioLogueado;
import static co.com.pragma.task.abrirnavegador.AbrirNavegador.abrirNavegador;
import static co.com.pragma.task.iniciarsesion.IngresarALogin.ingresarALogin;
import static co.com.pragma.task.iniciarsesion.IniciarSesion.ingresaAIniciaSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IniciaSesionStepDefinition {
    
    @Dado("Que estoy en la pagina principal de Opencart y me encuentro registrado")
    public void queEstoyEnLaPaginaPrincipalDeOpencartYMeEncuentroRegistrado() {
        pragma.attemptsTo(abrirNavegador(),
                ingresarALogin());
    }


    @Cuando("acceda a la pantalla de inicio de sesion e ingresar mi {} y {}")
    public void accedaALaPantallaDeInicioDeSesionEIngresarMiY(String correo, String contrasena) {
        pragma.attemptsTo(clicLogin(),
                ingresaAIniciaSesion(correo, contrasena),
                clicLogin());
    }

    @Entonces("deberia poder ver la opcion de editar cuenta")
    public void deberiaPoderVerLaOpcionDeEditarCuenta() {
        pragma.should(seeThat(validarUsuarioLogueado(),equalTo("Edit Account")));
    }



}
