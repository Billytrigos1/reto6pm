package co.sqasa.StepDef;
import com.amazon.steps.Escenario1Step;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class TestStepDefinition {
    @Steps
    Escenario1Step escenario1Step;

    /**
     * Esecenario 1 Comprar dos articulos y añadirlos al carrito
     */

    @Dado("^Estar en la pagina de inicio de Amazon$")
    public void estarEnLaPaginaDeInicioDeAmazon() {
     escenario1Step.abrirnavegador();

    }

    @Cuando("^seleccionamos  dos articulos$")
    public void seleccionamosDosArticulos() {
    escenario1Step.clickAudi();
    escenario1Step.clickAñadirAudi();
    escenario1Step.clickAñadiralcarro();
    escenario1Step.clickAudif2();
    escenario1Step.clickAñadiralcarro();
    }

    @Entonces("^visualizar el carrito con dos articulos$")
    public void visualizarElCarritoConDosArticulos() {
    escenario1Step.validarText();
    }

}
