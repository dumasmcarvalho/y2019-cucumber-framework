package ifsp.bdd.calculadora;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@CalculadoraTeste", 
                 glue = "ifsp.bdd.calculadora", monochrome = true, dryRun = false,
                 plugin = {"pretty", "html:target/cucumber-html-report"})

public class CalculadoraRunner {

}
