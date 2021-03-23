package cucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinations",
	    tags="@SuggestionsTextBoxExample",
	    strict=true,
	    monochrome=true,
	    dryRun=false,
	    plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
