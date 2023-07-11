package co.com.pragma.questions;

import co.com.pragma.userinterfaces.iniciosesion.ValidarErroresLoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarErroresLogin {
    public static Question<String> NoIngresarDatos() {
        return actor -> Text.of(ValidarErroresLoginPage.ERROR_CAMPOS).asString().answeredBy(actor);
    }
    public static Question<String> DatosErroneos() {
        return actor -> Text.of(ValidarErroresLoginPage.ERROR_CAMPOS).asString().answeredBy(actor);
    }
    public static Question<String> NumeroExcedido() {
        return actor -> Text.of(ValidarErroresLoginPage.ERROR_NUMERO_INTENTOS).asString().answeredBy(actor);
    }
}
