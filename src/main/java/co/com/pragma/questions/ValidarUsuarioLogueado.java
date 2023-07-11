package co.com.pragma.questions;

import co.com.pragma.userinterfaces.iniciosesion.ValidarUsuarioLogueadoPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarUsuarioLogueado {

    public static Question<String> validarUsuarioLogueado() {
        return actor -> Text.of(ValidarUsuarioLogueadoPage.TEXT_EDITAR_CUENTA).asString().answeredBy(actor);
    }
}
