package co.com.choucair.startsharp.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/startsharp_automation.feature",
        tags = "@stories",
        glue = {"co.com.choucair.startsharp.stepdefinitions","co.com.choucair.startsharp.util"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
