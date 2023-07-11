package co.com.pragma.userinterfaces.iniciosesion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarErroresLoginPage extends PageObject {
    public static final Target TEXT_EDITAR_CUENTA = Target.the("Texto para verificar que ha iniciado sesion").
            located(By.xpath("//a[contains(text(), 'Edit Account')]"));
    public static final Target ERROR_CAMPOS = Target.the("Texto para verificar el error que sale en los campos al no ingresarlos o cuando no coinciden").
            located(By.xpath("//div[contains(text(), 'Warning: No match for E-Mail Address and/or Password.')]"));
    public static final Target ERROR_NUMERO_INTENTOS= Target.the("Texto para verificar el numero de intentos fallidos").
            located(By.xpath("//div[@class='alert alert-danger alert-dismissible' and contains(text(), 'Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.')]"));

}
