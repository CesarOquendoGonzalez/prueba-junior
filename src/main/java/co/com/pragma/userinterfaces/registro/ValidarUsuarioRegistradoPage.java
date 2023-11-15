package co.com.pragma.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarUsuarioRegistradoPage extends PageObject {
    public static final Target VALIDAR_REGISTRO = Target.the("Texto para validar que se registro al usuario").
            located(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));
}
