



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
        features={"src/test/resources/features"},
        glue={"Utility"}
        
)

public class Testrunner extends AbstractTestNGCucumberTests {
  
	
}
