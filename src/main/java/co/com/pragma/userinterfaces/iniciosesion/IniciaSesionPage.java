package co.com.pragma.userinterfaces.iniciosesion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IniciaSesionPage extends PageObject {
    public static final Target CAMPO_CORREO = Target.the("Campo para ingresar el correo electronico").
            located(By.id("input-email"));
    public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar la contrasena").
            located(By.id("input-password"));
    public static final Target BTN_OLVIDE_CONTRASENA = Target.the("Boton para ingresar a la interna de olvide mi contrasena").
            located(By.xpath("//input[@id='input-password']/following-sibling::a[contains(text(), 'Forgotten Password')]"));
    public static final Target BTN_LOGIN = Target.the("Boton para ingresar loguearse una vez se ingresan los datos").
            located(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));



}
