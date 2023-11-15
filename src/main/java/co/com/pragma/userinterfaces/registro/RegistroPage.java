package co.com.pragma.userinterfaces.registro;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class RegistroPage extends PageObject {


    public static final Target PIMER_NOMBRE = Target.the("Campo para ingresar el nombre").
            located(By.id("input-firstname"));
    public static final Target APELLIDO = Target.the("Campo para ingresar el apellido").
            located(By.id("input-lastname"));
    public static final Target TELEFONO = Target.the("Campo para ingresar el telefono").
            located(By.id("input-telephone"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Campo para ingresar la confirmacion de contrasena").
            located(By.name("confirm"));
    public static final Target ACEPTAR_POLITICA = Target.the("Campo para aceptar la politica de privacidad").
            located(By.name("agree"));
    public static final Target BOTON_CONTINUAR = Target.the("Boton para continuar con el proceso").
            located(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
}
