package testRunner;


import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/Features/"}, // to specify feature file path
		dryRun=false, // to get the missed snippets and to check whether mapping happened
		glue="steps",
		snippets=SnippetType.CAMELCASE, // to convert the method name to java format from ruby
		monochrome = true,// to remove the junk characters
		plugin= {"pretty",
				"html:target/report/result.html", 
				"json:target/report/result.json",
				"junit:targrret/report/result.xml" }, // to get a detailed report in the console
		tags= "@reg" 
		)
public class Runner extends AbstractTestNGCucumberTests {

}
