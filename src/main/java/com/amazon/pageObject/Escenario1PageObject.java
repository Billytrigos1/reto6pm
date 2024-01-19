package com.amazon.pageObject;
import lombok.Getter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("https://www.amazon.com/")
public class Escenario1PageObject extends PageObject{

    By btnAudi = By.xpath("//span[contains(.,'Auriculares')]");
    By btnAñadirAud =By.xpath("//img[@class='s-image'][1]");
    By btnagrecarr = By.xpath("//span[contains(.,'Agregar al Carrito')][1]");
    By btnAñadr2Audi = By.xpath("//span[contains(.,'ASTRO Gaming A50 Wireless Headset + Base Station Gen…')][1]");
    By txtCarro2 =By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]");

}
