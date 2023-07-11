package co.com.pragma.userinterfaces.iniciosesion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarUsuarioLogueadoPage extends PageObject {

    public static final Target TEXT_EDITAR_CUENTA = Target.the("Texto para verificar que ha iniciado sesion").
            located(By.xpath("//a[contains(text(), 'Edit Account')]"));
}
