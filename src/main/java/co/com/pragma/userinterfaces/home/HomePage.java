package co.com.pragma.userinterfaces.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class HomePage extends PageObject {
    public static final Target BTN_MY_ACCOUNT = Target.the("Boton para ingresar al desplegable donde puede iniciar sesion o registrarme").
            located(By.xpath("//span[contains(@class, 'hidden-xs') and contains(@class, 'hidden-sm') and contains(@class, 'hidden-md')][text()='My Account']\n"));
    public static final Target BTN_LOGIN= Target.the("Boton para ingresar al login").
            located(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a"));

}
