package co.sqasa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/escenario1.feature",
        glue = "co.sqasa.StepDef",
        tags = "@Escenario1",
        snippets = SnippetType.CAMELCASE
)
public class testRunner {
}
