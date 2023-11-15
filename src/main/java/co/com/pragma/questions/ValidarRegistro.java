package co.com.pragma.questions;

import co.com.pragma.userinterfaces.iniciosesion.ValidarUsuarioLogueadoPage;
import co.com.pragma.userinterfaces.registro.ValidarUsuarioRegistradoPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarRegistro {
    public static Question<String> validarRegistro () {
        return actor -> Text.of(ValidarUsuarioRegistradoPage.VALIDAR_REGISTRO).asString().answeredBy(actor);
    }
}
